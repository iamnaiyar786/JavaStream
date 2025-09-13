package parallel;

public class ParallelStreamExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Using parallel stream to process a large range of numbers
        long sum = java.util.stream.LongStream.rangeClosed(1, 1_000_000_000)
                .parallel() // Enable parallel processing
                .sum();

        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");
    }

    
    
}
