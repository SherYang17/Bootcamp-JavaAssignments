package Day50.BankAccount.OverloadingPractice;

public class AnimalConstructors {
    public static void main(String[] args) {
        Animal myAnimal = new Animal ("max", true);
        Book mybooks = new Book ("Book Title", 100, 2023);
        TVShows myTvShows = new TVShows ("Breaking Bad", 100, "Crime");

        System.out.println(myAnimal);
        System.out.println(mybooks); // added a getter in Book that was not originally in last homework... if the homework intended to not use a getter please let me know it is as simple as removing the lines 26-29 in book.java
        System.out.println(myTvShows);
    }
}
