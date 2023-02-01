import java.util.Random;

public class Team
{
    //Private Variables
    private String teamName;
    private String teamRating;
    private int teamGoals;
    private int teamAssists;
    private double teamBudget;

    public Team(String name)
    {
        this.teamName = name;
        Random random = new Random();
        this.teamBudget = random.nextInt(100000);
    }

    //Setters
    public void setTotalGoals(int goals)
    {
        this.teamGoals = goals;
    }

    public void setTotalAssists(int assists)
    {
        this.teamAssists = assists;
    }

    public void setRating()
    {
        int total = teamGoals + teamAssists;
        if (total > 20)
        {
            this.teamRating = "***"; // if greater than 20 - 3 stars
        }
        else if (total >= 10)
        {
            this.teamRating = "**"; // if greater than 10  - 2 stars
        }
        else if (total > 0)
        {
            this.teamRating = "*"; // if greater than 0  - 1 star
        }
        else
        {
            this.teamRating = "0"; // if less than 0  - 0 stars
        }
    }

    //Getters
    public String getName()
    {
        return teamName;
    }

    public double getBudget()
    {
        return teamBudget;
    }

    public int getTotalGoals()
    {
        return teamGoals;
    }

    public int getTotalAssists()
    {
        return teamAssists;
    }

    public String getTeamRating()
    {
        return teamRating;
    }
}