import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.println("FANTASY HOCKEY APPLICATION\n" +
                "TEAM ENTRY\n" +
                "================================");
        //--------------------------------------------------

        int no_of_teams = 3;
        int no_of_players = 3;

        Team[] T = new Team[no_of_teams];
        Player[][] P = new Player[no_of_teams][no_of_players];
        String tName;

        for (int i=0;i<no_of_teams;i++)
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

        for (int i=0;i<no_of_teams;i++)
        {
            System.out.println("Enter players for " + T[i].getTeamName() + ": ");
            for (int j=0;j<no_of_players;j++)
            {
                System.out.println("Enter name for Player # " + (j+1));
                tName = inp.nextLine();
                P[i][j] = new Player(tName);
                System.out.println("Enter number of goals for " + P[i][j].getPlayerName() + ": ");
                playerGoals[i][j] = Integer.parseInt(inp.nextLine());
                //T[i].setTotalGoals(playerGoals[i][j]);
                System.out.println("Enter number of assists for " + P[i][j].getPlayerName() + ": ");
                playerAssists[i][j] = Integer.parseInt(inp.nextLine());
            }
        }

        // REPORT

        int totalT;
        //--------------------------------------------------
        System.out.println("REPORT: Stats per Team");
        System.out.println("================================");
        for (int i=0;i<no_of_teams;i++)
        {
            System.out.print(T[i].getTeamName() + ": ");
            System.out.print("G - " + T[i].getTotalGoals() + "     ");
            System.out.print("A - " + T[i].getTotalAssists() + "     ");
            totalT = T[i].getTotalGoals() + T[i].getTotalAssists();
            System.out.print("Total - " + totalT + "     ");
            System.out.print("Budget - $" + T[i].getTotalBudget() + "\n");
            System.out.print("Rating: " + T[i].getTeamRating() + " stars");
        }

        System.out.println();
        //--------------------------------------------------
        System.out.println("REPORT: Stats per Player");
        System.out.println("================================");
        for (int i=0;i<no_of_teams;i++)
        {
            System.out.println(T[i].getTeamName());
            for (int j=0;j<no_of_players;j++)
            {
                System.out.println(P[i][j].getPlayerName());
                System.out.print("G - " + P[i][j].getPlayerGoals() + "     ");
                System.out.print("A - " + P[i][j].getPlayerAssists() + "     ");
                totalT = P[i][j].getPlayerGoals() + P[i][j].getPlayerAssists();
                System.out.print("Total - " + totalT);
            }
            System.out.println();
        }
    }
}