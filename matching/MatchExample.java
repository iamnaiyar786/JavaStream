import java.util.*;
public class MatchExample {
    public static void main(String[] args) {
        // Example 1: Check if all numbers are positive
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean allPositive = numbers.stream().allMatch(num -> num > 0);
        System.out.println("All numbers are positive: " + allPositive); // true

        // Example 2: Check if any string starts with "A"
        List<String> words = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        boolean anyStartsWithA = words.stream().anyMatch(word -> word.startsWith("A"));
        System.out.println("Any word starts with 'A': " + anyStartsWithA); // true

        // Example 3: Check if no number is negative
        List<Integer> mixedNumbers = Arrays.asList(1, -2, 3, 4, -5);
        boolean noneNegative = mixedNumbers.stream().noneMatch(num -> num < 0);
        System.out.println("No numbers are negative: " + noneNegative); // false

        // Example 4: Check if any person has more than 2 hobbies
        List<Person> people = Arrays.asList(
            new Person("Alice", Arrays.asList("Reading", "Swimming")),
            new Person("Bob", Arrays.asList("Cycling")),
            new Person("Charlie", Arrays.asList("Running", "Gaming", "Cooking"))
        );  
        boolean anyWithManyHobbies = people.stream().anyMatch(person -> person.getHobbies().size() > 2);
        System.out.println("Any person has more than 2 hobbies: " + anyWithManyHobbies); // true

    }
}
