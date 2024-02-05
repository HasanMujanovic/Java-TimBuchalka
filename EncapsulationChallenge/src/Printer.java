public class Printer {
    private  int tonnerLevel;
    private  int pagesPrinted;
    private  boolean duplex;

    public Printer(int tonnerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonnerLevel = (tonnerLevel >= 0 && tonnerLevel <= 100) ? tonnerLevel : -1;
        this.duplex = duplex;
    }

    private int addToner(int tonerAmount){
   int tempAmount = tonerAmount + tonnerLevel;
   if (tempAmount > 100 || tempAmount < 0){
       return -1;
   }
   this.tonnerLevel += tonerAmount;
   return tonnerLevel;
}
public int printPages(int pagesToPrint){
//    if (duplex){
//        System.out.println("It is a duplex printer, and it will print" +
//                pagesToPrint/2+" pages");
//        this.pagesPrinted += pagesToPrint / 2;
//    }else {
//        this.pagesPrinted += pagesToPrint;
//    }
    int jobPages = (duplex) ? (pagesToPrint/2) + (pagesToPrint % 2): pagesToPrint;
    pagesPrinted += jobPages;
    return jobPages;
}

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
