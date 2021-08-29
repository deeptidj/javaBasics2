package com.company.myCompany.basicJava.InheritanceExmaples;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Car car = createObjects(i);
            car.startEngine();
        }

    }
    public static Car createObjects(int i) {
        System.out.println(i);
            switch (i) {
                case 0: case 6: case 10:case 11: case 2: case 3:
                    return new Mazda("strre", true, 4);
                case 1: case 7: case 12:case 14: case 16: case 19:
                    return new OverLander("strre", true, 4);
                default:
                    return new Car("dsfsd",true,4);

            }
    }
}
