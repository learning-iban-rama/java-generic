package generic.application;

import generic.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {
        Person[] people = {
                new Person("syaiban", "indonesia"),
                new Person("ahmad", "indonesia"),
                new Person("ramadhan", "indonesia"),
        };

        Comparator<Person> personComparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, personComparator);
        System.out.println(Arrays.toString(people));
    }

}
