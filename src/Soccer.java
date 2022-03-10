public class Soccer
{
    private boolean canGrabBall;
    private String fieldName;
    private int matchTime;

    //Constructor
    public Soccer(boolean canGrabBall, String fieldName, int matchTime)
    {
        this.canGrabBall = canGrabBall;
        this.fieldName = fieldName;
        this.matchTime = matchTime;
    }

    //Getter
    public boolean getCanGrabBall()
    {
        return canGrabBall;
    }
    public String getFieldName()
    {
        return fieldName;
    }
    public int getMatchTime()
    {
        return matchTime;
    }

    //Setters
    public void setCanGrabBall(boolean canGrabBall)
    {
        this.canGrabBall = canGrabBall;
    }
    public void setFieldName(String fieldName)
    {
        this.fieldName = fieldName;
    }
    public void setMatchTime()
    {
        this.matchTime = matchTime;
    }

    //toString
    public String toString()
    {
        String output = "Can Grab The Ball: " + canGrabBall +
                        "The Name of the Field: " + fieldName +
                        "Match Time: " + matchTime;
        return output;
    }
}
