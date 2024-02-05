public class Main {
    public static void main(String[] args) {
        int switchValue = 1;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, or 5");


        }
        // if we use code block with new swtich statement, instead of using return to get the value
        // we will use yield


    }
    public static String yieldShowoff (){
       return switch (3) {
            case 1 -> "Value was 1";
            case 2 -> "Value was 2";
            case 3, 4, 5 -> "Was a 3, a 4, or a 5";
            default -> {
                System.out.println("Was not 1, 2, 3, 4, or 5");
                yield "vrati";
            }
        };
    }
}
