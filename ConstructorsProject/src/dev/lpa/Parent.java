package dev.lpa;

public class Parent {
    static {
        System.out.println("Parent static initializer: class bieng constructed");
    }
    private final String name;
    private final String dob;
    protected final int siblings;

    {
//        name = "John Doe";
//        dob = "01/01/1900";
        System.out.println("In parent initializer");
    }

//    public Parent() {
//        System.out.println("parent no args constructor");
//    }

    public Parent(String name, String dob, int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
        System.out.println("in parent constructor");
    }

    public String getName() {
        return name;
    }



    public String getDob() {
        return dob;
    }


    @Override
    public String toString() {
        return "name ='" + name + '\'' + ", dob='" + dob + '\'';
    }
}
