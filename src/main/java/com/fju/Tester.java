package com.fju;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
            int total=0;
            while (true){
                System.out.println("Please choose your option");
                Scanner scanner=new Scanner(System.in);
                String enter=scanner.next();
                if(enter.startsWith("p")){
                    Map<String , Package>packages = new HashMap<>();

                    Package p1=new Package("252",28);
                    Package p2=new Package("598",50);
                    Package p3=new Package("388",74);

                    packages.put(p1.id, p1);
                    packages.put(p2.id, p2);
                    packages.put(p3.id, p3);

                    System.out.println("Enter your id:");
                    Scanner a=new Scanner(System.in);
                    String id=scanner.next();
                    Package pack=packages.get(id);
                    if(pack==null){
                        System.out.println("Your package have not delivered or you enter wrong id");
                    }else{
                        System.out.println("ID:" + id + " , price :" + pack.price);
                        total=total+pack.price;
                    }
                }else if(enter.startsWith("f")){
                    System.out.println("What do you want to buy , please enter the number?(1. Drink 2.Cookies 3.Sandwiches 4.Ice cream)");
                    while (true) {
                        String[] menu = {"Drink", "Cookies", "Sandwiches", "Ice cream"};
                        Scanner eat = new Scanner(System.in);
                        String  input=scanner.next();
                        if(input.startsWith("e")) {
                            break;
                        } else if() {
                            int food = Integer.parseInt(input);
                            Menu m = new Menu(food);
                            m.print();
                        }

                    }

                }else if (enter.startsWith("t")){
                    break;
                }
            }
    }
}
