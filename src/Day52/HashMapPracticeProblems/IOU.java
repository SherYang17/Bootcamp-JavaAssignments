package Day52.HashMapPracticeProblems;
import java.util.HashMap;


public class IOU {
    private HashMap<String, Double> debts;


    public static void main(String[] args) {
        System.out.println("Matt owes Arthur, Michael");
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        System.out.println(" ");

//        IOU mattsIOU = new IOU();
        System.out.println("New values, IOU does not care about old debt. So now, Matt owes to Arthur");
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));


    }
    // constructor needs to have no arguments
    // this.debts = debts does not work since we are doing a "array" or "hash"
    //    public IOU(HashMap<String, Double> debts) {
    //        this.debts = debts;
    //    }

    public IOU() {
        debts = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        // saves the amount owed and the person owed to to the IOU.
        debts.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        // returns the amount owed to the person whose name is given as a parameter
        // If the person cannot be found, it returns 0.
        return debts.getOrDefault(toWhom, 0.0);
    }

}
