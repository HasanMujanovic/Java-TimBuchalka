public class Main {
    public static void main(String[] args) {
        int primeNumCounter = 0;

        for (int i = 10; primeNumCounter < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeNumCounter++;
            }
//            if (primeNumCounter == 3) {
//                break;
//            }

        }
//        if (wholeNumber % i == 0){
//            System.out.println(wholeNumber + " is a prime number");
//            primeNumCounter++;
//        }
//        if (primeNumCounter == 3){
//            break;
//        }


    }
    public static boolean isPrime (int wholeNumber){
//        if (wholeNumber <= 2){
//            return (wholeNumber == 2);
//        }
//        for (int i = 2; i <= wholeNumber /2; i++){
//            if (wholeNumber % i == 0){
//                return  false;
//            }
//        }
        for (int i = 2; i <= wholeNumber /2 ;i++){
            if (wholeNumber % i == 0){
                return false;
            }

        }
        return true;
    }
}
