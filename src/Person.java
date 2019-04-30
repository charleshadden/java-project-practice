public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//as the name variable is declared as private, we cannot access it from outside this class:

//class myClass {
//    public static void main(String[] args) {
//        Person newPerson = new Person();
//        newPerson.name = "charles";
//        System.out.println(newPerson.name);
//    }
//}

//Instead, we use the getName() and setName() methods to acccess and update the variable:


class myClass {
    public static void main(String[] args) {
        Person newGuy = new Person();
        newGuy.setName("Jackie");
        System.out.println(newGuy.getName());
    }
}

//Why Encapsulation?
//Better control of class attributes and methods
//Class variables can be made read-only (if you omit the set method), or write-only (if you omit the get method)
//Flexible: the programmer can change one part of the code without affecting other parts
//Increased security of data
