import java.util.*;
import java.util.stream.*;
public class DistinctLimitSkipExample {
    public static void main(String[] args) {
        // Example 1: Distinct elements from a list with duplicates
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                                                            .distinct()
                                                            .collect(Collectors.toList());
        System.out.println(distinctNumbers); // [1, 2, 3, 4, 5]

        // Example 2: Limit the number of elements in a stream
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        List<String> limitedNames = names.stream()
                                         .limit(3)
                                         .collect(Collectors.toList());
        System.out.println(limitedNames); // [Alice, Bob, Charlie]

        // Example 3: Skip the first N elements in a stream
        List<String> skippedNames = names.stream()
                                         .skip(2)
                                         .collect(Collectors.toList());
        System.out.println(skippedNames); // [Charlie, David, Eve]

        // Example 4: Combine distinct, limit, and skip
        List<Integer> combinedExample = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7);
        List<Integer> result = combinedExample.stream()
                                             .distinct() // Remove duplicates
                                             .skip(2)   // Skip first two distinct elements
                                             .limit(3)  // Limit to next three elements
                                             .collect(Collectors.toList());
        System.out.println(result); // [3, 4, 5]
    }
}
