package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");  // 1. удалять букву "р"
        strings.add("мера");  // 1. удалять букву "р"
        strings.add("лоза");  // 2. удваивать все слова содержащие букву "л"
        strings.add("лира");  // 3. "р" и букву "л", то оставить это слово без изменений
        strings.add("вода");  // не трогать
        strings.add("упор");  // 1. удалять букву "р"
        strings = fix(strings);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            if (item.contains("р") && !(item.contains("л"))) {
                iterator.remove();
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

