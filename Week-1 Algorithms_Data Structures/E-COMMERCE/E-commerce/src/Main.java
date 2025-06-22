public class Main {
    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Shoes", "Footwear")
        };

        // Linear Search
        Product resultLinear = ProductSearch.linearSearch(products, "Phone");
        if (resultLinear != null)
            System.out.println("Linear Search Found: " + resultLinear);
        else
            System.out.println("Linear Search: Product not found.");

        // Sort before Binary Search
        ProductSearch.sortByName(products);

        // Binary Search
        Product resultBinary = ProductSearch.binarySearch(products, "Phone");
        if (resultBinary != null)
            System.out.println("Binary Search Found: " + resultBinary);
        else
            System.out.println("Binary Search: Product not found.");
    }
}
