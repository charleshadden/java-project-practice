public class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println("The dog says: woof woof");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz");
    }
}

class MyMainClass {
    public static void main(String[] args) {
        Dog diesel = new Dog();
        diesel.animalSound();
        diesel.sleep();
    }
}
