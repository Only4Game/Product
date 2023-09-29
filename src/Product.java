public class Product {
    String name;

    int amount;

    double price;

    int vat;

    public Product(String name, int amount, double price, int vat) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.vat = vat;
    }

    public double calculateWithVatPrice() {
        return (this.price * (1 + (double)this.vat/100)) * this.amount;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}
