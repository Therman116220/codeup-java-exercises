package src.practiceWithAlgorithms;


import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> manager = new HashMap<>();

        manager.put("Key", 1);
        manager.put("KeyTwo", 2);
        manager.put("KeyThree", 3);
        manager.put("KeyFour", 4);

        System.out.println(manager);
        System.out.println("searching for value of KeyThree by isolating the Key: ");
        System.out.println(manager.containsKey("KeyThree"));
        System.out.println("Grabbing KeyThree by isolating it's Value: ");
        System.out.println(manager.containsValue(3));

        System.out.println(manager);

        System.out.println(manager.get("Key"));
        System.out.println(manager.get("KeyTwo"));
        System.out.println(manager.replace("KeyFour", 4, 1010));
        System.out.println(manager);
    }
}
