package com.company.myCompany.basicJava;

public class PassPrimitiveByValue {
    public class Circle {
        private int x, y, radius;

        Circle(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void setOrigin(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void setX(int x) {
            this.x = x;
        }
        public int getX() {
            return x;
        }
        public void setY(int y) {
            this.y = y;
        }
        public int getY() {
            return y;
        }
    }
    public static void main(String[] args) {

        int x = 3;

        // invoke passMethod() with
        // x as argument
        passMethod(x);

        // print x to see if its
        // value has changed
        System.out.println("After invoking passMethod, x = " + x);

    }

    // change parameter in passMethod()
    public static void passMethod(int p) {
        p = 10;
    }
    public void moveCircle(Circle circle, int deltaX, int deltaY) {

        // code to move origin of circle to x+deltaX, y+deltaY
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        // code to assign a new reference to circle
        circle = new Circle(0, 0);
    }

}

