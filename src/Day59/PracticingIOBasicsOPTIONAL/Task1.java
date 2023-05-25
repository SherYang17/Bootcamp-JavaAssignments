package Day59.PracticingIOBasicsOPTIONAL;
// Write a simple Java program that uses FileInputStream to read a file byte by byte.
// 1. The file should be a .txt file of your choosing that contains several lines of text. Output the read data to the console.

// FileInputStream is used for reading data from a file
// open a stream from an existing file and read data byte by byte.
// It's important to note that FileInputStream is meant to read raw bytes, such as image data.
// For reading streams of characters, consider using FileReader.

import java.io.FileInputStream; // FileInputStream
import java.io.IOException; // IOException, printStackTrace, and .read()
import java.io.*; // all the aboveeeee

public class Task1 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/Day59/PracticingIOBasicsOPTIONAL/input.txt")) { // have to specify the path since I'm 1 level down the src...
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// From the module in canvas, in this example, we read bytes from the file input.txt and cast each byte to a char to print the contents of the file.
