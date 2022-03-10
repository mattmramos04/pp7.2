public class Baseball
{
    //Instantiate Variables
    private int score;
    private boolean equipment;
    private int teams;

    //Constructors
    public Baseball(int score, boolean equipment, int teams)
    {
        this.score = score;
        this.equipment = equipment;
        this.teams = teams;
    }

    //Getters
    public int getScore()
    {
        return score;
    }
    public int getTeams() { return teams; }
    public boolean getEquipment() { return equipment; }

    //Setters
    public void setScore(int score) { this.score = score; }
    public void setEquipment(boolean equipment) { this.equipment = equipment; }
    public void setTeams(int teams) { this.teams = teams;}

    public String toString()
    {
        String output = "Score: " + score +
                        "Equipment: " + equipment +
                        "Teams: " + teams;
        return output;
    }
}