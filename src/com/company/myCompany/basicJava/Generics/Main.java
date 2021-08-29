package com.company.myCompany.basicJava.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Raw Type - before java 1.5 there was no way to mention what type of data types are going to be stored in the ArrayList.
        //As this can throw run time error. In Java 1.5, Generics were introduced.
//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        items.add(6);
//        printDoubled(items);


        //With GENERICS - specifying Type in diamond <> is Generics.
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        printDoubled(nums);

        //
        FootBallPlayer joe = new FootBallPlayer("Joe");
        Team<FootBallPlayer> team = new Team<>("Crows");
        team.addPlayer(joe);
        System.out.println("Team size "+team.numPlayers());


        // ERRORS out if T extends Player is not put
//        Team<String> brokenTeam = new Team<>("This will not work");
//        brokenTeam.addPlayer("no-one");

        SoccerPlayer soccerPlayer1 =  new SoccerPlayer("Soccer Player 1");
        SoccerPlayer soccerPlayer2 =  new SoccerPlayer("Soccer Player 2");
        Team<SoccerPlayer> soccerPlayerTeam1 = new Team<>("Soccer Team 1");
        Team<SoccerPlayer> soccerPlayerTeam2 = new Team<>("Soccer Team 2");
        soccerPlayerTeam1.addPlayer(soccerPlayer1);
        soccerPlayerTeam2.addPlayer(soccerPlayer2);
        System.out.println( "Team Size " + soccerPlayerTeam1.numPlayers());
        System.out.println( "Team Size " + soccerPlayerTeam2.numPlayers());
        soccerPlayerTeam1.matchResult(soccerPlayerTeam2, 5, 2);
        System.out.println(soccerPlayerTeam1+" rank : "+ soccerPlayerTeam1.ranking());
        System.out.println();
        System.out.println("**************** Soccer Ranking *******************");
        System.out.println(soccerPlayerTeam1.compareTo(soccerPlayerTeam2));
        System.out.println("**************** Soccer Ranking *******************");
        System.out.println();

        FootBallPlayer footballPlayer1 = new FootBallPlayer("Football Player1");
        FootBallPlayer footballPlayer2 = new FootBallPlayer("Football Player2");
        Team<FootBallPlayer> footballTeam1 = new Team<>("Football team 1");
        Team<FootBallPlayer> footballTeam2 = new Team<>("Football team 2");
        if (!footballTeam1.addPlayer(footballPlayer1)) System.out.println(" Not added");
        footballTeam1.addPlayer(footballPlayer2);
        System.out.println( "Team Size " + footballTeam1.numPlayers());
        System.out.println( "Team Size " + footballTeam2.numPlayers());
        footballTeam1.matchResult(footballTeam2, 5, 5);
        System.out.println(footballTeam1.ranking());
        System.out.println("**************** Foot ball Ranking *******************");
        System.out.println(footballTeam1.compareTo(footballTeam2));
        System.out.println("**************** Foot ball Ranking *******************");
        System.out.println();

        BaseBallPlayer baseBallPlayer1 = new BaseBallPlayer("Base Ball Player 1");
        BaseBallPlayer baseBallPlayer2 = new BaseBallPlayer("Base Player Player 2");
        Team<BaseBallPlayer> baseballPlayerTeam1 = new Team<>("Baseball Player Team 1");
        Team<BaseBallPlayer> baseballPlayerTeam2 = new Team<>("Base Ball Team 2");
        baseballPlayerTeam1.addPlayer(baseBallPlayer1);
        baseballPlayerTeam2.addPlayer(baseBallPlayer2);
        System.out.println("Team size "+ baseballPlayerTeam1.numPlayers());
        System.out.println("Team size "+ baseballPlayerTeam2.numPlayers());
        baseballPlayerTeam1.matchResult(baseballPlayerTeam2, 1, 8);
        System.out.println(baseballPlayerTeam1.ranking());
        System.out.println();
        System.out.println("**************** Baseball Ranking *******************");
        System.out.println(baseballPlayerTeam1.compareTo(baseballPlayerTeam2));
        System.out.println("**************** Baseball Ranking *******************");
        System.out.println();


        System.out.println(" ***********  LEAGUE **************");

        League<Team<FootBallPlayer>> l = new League("lea 1");
        l.addTeam(footballTeam1);
        l.addTeam(footballTeam2);
        l.printInOrder();

        League<Team<BaseBallPlayer>> b = new League<>("Base ball giant");
        b.addTeam(baseballPlayerTeam1);
        b.addTeam(baseballPlayerTeam2);
        b.printInOrder();

        System.out.println("No Of teams in this league are : "+ b.getNoOfTeams());

    }
    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.print((i * 2) + " ");
        }
        System.out.println();
    }



}
