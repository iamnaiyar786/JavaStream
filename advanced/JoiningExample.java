import java.util.*;
import java.util.stream.Collectors;
public class JoiningExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API", "Example");

        // Join the words into a single string separated by commas
        String joined = words.stream()
            .collect(Collectors.joining(", "));

        System.out.println("Joined string: " + joined);
        
    }
}