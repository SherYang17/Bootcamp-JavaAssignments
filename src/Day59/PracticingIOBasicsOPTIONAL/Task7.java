package Day59.PracticingIOBasicsOPTIONAL;

import java.io.*; // all the aboveeeee

// Implement a simple object serialization and deserialization using ObjectOutputStream and ObjectInputStream.
// Define a class with some attributes, create an instance of the class, serialize the object to a file,
// then read the file and deserialize the object.

// The ObjectInputStream and ObjectOutputStream classes are part of the Java I/O system and reside in the java.io package. They are used for serializing and deserializing an object, a process also known as Object Serialization in Java.
public class Task7 {
    public static void main(String[] args) {
        // Serialize object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Day59/PracticingIOBasicsOPTIONAL/student.ser"))) {
            Student s1 = new Student("John", 101);
            out.writeObject(s1);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize object from file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Day59/PracticingIOBasicsOPTIONAL/student.ser"))) {
            Student s = (Student) in.readObject();
            System.out.println("Object has been deserialized ");
            System.out.println("Name: " + s.name);
            System.out.println("Roll: " + s.roll);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


class Student implements Serializable {
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

}


// basically copy paste from the module but! This was an example.
// In this code, we read the serialized Student object from "student.ser", deserialize it, and print its data.
// Object Serialization is vital for:
//
//Persisting state: You can store the state of an object in a file or a database and retrieve it later.
// Network communication: In distributed computing, objects may need to be passed around over a network.
// Serialization allows you to convert an object into a format that can be easily sent over a network and
// then reconstructed on the other side.


// Student implements the Serializable interface which indicated that the class can be serealized.
// 1. Created instance of student and serialize it to a file student.ser using objectoutputstream
// 2. The writeobject method writes the object to the output stream
// 3. read the serialized object from the file with objectinputstream. readobject method deserializes the
// object and casts it student to print the attributes





