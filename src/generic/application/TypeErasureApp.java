package generic.application;

import generic.MyData;

public class TypeErasureApp {

    public static void main(String[] args) {
        MyData myData = new MyData("rama");

        MyData<Integer> integer = (MyData<Integer>) myData;
        //        integer.setData(1000);
        Integer integer1 = integer.getData();
    }

}
