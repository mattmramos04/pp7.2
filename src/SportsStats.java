public class SportsStats
{
    //Instantiate Variables
    public boolean teams;
    public boolean isIndoors;
    public String equipment;
    public String rules;
    public String name;

    //Constructor
    public SportsStats(boolean teams, boolean isIndoors, String equipment, String rules, String name)
    {
        this.teams = teams;
        this.isIndoors = isIndoors;
        this.equipment = equipment;
        this.rules = rules;
        this.name = name;
    }

    //Getters
    public String getNames()
    {
        return name;
    }
    public boolean getTeams()
    {
        return teams;
    }
    public boolean getIsIndoors()
    {
        return isIndoors;
    }

    public String getEquipment()
    {
        return equipment;
    }

    //Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setTeams(boolean teams)
    {
        this.teams = teams;
    }
    public void setIndoors(boolean isIndoors)
    {
        this.isIndoors = isIndoors;
    }
    public void setEquipment(String equipment)
    {
        this.equipment = equipment;
    }
    public void setRules(String rules)
    {
        this.rules = rules;
    }

    //toString

}