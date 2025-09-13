import java.util.*;
import java.util.stream.*;
public class GroupingByExample {
    public static void main(String[] args) {
        // Example 1: Grouping strings by their length
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi", "grape", "fig", "blueberry");
        Map<Integer, List<String>> groupedByLength = words.stream()
                                                          .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
        // {3=[fig], 4=[pear, kiwi], 5=[apple, grape], 6=[banana], 9=[blueberry]}

        // Example 2: Grouping integers by even and odd
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, List<Integer>> groupedByEvenOdd = numbers.stream()
                                                             .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"));
        System.out.println(groupedByEvenOdd);
        // {Odd=[1, 3, 5, 7, 9], Even=[2, 4, 6, 8, 10]}

        // Example 3: Grouping custom objects (Person) by name length
        List<Person> people = Arrays.asList(
            new Person("Alice", Arrays.asList("Reading", "Swimming")),
            new Person("Bob", Arrays.asList("Cycling")),
            new Person("Charlie", Arrays.asList("Running", "Gaming", "Cooking"))
        );
        Map<Integer, List<Person>> groupedByNameLength = people.stream()
                                                               .collect(Collectors.groupingBy(person -> person.getName().length()));
        groupedByNameLength.forEach((length, personList) -> {
            System.out.println("Name Length: " + length);
            personList.forEach(person -> System.out.println(" - " + person.getName()));
        });
        // Name Length: 3
        //  - Bob
        // Name Length: 5
        //  - Alice
        // Name Length: 7
        //  - Charlie

        // Example 4: Grouping strings by their first character
        List<String> fruits = Arrays.asList("apple", "apricot", "banana", "blueberry", "cherry", "date");
        Map<Character, List<String>> groupedByFirstChar = fruits.stream()
                                                                .collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));
        System.out.println(groupedByFirstChar);
        // {a=[apple, apricot], b=[banana, blueberry], c=[cherry], d=[date]}

        

    }
        
}
