package generic.application;

import generic.MyData;

public class GenericClassApp {

    public static void main(String[] args) {

        MyData<String> myDataString = new MyData<String>("rama");
        var myDataInteger = new MyData<>(2);

        System.out.println(myDataString.getData());
        System.out.println(myDataInteger.getData());
    }

}
