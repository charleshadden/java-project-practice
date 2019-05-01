import java.util.ArrayList;
import java.util.HashMap;

public class Collections {

    public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<>();
        pets.add("Diesel");
        pets.add("Fraulein");
        pets.add("Cat");

        System.out.println(pets.isEmpty());

        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Charles", "chzz2289");
        usernames.put("Diesel", "diesel0913");
        usernames.put("Fraulein", "frau0818");

        System.out.println(usernames);
        System.out.println(usernames.get("Fraulein"));
    }


}
