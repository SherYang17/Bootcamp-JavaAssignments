package Day59.PracticingIOBasicsOPTIONAL;
import java.io.FileInputStream; // FileInputStream
import java.io.IOException; // IOException, printStackTrace, and .read()
import java.io.*; // all the aboveeeee

// Write a Java program that uses FileReader and FileWriter to read a .txt file and write its content
// to another .txt file in reverse order (i.e., the input file's last line becomes the output file's first line).


// The FileReader class is used to read data from a file. It uses the default character encoding of the system, which is why it is specifically meant for text files
// The FileWriter class is used to write data to a file. Like FileReader, FileWriter uses the default character encoding of the system.
public class Task5 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/Day59/PracticingIOBasicsOPTIONAL/input.txt"); // Write a Java program that uses FileReader and FileWriter to read a .txt file
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter("src/Day59/PracticingIOBasicsOPTIONAL/input.txt")) {// Write a Java program that uses FileReader and FileWriter to read a .txt file

            StringBuilder reversedContent = new StringBuilder();
            int character;
            while ((character = fr.read()) != -1) {
                reversedContent.insert(0, (char) character);
            }

            fw.write(reversedContent.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
