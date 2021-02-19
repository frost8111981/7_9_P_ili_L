package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");  // 1. удалять из списка строк все слова, содержащие букву "р"
        strings.add("лоза");  // 2. удваивать все слова содержащие букву "л"
        strings.add("лира");  // 3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений

        strings = fix(strings);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).contains("р")) {
                if (strings.get(i).contains("р") && strings.get(i).contains("л")) {
                } else {
                    strings.remove(strings.get(i));
                }
            }
        }
        for(int i = 0; i < strings.size() - 1; i ++){
            if(strings.get(i).contains("л") && !(strings.get(i).contains("р"))){
                strings.add(strings.get(i));
            }
        }

        return strings;
    }
}

