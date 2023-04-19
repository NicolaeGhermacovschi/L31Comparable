package person;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PersonService {

    public void personTask() {
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(new Person("Nicolae",65));
        personSet.add(new Person("Ion",45));
        personSet.add(new Person("Petru",19));
        personSet.add(new Person("Vasile",22));
        personSet.add(new Person("Vlad",25));
        for (Person peson: personSet) {
            System.out.println(peson.toString());
        }
        System.out.println("inainte de sortare");

        personSet.stream()
                .sorted((p1,p2) ->p1.getAge() - p2.getAge())
                .collect(Collectors.toList());
        for (Person peson: personSet) {
            System.out.println(peson.toString());
        }
    }
}
