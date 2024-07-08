package generic.application;

import generic.Person;

import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {
        Person[] people = {
                new Person("syaiban", "indonesia"),
                new Person("ahmad", "indonesia"),
                new Person("ramadhan", "indonesia"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }

}
