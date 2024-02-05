public class Main {

    public static void main(String[] args) {
        int sumOfNum = 0;
        int countOfMatches = 0;
        for (int i = 10; i<=100;i++){

            if ((i % 3 == 0) && (i % 5 == 0)){
                countOfMatches++;
                sumOfNum += i;
                System.out.println(i);
            }
            if (countOfMatches == 5){
                break;
            }
        }
        System.out.println("Sum = " + sumOfNum);
    }
}
