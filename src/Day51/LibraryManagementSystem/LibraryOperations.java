package Day51.LibraryManagementSystem;

public interface LibraryOperations<T> {
    void addItem(T item);
    void removeItem(T item);
    void displayItems();
}


// interface looks basic, nothing else is needed
// https://www.digitalocean.com/community/tutorials/java-generics-example-method-class-interface