package Day59;
import java.io.FileInputStream; // FileInputStream
import java.io.IOException; // IOException, printStackTrace, and .read()
import java.io.*; // all the aboveeeee

//3. Modify the programs you wrote in tasks 1 and 2 to use BufferedInputStream and BufferedOutputStream, respectively.
//   Compare the performance of these versions with the original versions. Explain your observations.

// A BufferedInputStream is used to read information from a stream in a buffered manner. This class adds functionality to another input stream—it provides the ability to buffer the input and supports the mark and reset methods. Here's a basic usage example:
public class Task3 {

    public static void main(String[] args) {
        bufferedInputStream();
        bufferOutputStream();
    }

    public static void bufferedInputStream() { // A BufferedInputStream is used to read information from a stream in a buffered manner.
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/Day59/input.txt"))) {
            int data = bis.read();
            while(data != -1) {
                System.out.print((char) data);
                data = bis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // In this example, BufferedInputStream reads data from the file "src/Day59/input.txt". Reading data this way is significantly faster than reading a single byte at a time, especially for large files.

    public static void bufferOutputStream() { // A BufferedOutputStream is used to write information to a stream in a buffered manner.
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/Day59/input.txt"))) {
            String text = "PLEASE WORK I NEED YOU TO WORK";
            bos.write(text.getBytes());
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // In this example, BufferedOutputStream writes the string "Hello, world!" to the file "file.txt". The method write() writes data to a buffer in memory first.
    // When the buffer gets full, or when flush() is called, the buffer's content is written to the file. Writing data this way is faster than writing a single byte at a time.


}

// From canvas module, In this example, BufferedInputStream reads data from the file "src/Day59/input.txt". Reading data this way is significantly faster than reading a single byte at a time, especially for large files.
// Java's I/O streams are used to read or write data. If you read or write a byte of data at a time, it can be time-consuming. To solve this issue, Java provides buffered I/O streams. BufferedInputStream and BufferedOutputStream are two byte streams used to make input and output operations faster. They work by setting up a buffer in memory and reading or writing data in large blocks at a time, rather than a single byte at a time.
//It's important to use buffered streams in Java because they optimize I/O operations and make your programs run faster, particularly when dealing with large volumes of data or working with files or networks.









