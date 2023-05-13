package Day50.ObjectsInLists;
import java.util.ArrayList;
import java.util.Scanner;


public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name:");
            String name = scanner.nextLine();

            if(name.isEmpty()){
                break;
            }

            System.out.print("Is it a dog? Yes or no:");
            String yesOrNo = scanner.nextLine().toLowerCase();
            boolean isDog = yesOrNo.equals("yes");

            Animal mydoggyobject = new Animal(name, isDog);
            animals.add(mydoggyobject);

//            animals.add(new Animal(name, isDog)); alternate way to write
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
