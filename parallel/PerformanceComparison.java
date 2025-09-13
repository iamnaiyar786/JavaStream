package parallel;

public class PerformanceComparison {
    public static void main(String[] args) {
        long startTime, endTime;

        // Sequential processing
        startTime = System.currentTimeMillis();
        long sequentialSum = java.util.stream.LongStream.rangeClosed(1, 1_000_000_000)
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("Sequential Sum: " + sequentialSum);
        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

        // Parallel processing
        startTime = System.currentTimeMillis();
        long parallelSum = java.util.stream.LongStream.rangeClosed(1, 1_000_000_000)
                .parallel()
                .sum();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel Sum: " + parallelSum);
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");
    }
    
}
