package Day52.HashMapPracticeProblems;
import java.util.HashMap;

public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("Matthew", "Matt");
        names.put("Michael", "Mix");
        names.put("Arthur", "Artie");

        String matthewName = names.get("Matthew");
        System.out.println(matthewName);

    }




}

// You can add elements to a HashMap using the put method. It takes two parameters: the key and the value.
// map.put("Apple", 1); map.put("Banana", 2);

// To access an element in the HashMap, you can use the get method with the key as the parameter.
// int value = map.get("Apple"); // value will be 1

