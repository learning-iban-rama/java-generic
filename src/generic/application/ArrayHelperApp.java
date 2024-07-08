package generic.application;

import generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {
        String[] strArr = {"syaiban", "ahmad", "ramadhan"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        System.out.println(ArrayHelper.count(strArr));
        System.out.println(ArrayHelper.<Integer>count(intArr));
    }

}
