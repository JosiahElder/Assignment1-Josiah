// "Assignment 1, Ready for marking".
// Josiah

import java.util.Scanner;

public class Main // Testing Class
{
    public static void main(String[] args) // main function
    {
        Scanner inp = new Scanner(System.in); // inp will take inputs

        System.out.println("FANTASY HOCKEY APPLICATION\n" +
                "TEAM ENTRY\n" +
                "================================");
        //--------------------------------------------------

        int no_of_teams = 3;
        int no_of_players = 3;

        Team[] T = new Team[no_of_teams]; // total 3 teams - 1D-array created to store team records
        Player[][] P = new Player[no_of_teams][no_of_players]; // 2D-array created to store all players records
        String tName;

        for (int i=0;i<no_of_teams;i++) // loop to take input of the teams
        {
            System.out.println("Enter name for team #" + (i+1));
            tName = inp.nextLine();
            T[i] = new Team(tName);
        }

        int [][] playerGoals = new int[no_of_teams][no_of_players];
        int [][] playerAssists = new int[no_of_teams][no_of_players];

        System.out.println();
        System.out.println("PLAYER ENTRY\n" +
                "================================");

        for (int i=0;i<no_of_teams;i++) // loop to take input of the players
        {
            System.out.println("Enter players for " + T[i].getTeamName() + ": ");
            for (int j=0;j<no_of_players;j++)
            {
                System.out.println("Enter name for Player # " + (j+1));
                tName = inp.nextLine(); // player name input
                P[i][j] = new Player(tName);
                System.out.println("Enter number of goals for " + P[i][j].getPlayerName() + ": ");
                playerGoals[i][j] = Integer.parseInt(inp.nextLine()); // player goal input
                P[i][j].setPlayerGoals(playerGoals[i][j]);
                T[i].setTotalGoals(playerGoals[i][j]); // setting total goals
                System.out.println("Enter number of assists for " + P[i][j].getPlayerName() + ": ");
                playerAssists[i][j] = Integer.parseInt(inp.nextLine()); // player assist input
                P[i][j].setPlayerAssists(playerAssists[i][j]);
                T[i].setTotalAssists(playerAssists[i][j]); // setting total assisting
                T[i].setRating();
            }
        }

        // REPORT

        int totalT;
        //--------------------------------------------------
        System.out.println("REPORT: Stats per Team"); // 1st Report
        System.out.println("================================");
        for (int i=0;i<no_of_teams;i++)
        {
            System.out.print(T[i].getTeamName() + ": ");
            System.out.print("G - " + T[i].getTotalGoals() + "     ");
            System.out.print("A - " + T[i].getTotalAssists() + "     ");
            totalT = T[i].getTotalGoals() + T[i].getTotalAssists();
            System.out.print("Total - " + totalT + "     ");
            System.out.print("Budget - $" + T[i].getTotalBudget() + "\n");
            System.out.print("Rating: " + T[i].getTeamRating() + " stars\n");
        }

        System.out.println();
        //--------------------------------------------------
        System.out.println("REPORT: Stats per Player"); // 2nd Report
        System.out.println("================================");
        for (int i=0;i<no_of_teams;i++)
        {
            for (int j=0;j<no_of_players;j++)
            {
                System.out.println(T[i].getTeamName());
                System.out.print(P[i][j].getPlayerName());
                System.out.print(":     G - " + P[i][j].getPlayerGoals() + "     ");
                System.out.print("A - " + P[i][j].getPlayerAssists() + "     ");
                totalT = P[i][j].getPlayerGoals() + P[i][j].getPlayerAssists();
                System.out.print("Total - " + totalT);
                System.out.println();
            }
        }
    }
}