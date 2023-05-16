package Day52.HashMapPracticeProblems;
import java.util.HashMap;
public class Abbreviations {
    private static HashMap<String, String> hash = new HashMap<>();

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();
    }

    public Abbreviations() { // A constructor with no parameters
    }

    public void addAbbreviation(String abbreviation, String explanation) { // adds a new abbreviation and its explanation.
        hash.put(abbreviation, explanation);

    }

    public boolean hasAbbreviation(String abbreviation) { //  checks if an abbreviation has already been added; returns true if it has and false if it has not.
        return hash.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) { // finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
        return hash.get(abbreviation); // it should return null automatically if not found
    }

}


// You can add elements to a HashMap using the put method. It takes two parameters: the key and the value.
// You can check if a key exists in the HashMap using the containsKey method.
// To access an element in the HashMap, you can use the get method with the key as the parameter.