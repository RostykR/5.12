package com.company;

public class five {
    public static void main(String[] args) {
        int array[] = new int[15];
        int num = 0;
        for (int i = 0; i < 15; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + "");
            if (array[i] % 2 == 0) {
                num++;
            }
        }
        System.out.println(" ");
        System.out.println("Парних елементів в масиві : " + num);
    }
}
