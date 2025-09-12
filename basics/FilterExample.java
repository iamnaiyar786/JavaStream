package basics;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
public class FilterExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        //Returns a mutable List (usually an ArrayList).
        //You can add/remove elements from the resulting list.
        List<String> nameList1 = Arrays.stream(names)
                                    .collect(Collectors.toList());  //After Java 8 to Java 15
        System.out.println(nameList1);

        //Returns an unmodifiable List (cannot add/remove elements).
        //Simpler and more concise.
        List<String> nameList2= Arrays.stream(names).toList();  //Java 16 and later
        System.out.println(nameList2);


        //Filter names starting with 'A'
        List<String> filteredNames = nameList1.stream()
                                        .filter(name -> name.startsWith("A"))
                                        .collect(Collectors.toList());
        System.out.println(filteredNames);

        //Filter out null and empty strings
        List<String> withNulls = Arrays.asList("Alice", null, "Bob", "", "Charlie");
        List<String> nonNull = withNulls.stream()
                                        .filter(Objects::nonNull)
                                        .filter(s -> !s.isEmpty())
                                        .collect(Collectors.toList());
        System.out.println(nonNull);

        //Filter with multiple conditions
        List<String> multiFilter = nameList1.stream()
                                            .filter(name -> name.startsWith("A") && name.length() > 3)
                                            .collect(Collectors.toList());
        System.out.println(multiFilter);

        //Filter names with length greater than 3
        List<String> longNames = nameList1.stream()
                                        .filter(name -> name.length() > 3)
                                        .collect(Collectors.toList());
        System.out.println(longNames);

        //Filter distinct names (remove duplicates)
        List<String> distinctFiltered = nameList1.stream()
                                        .filter(name -> name.contains("e"))
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println(distinctFiltered);

        //Using Predicate for filtering
        Predicate<String> startsWithA = name -> name.startsWith("A");   
        List<String> filtered = nameList1.stream()
                                        .filter(startsWithA)
                                        .collect(Collectors.toList());  
        System.out.println(filtered);

        //Filter names containing the letter 'e'
        List<String> namesWithE = nameList1.stream()
                                        .filter(name -> name.toLowerCase().contains("e"))
                                        .collect(Collectors.toList());
        System.out.println(namesWithE);

        //Filter names ending with 'e'
        List<String> namesEndingWithE = nameList1.stream()                                  
                                        .filter(name -> name.toLowerCase().endsWith("e"))
                                        .collect(Collectors.toList());
        System.out.println(namesEndingWithE);

        //Now Working with list of Objects
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("David", 28),
            new Person("Eve", 22)
        );

        //Filter people older than 28
        List<Person> olderThan28 = people.stream()
                                        .filter(person -> person.getAge() > 28)
                                        .collect(Collectors.toList());
        System.out.println(olderThan28);

        //Filter people whose names start with 'C'
        List<Person> namesStartingWithC = people.stream()
                                        .filter(person -> person.getName().startsWith("C"))
                                        .collect(Collectors.toList());
        System.out.println(namesStartingWithC);

    }
}