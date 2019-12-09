import org.w3c.dom.ls.LSOutput;

public class DisplayHighScore {
    public static void main (String[] args) {
        int myScore = calculateHighScores(1500);
        displayHighScore("bucha", myScore);
        myScore = calculateHighScores(900);
        displayHighScore("pikin", myScore);
        myScore = calculateHighScores(490);
        displayHighScore("kili", myScore);
        myScore = calculateHighScores(49);
        displayHighScore("lili", myScore);
    }



//    myScore = calculateHighScores(900);
//    result = displayHighScore("kiki",myScore);
//    int myScore = calculateHighScores(1500);
//    String result = displayHighScore("bucha",myScore);
//    int myScore = calculateHighScores(1500);
//    String result = displayHighScore("bucha",myScore);

    public static void displayHighScore (String name, int position) {
        System.out.println("This is " + name + "who managed to get into position " + position + "on the high scores table");

    }
    public static int calculateHighScores (int score) {
        if(score > 1000) {
            return 1;
        }
        else if ((score > 500)  && (score < 1000)) {
            return 2;
        }
        else if ((score > 100) && (score < 500)) {
            return 3;
        }
        return 4;

    }

}
