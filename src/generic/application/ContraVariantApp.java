package generic.application;

import generic.MyData;

public class ContraVariantApp {

    public static void main(String[] args) {

        MyData<Object> data = new MyData<>("rama");

        MyData<? super String> data1 = data;

        data.setData(1000);
        process(data);
        System.out.println(data.getData());
    }

    public static void process(MyData<? super String> data) {
//        String d = (String) data.getData();
        var value = data.getData();
//        System.out.println(d);
        System.out.println(value);

        data.setData("syaiban");
    }

}
