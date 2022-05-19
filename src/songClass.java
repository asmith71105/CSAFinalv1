import java.util.Scanner;

public class songClass extends albumClass
{
    //Instance Variables
    private double length;
    private int trackNum;
    private String songName;

    //Constructors
   /* public Song(double length, int trackNum, String songName, String genre, String albumName)
    {
        super(genre, albumName);
        this.length = length;
        this.trackNum = trackNum;
        this.songName = songName;
    } */

    //Brain Method
    public static void generateResults()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your favorite color? \nA. Blue\nB. Pink\nC. Yellow\nD. Green");
    }

    //Getters
    public double getLength()
    {
        return length;
    }

    public int getTrackNum()
    {
        return trackNum;
    }

    public String getSongName()
    {
        return songName;
    }

    //Setters
    public void setLength(double length)
    {
        this.length = length;
    }

    public void setTrackNum(int trackNum)
    {
        this.trackNum = trackNum;
    }

    public void setSongName(String songName)
    {
        this.songName = songName;
    }


}