package Day49.ClassObjectConstructorPractice;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product (4, 10, "Gallons of gas");
        product.printProduct();
        product.totalCost();
    }
}

class Product {
    private double productCost;
    private int productQuantity;
    private String productName;

    public Product(double productCost, int productQuantity, String productName) {
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        this.productName = productName;
    }

    public void totalCost () {
        double total = productCost * productQuantity;
        System.out.println("Total cost is $" + total);
    }

    public void printProduct () {

        System.out.println("The cost of one " + productName + "is $" + productCost + ".");
        System.out.println(productQuantity + " " + productName + " was purchased.");
    }



}
