public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            LPAStudent s =new LPAStudent("S54367" + i,
                    switch (i){
                case 1 -> "Mary";
                case 2-> "Carrol";
                case 3 -> "Tim";
                case 4 -> "Tim4";
                case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/2005",
                    "Java Masterclass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("23423", "Ann",
                "05/23/2005",
                "JavaMasterclass");
        LPAStudent recordStudent = new LPAStudent("21423",
                "Tim", "09/11/1999",
                "JavaMastercalss");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);
        pojoStudent.setClassList(pojoStudent.getClassList() + " Java " +
                "OCP Exam 829");
//        recordStudent.setClassList(recordStudent.getClassList() + " Java " +
//                "OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());

    }
}
