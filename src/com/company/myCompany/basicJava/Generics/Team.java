package com.company.myCompany.basicJava.Generics;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name;
    private int played =0;
    private int won =0;
    private int lost =0;
    private int tied =0;

    private ArrayList<T> members = new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already in the team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " has been added to the team.");
            return true;
        }
    }
    public int numPlayers() {
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        }else if (ourScore < theirScore) {
            lost++;
            message =" lost to ";
        } else {
            tied++;
            message = " drew with ";
        }
        played++;
        if (opponent != null) {
           opponent.matchResult(null, theirScore, ourScore);
            System.out.println(this.getName() +" played "+ this.played + "  matches.");
            System.out.println(this.getName() + message + opponent.name);
            System.out.println(this.getName() +" No of matches won = "+won);
            System.out.println(this.getName() +" No of matches lost = "+lost);
            System.out.println(this.getName() +" No of matches tied = "+tied);
        }
    }

    public int ranking () {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) return -1;
        else if (this.ranking() < team.ranking()) return 1;
        else return 0;
    }
}
