package com.company.myCompany.basicJava.Generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> listOfTeams = new ArrayList<>();
    int noOfTeams;

    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team) {
        this.listOfTeams.add(team);
    }
    public int getNoOfTeams() {
        return this.listOfTeams.size();
    }
    public void printInOrder() {
        Collections.sort(listOfTeams);
        listOfTeams.forEach(team -> {
            System.out.println(team.getName());
        });

    }

}
