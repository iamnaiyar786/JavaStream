package basics;
import java.util.*;
import java.util.stream.*;
public class CollectExample {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Convert array to List
        List<String> nameList = Arrays.stream(names).toList();  //Java 16 and later
        System.out.println(nameList);   

        // Collect to Set
        Set<String> nameSet = nameList.stream()
                                    .collect(Collectors.toSet());
        System.out.println(nameSet);

        // Collect to Map (name -> length)
        Map<String, Integer> nameLengthMap = nameList.stream()
                                                    .collect(Collectors.toMap(
                                                        name -> name,
                                                        name -> name.length()
                                                    ));
        System.out.println(nameLengthMap);

        // Group by length
        Map<Integer, List<String>> groupedByLength = nameList.stream()
                                                            .collect(Collectors.groupingBy(s->s.length()));
        System.out.println(groupedByLength);

        // Joining names with ", "
        String joinedNames = nameList.stream()
                                    .collect(Collectors.joining(", "));
        System.out.println(joinedNames);

        // Custom collector: Collect names to a TreeSet
        TreeSet<String> treeSet = nameList.stream()
                                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeSet);
    }
}
