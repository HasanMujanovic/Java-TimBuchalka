package dev.lpa;

public record Person(String name, String dob) {
//    public Person(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-','/');
////        this.dob = this.dob.trim();
//    }

    public Person(Person p) {
        this(p.name,p.dob);
    }

    public Person {

        // ovako bi trebalo da radi valjda al mi mucno da vracam video.!
//        if (dob == null) throw new IllegalAccessException("Bad data");
        if (dob == null) try {
            throw new IllegalAccessException("Bad data");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        dob = dob.replace('-','/');
    }
}
