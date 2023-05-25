package Day59;
import java.io.FileInputStream; // FileInputStream
import java.io.IOException; // IOException, printStackTrace, and .read()
import java.io.*; // all the aboveeeee

// Create a Java program that uses InputStreamReader and OutputStreamWriter.
// The program should read from a .txt file using InputStreamReader, convert the
// read data into uppercase, and then write the uppercase data to another .txt file using OutputStreamWriter.

public class Task4 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/Day59/input.txt");
            InputStreamReader reader = new InputStreamReader(fis); // a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i = reader.read()) != -1) {
                sb.append(Character.toUpperCase((char) i));
            }
            reader.close();

            // Uppercase the data
            FileOutputStream fos = new FileOutputStream("src/Day59/output.txt"); // change the file location!
            OutputStreamWriter osw = new OutputStreamWriter(fos); // a bridge from character streams to byte streams. Characters written to it are encoded into bytes using a specified charset.
            osw.write(sb.toString());
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

