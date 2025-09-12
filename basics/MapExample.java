package basics;
import java.util.*;
public class MapExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Convert array to List
        List<String> nameList = Arrays.stream(names).toList();  //Java 16 and later
        System.out.println(nameList);   

        // Convert names to uppercase
        List<String> upperNames = nameList.stream()
                                        .map(s->s.toUpperCase())
                                        .toList();
        System.out.println(upperNames);

        // Get lengths of names
        List<Integer> nameLengths = nameList.stream()
                                        .map(s->s.length())
                                        .toList(); 
        System.out.println(nameLengths);

        // Append "!" to each name
        List<String> excitedNames = nameList.stream()   
                                        .map(s->s + "!")
                                        .toList();
        System.out.println(excitedNames);

        // Convert names to lowercase
        List<String> lowerNames = nameList.stream()
                                        .map(s->s.toLowerCase())
                                        .toList();
        System.out.println(lowerNames);

        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 28),
            new Person("Eve", 22)
        );

        // Convert to custom string
        List<String> descriptions = people.stream()
                                        .map(p -> p.getName() + " is " + p.getAge() + " years old")
                                        .toList();
        System.out.println(descriptions); // [Alice is 30 years old, ...]

        // Get ages
        List<Integer> ages = people.stream()
                                .map(p->p.getAge())
                                .toList();
        System.out.println(ages); // [30, 25, 35, 28, 22]

        // Increase age by 1
        List<Person> olderPeople = people.stream()
                                        .map(p -> new Person(p.getName(), p.getAge() + 1))
                                        .toList();
        System.out.println(olderPeople); // [Person{name='Alice', age=31}, ...]

        // Get initials
        List<String> initials = people.stream()
                                    .map(p -> p.getName().substring(0, 1))
                                    .toList();
        System.out.println(initials); // [A, B, C, D, E]
    }
}
