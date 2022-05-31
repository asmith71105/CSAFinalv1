import java.util.Scanner;

public class albumClass
{
    //Instance Variables
    public static String genre;
    public static String albumName;
    public static int debutPoints = 0; //Singles: "Our Song", "Should've Said No", "Tim McGraw"
    public static int fearlessPoints = 0; //Singles: "Love Story (Taylor's Version)",
    // "You Belong With Me (Taylor's Version)", "Fifteen (Taylor's Version)"
    public static int speakNowPoints = 0; //Singles: "Mine", "Back to December", "Sparks Fly"
    public static int redPoints = 0; //Singles: "We Are Never Ever Getting Back Together", "Begin Again",
    // "I Knew You Were Trouble"
    public static int birthYearPoints = 0; //Singles: "Blank Space", "Style", "Wildest Dreams (Taylor's Version)"
    public static int reputationPoints = 0; //Singles: "Look What You Made Me Do", "..Ready For It?", "Delicate"
    public static int loverPoints = 0; //Singles: "Me!", "You Need to Calm Down", "Lover",
    public static int folklorePoints = 0; //Singles: "cardigan", "the 1", "exile"
    public static int evermorePoints = 0; //Singles: "willow", "evermore", "champagne problems"


    //Constructors
    public void Album(String newGenre, String newAlbumName)
    {
        genre = newGenre;
        albumName = newAlbumName;
    }


