import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double sumOfNumbers = 0;
int countOfNumbers = 1;
do {

try {
    System.out.println("Enter number #" + countOfNumbers);
    double unetiBroj = Double.parseDouble(scanner.nextLine());
    countOfNumbers++;
    sumOfNumbers += unetiBroj;
} catch (NumberFormatException error){
    System.out.println("You must enter a number!! Try again.");
}

} while (countOfNumbers <= 5);
System.out.println(sumOfNumbers);
    }
}
