package generic.application;

import generic.MyData;

public class WildCardApp {

    public static void main(String[] args) {
        MyData<String> dataStr = new MyData<>("rama");
        MyData<Integer> dataInt = new MyData<>(1);
        MyData<MultipleConstraintApp.Manager> dataManager = new MyData<>(new MultipleConstraintApp.Manager());

        printMyData(dataStr);
        printMyData(dataInt);
        printMyData(dataManager);
    }

    public static void printMyData(MyData<?> data) {
        System.out.println(data.getData());
    }

}
