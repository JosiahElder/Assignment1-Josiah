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

        for (int i=0;i<no_of_teams;i++)
        {
            System.out.println("Enter players for " + T[i].getTeamName() + ": ");
            for (int j=0;j<no_of_players;j++)
            {
                System.out.println("Enter name for Player #" + (i+1));
                tName = inp.nextLine();
                P[i][j] = new Player(tName);
            }
        }

        for (int i=0;i<no_of_teams;i++)
        {
            for (int j=0;j<no_of_players;j++)
            {
                System.out.println(P[i][j].getPlayerName());
            }
        }

        //--------------------------------------------------
        System.out.println("REPORT: Stats per Team");
        System.out.println("================================");

        //--------------------------------------------------
        System.out.println("REPORT: Stats per Player");
        System.out.println("================================");
    }
}