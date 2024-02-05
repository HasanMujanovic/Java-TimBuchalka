public class MethodChallenge {
    public static void main(String[] args) {
 int firstCase = calculateHighScorePosition(1500);
displayHighScorePosition("Hasan",firstCase);
int secondCase = calculateHighScorePosition(40);
displayHighScorePosition("Hasan", secondCase);
    }
    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into positon " + position +
                " on the high score list"
                );
    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;

    }
}
