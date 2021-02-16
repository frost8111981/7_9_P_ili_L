package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

//        strings = fix(strings);
        fix(strings);
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < 3; i++) {
            if (strings.get(i).contains("р")) {
                strings.remove(strings.get(i));
                System.out.println("if");
            }
            System.out.println("for");
        }
        return strings;

    }
}

