public class Main extends Object {
    public static void main(String[] args) {
        Student max = new Student("Max",21);
        System.out.println(max);
        PrimaerySchoolStudent jimmy = new PrimaerySchoolStudent("Jimmy",8,
                "Carole");
        System.out.println(jimmy);
    }
}
class Student{
    private String name;
    private int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}
class PrimaerySchoolStudent extends Student{
    private String parentName;
    PrimaerySchoolStudent(String name, int age, String parentName){
        super(name,age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}