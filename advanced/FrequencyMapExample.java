import java.util.*;
import java.util.stream.Collectors;
public class FrequencyMapExample {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana", "apple");

        // Create a frequency map where the key is the item and the value is the count of occurrences
        Map<String, Long> frequencyMap = items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()));

        frequencyMap.forEach((item, count) -> 
            System.out.println(item + ": " + count));
    }
}
