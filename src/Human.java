public class Human {

    private String name;

    public Human (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println("The persons name is " + name);
    }

    public static void main(String[] args) {
        Human charles = new Human("charles");
        charles.getName();
        charles.setName("John");
        charles.sayHello("charles");
    }
}
