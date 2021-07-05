package com.fju;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        int total=0;
            while (true){

                System.out.println("Please choose your option:");
                System.out.println("enter p for package");
                System.out.println("enter f for food");
                System.out.println("enter t for total");
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
                        continue;
                    }else{
                        System.out.println("ID:" + id + " , price :" + pack.price);
                    }
                    total=total+pack.price;
                    System.out.println(total);
                }else if(enter.startsWith("f")){
                    List menu= new ArrayList();
                    menu.add(new Drink());
                    menu.add(new Cookies());
                    menu.add(new Sandwich());
                    menu.add(new Ice());
                    while (true) {
                        System.out.println("What do you want to buy , please enter the number?)");
                        System.out.println("(0. Drink 25$ 1.Cookies 30$ 2.Sandwiches 50$ 3.Ice cream 35$)");
                        Scanner eat = new Scanner(System.in);
                        String  input=scanner.next();
                        if(input.startsWith("e")) {
                            break;
                        } else if(menu.size()-1>=Integer.parseInt(input)){
                            int food = Integer.parseInt(input);
                            Menu m=(Menu) menu.get(food);
                            System.out.println(m.name);
                                total=total+m.price;
                        }else {
                            System.out.println("There is no option , please try again");
                        }
                        continue;
                    }

                }else if (enter.startsWith("t")){
                    System.out.println("Total:" + total);
                    break;
                }

            }
    }
}
