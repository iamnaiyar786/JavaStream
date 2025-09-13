import java.util.*;
import java.util.stream.Collectors;
public class ToMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");
        
        // Create a map where the key is the word and the value is the length of the word
        Map<String, Integer> wordLengthMap = words.stream()
            .collect(Collectors.toMap(
                word -> word,
                word -> word.length()
            ));

        System.out.println("Word to length map: " + wordLengthMap);
    }
}