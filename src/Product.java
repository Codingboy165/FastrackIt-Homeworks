public class Product {
    String name;
    double price;
    int quantity;
    String category;

    public Product(String name, String category1, int quantity, double price) {
        System.out.println("Starting to analyze a product:");
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category1;
    }

    public String getName() {
        return String.format("This is the product name: %s", this.name);
    }

    public String getTheName() {
        return this.name;
    }

    public String getPrice() {
        return String.format("This is the product price: %,.2" + "f", this.price);
    }

    public String getQuantity() {
        return String.format("This is the product quantity : %d", this.quantity);
    }

    public String getCategory() {
        return String.format("This is the product category: %s", this.category);
    }

    public boolean hasStock() {
        return this.quantity > 0;
    }

    public boolean isCategory(String category) {
        return this.category.equals(category);
    }


}


















