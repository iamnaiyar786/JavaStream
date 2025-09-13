import java.util.*;
import java.util.stream.*;
public class SortingExample {
    public static void main(String[] args) {
        // Example 1: Sort a list of integers in ascending order
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        List<Integer> sortedNumbers = numbers.stream()
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println(sortedNumbers); // [1, 2, 3, 5, 8]

        // Example 2: Sort a list of strings in alphabetical order
        List<String> strings = Arrays.asList("Banana", "Apple", "Orange", "Mango");
        List<String> sortedStrings = strings.stream()
                                            .sorted()
                                            .collect(Collectors.toList());
        System.out.println(sortedStrings); // [Apple, Banana, Mango, Orange]

        // Example 3: Sort a list of custom objects (Person) by age
        List<Person> people = Arrays.asList(
            new Person("Alice", Arrays.asList("Reading", "Swimming")),
            new Person("Bob", Arrays.asList("Cycling")),
            new Person("Charlie", Arrays.asList("Running", "Gaming", "Cooking"))
        );
        List<Person> sortedPeople = people.stream()
                                          .sorted(Comparator.comparing(Person::getName))
                                          .collect(Collectors.toList());
        sortedPeople.forEach(person -> System.out.println(person.getName()));
        // Alice
        // Bob
        // Charlie

        // Example 4: Sort a list of strings in reverse alphabetical order
        List<String> reverseSortedStrings = strings.stream()
                                                   .sorted(Comparator.reverseOrder())
                                                   .collect(Collectors.toList());
        System.out.println(reverseSortedStrings); // [Orange, Mango, Banana, Apple]
    }
}
