package com.company.myCompany.basicJava;

public class SuperThisExamp {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printDetails();

        Rectangle r1 = new Rectangle(4,4,1,2);
        r1.printDetails();

    }
}
class Shape{
    int sides;
    int corners;
    Shape(){
        this(0,0);
    }
    Shape(int sides, int corners) {
        this.sides = sides;
        this.corners = corners;
    }

    protected void printDetails() {
        System.out.println("sides = " +this.sides);
        System.out.println("cornerss = " +this.corners);
    }
}
class Rectangle extends Shape {
    int x,y;
    Rectangle() {
        this(0,0);
    }
    Rectangle(int x, int y) {
        super(x,y);
    }
    Rectangle(int sides, int corners, int x, int y) {
        super(sides, corners);
        this.x = x;
        this.y = y;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println(" X = "+this.x);
        System.out.println(" Y = "+this.y);
    }
}
