public class enums {

    enum Pets {
        Diesel,
        Fraulein,
        Cat
    }

    public static void main(String[] args) {
        for(Pets dogs : Pets.values()) {
            System.out.println(dogs);
        }
    }
}