    //Album Method
    public static void generateAlbum()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Which of these artists do you like the most? Enter the letter \nA. Tim McGraw \nB. " +
                "Keith Urban \nC. Ed Sheeran \nD. Future " + "\nE. Bon Iver \n");

        String answer1 = keyboard.next();

        if(answer1.equals("A"))
        {
            debutPoints++;
        }
        else if(answer1.equals("B"))
        {
            fearlessPoints++;
        }
        else if(answer1.equals("C"))
        {
            redPoints++;
        }
        else if(answer1.equals("D"))
        {
            reputationPoints++;
        }
        else if(answer1.equals("E"))
        {
            folklorePoints++;
            evermorePoints++;
        }

        System.out.println("2. What is your favorite genre of music? \nA. Country \nB. Pop \nC. Folk \nD. " +
                "Alternative/Rock");
        String answer2 = keyboard.next();

        if(answer2.equals("A"))
        {
            debutPoints++;
            fearlessPoints++;
        }
        else if(answer2.equals("B"))
        {
            birthYearPoints++;
            reputationPoints++;
            loverPoints++;
        }
        else if(answer2.equals("C"))
        {
            folklorePoints++;
            evermorePoints++;
        }
        else if(answer2.equals("D"))
        {
            speakNowPoints++;
        }

        System.out.println("3. Which of these Taylor Swift singles is your fave? \nA. Our Song \nB. You Belong With Me "
                + "\nC. 22 \nD. Blank Space \nE. Lover");
        String answer3 = keyboard.next();

        if(answer3.equals("A"))
        {
            debutPoints++;
        }
        else if(answer3.equals("B"))
        {
            fearlessPoints++;
            speakNowPoints++;
        }
        else if(answer3.equals("C"))
        {
            redPoints++;
        }
        else if(answer3.equals("D"))
        {
            birthYearPoints++;
        }
        else if(answer3.equals("E"))
        {
            loverPoints++;
        }


        System.out.println("4. What phase of life are you currently in? \nA. Heartbreak \nB. Revenge \nC. Acceptance " +
                "\nD. Renewal");
        String answer4 = keyboard.next();

        if(answer4.equals("A"))
        {
            debutPoints++;
            speakNowPoints++;
            redPoints++;
            folklorePoints++;
        }
        else if(answer4.equals("B"))
        {
            reputationPoints++;
        }
        else if(answer4.equals("C"))
        {
            loverPoints++;
            evermorePoints++;
        }
        else if(answer4.equals("D"))
        {
            birthYearPoints++;
        }

        System.out.println("5. Which of Taylor's boyfriends is your favorite? \nA. Joe Jonas \nB. Jake Gyllenhaal (ew) "
                + "\nC. Harry Styles \nD. Joe Alwyn (the best)");
        String answer5 = keyboard.next();

        if(answer5.equals("A"))
        {
            fearlessPoints++;
            speakNowPoints++;
        }
        else if(answer5.equals("B"))
        {
            redPoints++;
        }
        else if(answer5.equals("C"))
        {
            birthYearPoints++;
        }
        else if(answer5.equals("D"))
        {
            loverPoints++;
            reputationPoints++;
            folklorePoints++;
            evermorePoints++;
        }

        if(debutPoints > fearlessPoints && debutPoints > speakNowPoints && debutPoints > redPoints && debutPoints >
                birthYearPoints && debutPoints > reputationPoints && debutPoints > folklorePoints && debutPoints > evermorePoints)
        {
            setAlbumName("Taylor Swift");
            setGenre("Country");
        }
        else if(fearlessPoints > debutPoints && fearlessPoints > speakNowPoints && fearlessPoints > redPoints &&
                fearlessPoints > birthYearPoints && fearlessPoints > reputationPoints && fearlessPoints > loverPoints &&
                fearlessPoints > folklorePoints && fearlessPoints > evermorePoints)
        {
            setAlbumName("Fearless");
            setGenre("Country");
        }
        else if(speakNowPoints > debutPoints && speakNowPoints > fearlessPoints && speakNowPoints > redPoints &&
                speakNowPoints > birthYearPoints && speakNowPoints > reputationPoints && speakNowPoints > loverPoints &&
                speakNowPoints > folklorePoints && speakNowPoints > evermorePoints)
        {
            setAlbumName("Speak Now");
            setGenre("Pop Rock");
        }
        else if(redPoints > debutPoints && redPoints > fearlessPoints && redPoints > speakNowPoints && redPoints >
                birthYearPoints && redPoints > reputationPoints && redPoints > loverPoints && redPoints > folklorePoints
                && redPoints > evermorePoints)
        {
            setAlbumName("Red");
            setGenre("Alternative");
        }
        else if(birthYearPoints > debutPoints && birthYearPoints > fearlessPoints && birthYearPoints > speakNowPoints &&
                birthYearPoints > redPoints && birthYearPoints > reputationPoints && birthYearPoints > loverPoints &&
                birthYearPoints > folklorePoints && birthYearPoints > evermorePoints)
        {
            setAlbumName("1989");
            setGenre("Pop");
        }
        else if(reputationPoints > debutPoints && reputationPoints > fearlessPoints && reputationPoints > speakNowPoints
                && reputationPoints > redPoints && reputationPoints > birthYearPoints && reputationPoints > loverPoints
                && reputationPoints > folklorePoints && reputationPoints > evermorePoints)
        {
            setAlbumName("reputation");
            setGenre("Pop");
        }
        else if(loverPoints > debutPoints && loverPoints > fearlessPoints && loverPoints > speakNowPoints && loverPoints
                > redPoints && loverPoints > birthYearPoints && loverPoints > reputationPoints && loverPoints >
                folklorePoints && loverPoints > evermorePoints)
        {
            setAlbumName("Lover");
            setGenre("Pop");
        }
        else if(folklorePoints > debutPoints && folklorePoints > fearlessPoints && folklorePoints > speakNowPoints &&
                folklorePoints > redPoints && folklorePoints > birthYearPoints && folklorePoints > reputationPoints &&
                folklorePoints > loverPoints && folklorePoints > evermorePoints)
        {
            setAlbumName("folklore");
            setGenre("Folk");
        }
        else if(evermorePoints > debutPoints && evermorePoints > fearlessPoints && evermorePoints > speakNowPoints &&
                evermorePoints > redPoints && evermorePoints > birthYearPoints && evermorePoints > reputationPoints &&
                evermorePoints > loverPoints && evermorePoints > folklorePoints)
        {
            setAlbumName("evermore");
            setGenre("Folk");
        }
    } //end of album method



    //Getters
    public String getGenre()
    {
        return genre;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    //Setters
    public static void setGenre(String newGenre)
    {
        genre = newGenre;
    }

    public static void setAlbumName(String newAlbumName)
    {
        albumName = newAlbumName;
    }

}