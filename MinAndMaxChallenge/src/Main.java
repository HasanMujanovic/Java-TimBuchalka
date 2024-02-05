import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxNum = 0;
        double minNum = 0;
        for (int i = 0; true; i++){
            System.out.println("Enter a number, or any other character to exit!");
            try{
            double number = Double.parseDouble(scanner.nextLine());
            if (number > maxNum) maxNum = number;
            if ((minNum == 0) || (number < minNum)) minNum = number;

            } catch (NumberFormatException error){
                break;
            }
System.out.println("Min number is = " + minNum);
            System.out.println("Max number is = " + maxNum);
        }

    }
}
