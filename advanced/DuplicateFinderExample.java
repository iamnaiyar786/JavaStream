import java.util.*;
import java.util.stream.Collectors;
public class DuplicateFinderExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "kiwi", "banana");
        
        // Find duplicate items in the list
        Set<String> duplicates = items.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
        
        System.out.println("Duplicate items: " + duplicates);
    }
}
