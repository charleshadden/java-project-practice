public class Hero {

    //To provide this functionality, we can also designate
    // a field as protected. This means that the field is not visible outside of the class,
    // but is visible to classes that extend the class that the field is defined in.
    protected String name;

    public Hero(){};

    public Hero(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }
}
