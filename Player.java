import java.util.Random;

public class Player
{
    private String playerName;
    private int playerGoals;
    private int playerAssists;

    public Player(String name)
    {
        this.playerName = name;
    }

    //Setters
    public void setPlayerGoals(int goals)
    {
        this.playerGoals = goals;
    }

    public void setPlayerAssists(int assists)
    {
        this.playerAssists = assists;
    }

    //Getters

    public String getPlayerName()
    {
        return playerName;
    }

    public int getPlayerGoals()
    {
        return playerGoals;
    }

    public int getPlayerAssists()
    {
        return playerAssists;
    }
}
