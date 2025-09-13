import java.util.*;
import java.util.stream.*;
public class SummarizingExample {
    public static void main(String[] args) {
        // Example 1: Summarizing a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers.stream()
                                            .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        // Count: 10
        // Sum: 55
        // Min: 1
        // Max: 10
        // Average: 5.5

        // Example 2: Summarizing a list of custom objects (Person with age)
        List<Person> people = Arrays.asList(
            new Person("Alice", Arrays.asList("Reading", "Swimming")),
            new Person("Bob", Arrays.asList("Cycling")),
            new Person("Charlie", Arrays.asList("Running", "Gaming", "Cooking"))
        );
        IntSummaryStatistics ageStats = people.stream()
                                              .collect(Collectors.summarizingInt(person -> person.getName().length()));
        System.out.println("Count: " + ageStats.getCount());
        System.out.println("Sum of name lengths: " + ageStats.getSum());
        System.out.println("Min name length: " + ageStats.getMin());
        System.out.println("Max name length: " + ageStats.getMax());
        System.out.println("Average name length: " + ageStats.getAverage());
        // Count: 3
        // Sum of name lengths: 15
        // Min name length: 3
        // Max name length: 7
        // Average name length: 5.0

        // Example 3: Summarizing a list of doubles
        List<Double> prices = Arrays.asList(19.99, 29.99, 9.99, 49.99, 39.99);
        DoubleSummaryStatistics priceStats = prices.stream()
                                                   .collect(Collectors.summarizingDouble(Double::doubleValue)); 
        System.out.println("Count: " + priceStats.getCount());
        System.out.println("Sum: " + priceStats.getSum());
        System.out.println("Min: " + priceStats.getMin());
        System.out.println("Max: " + priceStats.getMax());
        System.out.println("Average: " + priceStats.getAverage());
        // Count: 5
        // Sum: 149.95
        // Min: 9.99
        // Max: 49.99
        // Average: 29.99

        // Example 4: Summarizing a list of longs
        List<Long> distances = Arrays.asList(100L, 200L, 150L, 300L, 250L);
        LongSummaryStatistics distanceStats = distances.stream()
                                                        .collect(Collectors.summarizingLong(Long::longValue));
        System.out.println("Count: " + distanceStats.getCount());
        System.out.println("Sum: " + distanceStats.getSum());   
        System.out.println("Min: " + distanceStats.getMin());
        System.out.println("Max: " + distanceStats.getMax());
        System.out.println("Average: " + distanceStats.getAverage());
        // Count: 5
        // Sum: 1000        
        // Min: 100
        // Max: 300
        // Average: 200.0

    }
}
