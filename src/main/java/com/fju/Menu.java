package com.fju;

public class Menu {
    int drink = 25, cookies = 30, sandwich = 50, ice = 35, total = 0;
    int d = 0, c = 0, s = 0, i = 0;
    int input;
    int[] menu = {25, 30, 50, 35};

    public Menu(int input) {
        if (input == 1) {
            d++;
        } else if (input == 2) {
            c++;
        } else if (input == 3) {
            s++;
        } else if (input == 4) {
            i++;
        }
    }

    public void print(){
        System.out.println(d);
    }
}