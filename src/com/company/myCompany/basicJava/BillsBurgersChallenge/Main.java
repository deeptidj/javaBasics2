package com.company.myCompany.basicJava.BillsBurgersChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            do{
                System.out.println("Want to order ? y/n");
                Scanner sc = new Scanner(System.in);
                if (sc.next().equalsIgnoreCase("y")) {
                    HamBurger hamBurgerObj = createBurgerObject(orderBurger());
                    if(hamBurgerObj != null) {
                        System.out.println("Ordered Burger number = "+hamBurgerObj.getName());
                        orderAdditionalItems(hamBurgerObj);
                        System.out.println(hamBurgerObj.totPrice());
                    }
                }
                else return;
            } while (1==1);
    }
    public static int orderBurger() {
        int burgerNo = 0;
        System.out.println("Enter what burger you want : \n 1. Ham Burger \n 2. Healthy Burger \n 3. Deluxe Burger");
        Scanner sc = new Scanner(System.in);
        burgerNo = sc.nextInt();
        System.out.println("Option Selected = "+ burgerNo);
        if(burgerNo == 1 || burgerNo == 2 || burgerNo == 3) {
            return burgerNo;
        }
        return -1;
    }
    public static void orderAdditionalItems(HamBurger hamBurgerObj) {
        int additionalItemsAllowed = hamBurgerObj.getMaxAllowedAdditionalItems();
        Scanner sc = new Scanner(System.in);
        System.out.println("Max allowed additional items = "+additionalItemsAllowed);
        System.out.println("How many additional items do you want ? Each is $1");
        int addtionalItemsOrdered = sc.nextInt();
        if (addtionalItemsOrdered < 0 || addtionalItemsOrdered > additionalItemsAllowed) {
            System.out.println("Not allowed range."); return;
        }
        hamBurgerObj.setAdditionalItems(addtionalItemsOrdered);
    }
    public static HamBurger createBurgerObject(int burgerOrder) {
        switch (burgerOrder) {
            case 1:
                System.out.println("Creating HamBurger obj.");
               return new HamBurger("HamBurger", BreadRollType.WHITE, Meat.MEAT1, 5.0);
            case 2:
                return new HealthyBurger("HamBurger", Meat.MEAT1, 8.0);
            case 3:
                return new DeluxeBurger("HamBurger", Meat.MEAT1, 8.0);
            default:
                System.out.println("Invalid order");
                break;
        }
        return null;
    }


}
