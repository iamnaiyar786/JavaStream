import java.util.*;
class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
    public String getName() {
        return name;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    public void setName(String name) {
        this.name = name;
    }

}