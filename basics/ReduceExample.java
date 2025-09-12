package basics;
import java.util.*;
public class ReduceExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Convert array to List
        List<String> nameList = Arrays.stream(names).toList();  //Java 16 and later
        System.out.println(nameList);   

        // Concatenate names into a single string
        String concatenatedNames = nameList.stream()
                                        .reduce("", (a, b) -> a + b);
        System.out.println(concatenatedNames); // AliceBobCharlieDavidEve

        // Find the longest name
        String longestName = nameList.stream()
                                    .reduce((a, b) -> a.length() >= b.length() ? a : b)
                                    .orElse("");
        System.out.println(longestName); // Charlie

        // Sum of lengths of all names
        int totalLength = nameList.stream()
                                .mapToInt(s->s.length())
                                .sum();
        System.out.println(totalLength); // 19

        // Count names starting with 'A'
        long countA = nameList.stream()
                            .filter(name -> name.startsWith("A"))
                            .count();
        System.out.println(countA); // 1

        // Find minimum length name
        String minLengthName = nameList.stream()
                                    .reduce((a, b) -> a.length() <= b.length() ? a : b)
                                    .orElse("");
        System.out.println(minLengthName); // Bob

        // Find maximum length name
        String maxLengthName = nameList.stream()
                                    .reduce((a, b) -> a.length() >= b.length() ? a : b)
                                    .orElse("");
        System.out.println(maxLengthName); // Charlie

        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 28),
            new Person("Eve", 22)
        );

        // Total age of all people
        int totalAge = people.stream()
                            .mapToInt(p->p.getAge())
                            .sum();
        System.out.println(totalAge); // 140

        // Find oldest person
        Person oldest = people.stream()
                            .reduce((p1, p2) -> p1.getAge() >= p2.getAge() ? p1 : p2)
                            .orElse(null);
        System.out.println(oldest); // Person{name='Charlie', age=35}
    }
    
}
