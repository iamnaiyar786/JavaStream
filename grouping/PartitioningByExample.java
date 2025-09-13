import java.util.*;
import java.util.stream.*;
public class PartitioningByExample {
    public static void main(String[] args) {
        // Example 1: Partitioning integers into even and odd
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitionedByEvenOdd = numbers.stream()
                                                                  .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(partitionedByEvenOdd);
        // {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}

        // Example 2: Partitioning strings based on length greater than 4
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi", "grape", "fig", "blueberry");
        Map<Boolean, List<String>> partitionedByLength = words.stream()
                                                              .collect(Collectors.partitioningBy(word -> word.length() > 4));
        System.out.println(partitionedByLength);
        // {false=[pear, kiwi, fig], true=[apple, banana, grape, blueberry]}

        // Example 3: Partitioning custom objects (Person) by number of hobbies
        List<Person> people = Arrays.asList(
            new Person("Alice", Arrays.asList("Reading", "Swimming")),
            new Person("Bob", Arrays.asList("Cycling")),
            new Person("Charlie", Arrays.asList("Running", "Gaming", "Cooking"))
        );
        Map<Boolean, List<Person>> partitionedByHobbies = people.stream()
                                                                .collect(Collectors.partitioningBy(person -> person.getHobbies().size() > 1));
        partitionedByHobbies.forEach((hasMultipleHobbies, personList) -> {
            System.out.println(hasMultipleHobbies ? "Has multiple hobbies:" : "Has one or no hobby:");
            personList.forEach(person -> System.out.println(" - " + person.getName()));
        });
        // Has one or no hobby:
        //  - Bob
        // Has multiple hobbies:
        //  - Alice
        //  - Charlie

        // Example 4: Partitioning strings based on whether they start with a vowel
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry", "date");
        Map<Boolean, List<String>> partitionedByVowelStart = fruits.stream()
                                                                 .collect(Collectors.partitioningBy(fruit -> "AEIOUaeiou".indexOf(fruit.charAt(0)) != -1)); 
        System.out.println(partitionedByVowelStart);

        // {false=[banana, blueberry, cherry, date], true=[apple, apricot]} 
    }

}
