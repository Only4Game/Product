public class Main {
    public static void main(String[] args) {
        Product mleko = new Product("Łaciate", 5, 4.25, 23);
        Product cukier = new Product("Diament", 10, 3.90, 15);
        Product sok = new Product("Bracia Sadownicy", 3, 5.99,20);

        System.out.println(mleko);
        System.out.println(cukier);
        System.out.println(sok);

        double priceWithVat = mleko.calculateWithVatPrice();
        System.out.println("Wartość produktów to: " + Math.round(priceWithVat) + " zł");

        priceWithVat = cukier.calculateWithVatPrice();
        System.out.println("Wartość produktów to: " + Math.round(priceWithVat) + " zł");

        priceWithVat = sok.calculateWithVatPrice();
        System.out.println("Wartość produktów to: " + Math.round(priceWithVat) + " zł");
    }
}