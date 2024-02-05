public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","11/11/1985",
                "01.01/2020");
        System.out.println(tim);
        System.out.println("Age: " + tim.getAge());
        System.out.println("Pay: " + tim.collectPay());
        SalairedEmployee joe = new SalairedEmployee("Joe","11/11/1987",
                "03/05/2023",35000);
        System.out.println(joe);
        System.out.println("Joes paycheck + " + joe.collectPay());
        joe.retire();
        System.out.println("Joes pensions check = " + joe.collectPay());
        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970",
                "03/03/2025",15);
        System.out.println(mary);
        System.out.println("Mary paycheck = " + mary.collectPay());
        System.out.println("Mary holiday paycheckh = "+ mary.getDoublePay());
    }
}
