package Day51.LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;


public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }




    @Override
    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public void removeItem(T item) {
        items.remove(item);
    }

    @Override
    public void displayItems() {
        for(T item : items) {
            System.out.println(item.getItemDetails());
        }
    }
}
