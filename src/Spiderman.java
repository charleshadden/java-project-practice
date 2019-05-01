public class Spiderman extends Hero {

    private String secretIdentityName = "Peter Parker";

    private void shootWeb() {
        System.out.println("Web Web Web !");
    }

    //method overriding
    //In addition to adding new fields, subclasses can override methods on the superclass. To do so,
    // the subclass must define a method with the same name, return type, and parameters as in the superclass.
    // This allows the subclass to provide it's own implementation of a method.

    @Override
    public void sayHello() {
        System.out.println("Hello I'm the friendly neighborhood " + name);
    }


    //A subclass inherits all the fields of it's superclass, and can re-use any of it's functionality.
    //It is important to note here that instances of the Hero class do not have access to either the
    // secretIdentityName property or the shootWeb method. Inheritance in one-directional, subclasses gain access to the
    // fields of their superclasses, but not the other way around.

    public static void main(String[] args) {
        Hero spiderman = new Hero("Spiderman");
        spiderman.sayHello();

        System.out.println(spiderman.name);
        Spiderman spiderman1 = new Spiderman();
        System.out.println(spiderman1.secretIdentityName);
        spiderman1.shootWeb();
        spiderman1.sayHello();

    }



};




