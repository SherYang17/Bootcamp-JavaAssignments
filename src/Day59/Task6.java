package Day59;
import java.io.FileInputStream; // FileInputStream
import java.io.IOException; // IOException, printStackTrace, and .read()
import java.io.*; // all the aboveeeee


// Write a Java program that uses DataInputStream and DataOutputStream to write
// primitive data types to a file and then read them back.
// The data types should include: int, float, boolean, and char.

// In Java, DataInputStream and DataOutputStream are classes provided by the java.io package that let you read and
// write Java primitives (boolean, char, byte, short, int, long, float, and double) in a portable way.
public class Task6 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/Day59/output.dat"))) { // DataInputStream It has methods to read all of Java's primitive types.
            int i = dis.readInt();
            float f = dis.readFloat();
            boolean b = dis.readBoolean();
            char c = dis.readChar();
            System.out.printf("Read: i=%d, f=%.2f, b=%b, c=%c%n", i, f, b, c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/Day59/output.dat"))) { // DataOutputStream It has methods to write all of Java's primitive types.
            int i = 123;       // The data types should include: int, float, boolean, and char.
            float f = 123.45f; // The data types should include: int, float, boolean, and char.
            boolean b = true;  // The data types should include: int, float, boolean, and char.
            char c = 'A';      // The data types should include: int, float, boolean, and char. // The char keyword is a data type that is used to store a single character. // A char value must be surrounded by single quotes, like 'A' or 'c'.

            dos.writeInt(i);
            dos.writeFloat(f);
            dos.writeBoolean(b);
            dos.writeChar(c);

            System.out.println("Data written to output.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // then read back

    }


}



// for some reason the modules refer to 2 seperate files. Both fileinput and outputinput should be the same.

// The DataInputStream and DataOutputStream classes are quite powerful, as they allow you to read and write Java's
// primitive data types in a portable way. This means that you can write data on one machine and read it on another, even if the two machines use different internal representations for these data types.
