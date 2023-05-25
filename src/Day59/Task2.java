package Day59;
import java.io.FileInputStream; // FileInputStream
import java.io.IOException; // IOException, printStackTrace, and .read()
import java.io.*; // all the aboveeeee
// 2. Write a Java program that uses FileOutputStream to write data to a .txt file.
// The data should be a string of your choosing.
// Verify the result by opening the file and checking its contents.

// FileOutputStream is used for writing data to a file.
// you open a stream to a file (creating it if necessary) and write data byte by byte. Like FileInputStream, FileOutputStream is meant for writing raw bytes. For writing streams of characters, FileWriter is usually a better choice.
public class Task2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/Day59/input.txt")) {
            String str = "Task 2, I am changing all of your contents!";
            fos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
