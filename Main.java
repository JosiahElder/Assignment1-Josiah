import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("FANTASY HOCKEY APPLICATION\n" +
                "TEAM ENTRY\n" +
                "================================");

        //--------------------------------------------------
        int no_of_teams = 3;
        Team[] T = new Team[no_of_teams];
        String tName;

        for (int i=0;i<no_of_teams;i++)
        {
            System.out.println("Enter name for team #" + (i+1));
            tName = inp.nextLine();
            T[i] = new Team(tName);
        }

        for (int i=0;i<no_of_teams;i++)
        {
            System.out.println(T[i].getName());
        }

    }
}