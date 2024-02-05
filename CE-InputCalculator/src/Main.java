import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        boolean endless = true;
        double xx = 0;
        long yy = 0L;
        double numberOfInputs = 0;
        do {
            System.out.println("Please enter a int number");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                xx += number;
                numberOfInputs++;
            }catch (NumberFormatException error){
                yy = Math.round(xx / numberOfInputs);
                int xx2 = (int) xx;
                System.out.println("SUM = " + xx2 + " AVG = " + yy);
                endless = false;
            }
        }while (endless);
    }
}
