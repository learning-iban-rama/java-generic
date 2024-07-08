package generic.application;

import generic.Pair;

public class PairApp {

    public static void main(String[] args) {
        Pair<String, Boolean> myPair = new Pair<>("rama", true);
        System.out.println(myPair.getFirst());
        System.out.println(myPair.getSecond());
        myPair.setSecond(false);
        System.out.println(myPair.getSecond());
    }

}
