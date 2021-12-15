package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vedite 5 imen v spisok A");
        ArrayList<String> ListA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ListA.add(scanner.nextLine());
            System.out.println(ListA + " spisok A");
        }
        System.out.println("vedite 5 imen v spisok B");
        ArrayList<String> ListB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ListB.add(scanner.nextLine());
        }
        System.out.println(ListB + " spisok B");
        System.out.println("________________");

        ArrayList<String> ListC = new ArrayList<>();
        ListC.addAll(ListA);
        ListC.addAll(ListB);
        System.out.println(ListC + " spisok C");
        System.out.println("____________________________");
        Collections.sort(ListC, new Comparator<String>() {
            @Override
            public int compare(String o2, String o3) {
                return o2.length() - o3.length();
            }
        });
        
        System.out.println(ListC + " s naimenshego ");


      /*  Collections.reverse(ListB);
        int x = 0;
        while (ListC.size()<ListA.size()+ ListB.size()){
            ListC.add(ListA.get(x));
            ListC.add(ListB.get(x));
            x++;
        }*/

       /* List.add(scanner.nextLine());
        List.add(scanner.nextLine());
        List.add(scanner.nextLine());
        List.add(scanner.nextLine());
        System.out.println(List);*/


    }
}
