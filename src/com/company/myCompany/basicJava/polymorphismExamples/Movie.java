package com.company.myCompany.basicJava.polymorphismExamples;

import javax.swing.*;

public class Movie {
    private String name;

    public String getName() {
        return name;
    }

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plt here";
    }
}
class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Jaws plot";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "IndependenceDay plot";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "MazeRunner plot";
    }
}

class JurrassicPark extends Movie{
    public JurrassicPark() {
        super("JurrassicPark");
    }

    @Override
    public String plot() {
        return "JurrassicPark plot";
    }
}

class Jumanji extends Movie{
    public Jumanji() {
        super("Jumanji");
    }
    @Override
    public String plot() {
        return "Jumanji plot";
    }
}
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }

}




