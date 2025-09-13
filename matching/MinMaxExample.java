import java.util.*;
public class MinMaxExample {
    public static void main(String[] args) {
        // Example 1: Find the minimum number in a list
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 4);
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        minNumber.ifPresent(min -> System.out.println("Minimum number: " + min)); // 1

        // Example 2: Find the maximum number in a list
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        maxNumber.ifPresent(max -> System.out.println("Maximum number: " + max)); // 8

        // Example 3: Find the person with the minimum age
        List<Person> people = Arrays.asList(
            new Person("Alice", Arrays.asList("Reading", "Swimming")),
            new Person("Bob", Arrays.asList("Cycling")),
            new Person("Charlie", Arrays.asList("Running", "Gaming", "Cooking"))
        );
        Optional<Person> personWithMinHobbies = people.stream()
            .min(Comparator.comparingInt(person -> person.getHobbies().size()));
        personWithMinHobbies.ifPresent(person -> 
            System.out.println("Person with minimum hobbies: " + person.getName())); // Bob

        // Example 4: Find the person with the maximum age
        Optional<Person> personWithMaxHobbies = people.stream()
            .max(Comparator.comparingInt(person -> person.getHobbies().size()));
        personWithMaxHobbies.ifPresent(person -> 
            System.out.println("Person with maximum hobbies: " + person.getName())); // Charlie

    }
}
