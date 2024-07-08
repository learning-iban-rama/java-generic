package generic.application;

import generic.MyData;

public class CovariantApp {

    public static void main(String[] args) {
        MyData<String> data = new MyData<>("rama");
        process(data);
    }

    public static void process(MyData<? extends Object> data) {
        System.out.println(data.getData());
    }
}
