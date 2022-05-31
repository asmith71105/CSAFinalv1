import java.util.Scanner;

public class songClass extends albumClass
{
    //Instance Variables
    private static double length;
    private static int trackNum;
    private static String songName;


    //Constructors
    public void Song(double newLength, int newTrackNum, String newSongName, String newGenre, String newAlbumName)
    {
        length = newLength;
        trackNum = newTrackNum;
        songName = newSongName;
        genre = newGenre;
        albumName = newAlbumName;
    }

    public static void generateSong()
    {
        Scanner keyboard2 = new Scanner(System.in);

        if(albumName.equals("folklore"))
        {
            System.out.println("Choose one of these sad songs to cry to.");
        }
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
    public void setLength(double newLength)
    {
        length = newLength;
    }

    public void setTrackNum(int newTrackNum)
    {
        trackNum = newTrackNum;
    }

    public void setSongName(String newSongName)
    {
        songName = newSongName;
    }


}