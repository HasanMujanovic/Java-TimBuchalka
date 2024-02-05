public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And im scared of aliens");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }
        if ((topScore>90) || (secondTopScore <=90)){
            System.out.println("Either or both of the conditions are true");
        }
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double prviBr = 20.00d;
        double drugiBr = 80.00d;
        double treciBr = (prviBr + drugiBr) * 100.00d;
        System.out.println("My values total is: " + treciBr);
        double remainder = treciBr % 40.00d;
        System.out.println("The remainder: " + remainder);
        boolean isIt = remainder == 0 ? true : false;
        System.out.println(isIt);
        if (!isIt){
            System.out.println("got some remainder");
        }

    }
}
