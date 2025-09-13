import java.util.*;
import java.util.stream.*;

public class FlatMapExample {
    public static void main(String[] args) {
        // Example 1: Split words into characters and flatten
        String[] words = {"Hello", "World"};
        List<String> charList = Arrays.stream(words)
                                    .flatMap(word -> Arrays.stream(word.split("")))
                                    .collect(Collectors.toList());
        System.out.println(charList); // [H, e, l, l, o, W, o, r, l, d]

        // Example 2: Flatten a list of lists of integers
        List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
        );
        List<Integer> flatList = listOfLists.stream()
                                    .flatMap(Collection::stream)
                                    .collect(Collectors.toList());
        System.out.println(flatList); // [1, 2, 3, 4, 5, 6, 7, 8]

        // Example 3: FlatMap with list of objects (Person with hobbies)
        List<Person> people = Arrays.asList(
            new Person("Alice", Arrays.asList("Reading", "Swimming")),
            new Person("Bob", Arrays.asList("Cycling")),
            new Person("Charlie", Arrays.asList("Running", "Gaming", "Cooking"))
        );
        // Get all hobbies from all people
        List<String> allHobbies = people.stream()
                                    .flatMap(person -> person.getHobbies().stream())
                                    .collect(Collectors.toList());
        System.out.println(allHobbies); // [Reading, Swimming, Cycling, Running, Gaming, Cooking]

        // Example 4: FlatMap sentences to words, then flatten
        List<String> sentences = Arrays.asList("Java is fun", "Streams are powerful");
        List<String> wordsList = sentences.stream()
                                    .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                                    .collect(Collectors.toList());
        System.out.println(wordsList); // [Java, is, fun, Streams, are, powerful]
    }
}

// Helper class for Example 3
