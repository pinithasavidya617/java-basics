package Day8;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SpecialBlockingQueue {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        // Producer Thread
        Thread producer = new Thread(() -> {
            try {
                // Step 1: Queue empty → add A
                System.out.println("Producing A");
                queue.put("A");   // queue = [A]

                // Step 2: Still space → add B
                System.out.println("Producing B");
                queue.put("B");   // queue = [A, B] (FULL now)

                // Step 3: Try to add C
                System.out.println("Producing C (will wait if full)");

                // ⚠ At this exact point:
                // - If queue still full → thread BLOCKS here
                // - If consumer already removed A → space exists → NO BLOCK

                queue.put("C");   // waits ONLY if queue is still [A, B]

                // This line executes ONLY AFTER space becomes available
                System.out.println("Produced C");  // queue = [B, C]

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                // Delay to TRY to let producer fill queue first
                Thread.sleep(2000);

                // Step 4: Remove first element
                System.out.println("Consuming " + queue.take());
                // removes A → queue = [B]

                // ⚠ IMPORTANT:
                // The moment A is removed,
                // producer (if blocked) immediately continues and inserts C

                Thread.sleep(2000);

                // Step 5: Remove next
                System.out.println("Consuming " + queue.take());
                // removes B → queue = [C]

                Thread.sleep(2000);

                // Step 6: Remove last
                System.out.println("Consuming " + queue.take());
                // removes C → queue = []

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}