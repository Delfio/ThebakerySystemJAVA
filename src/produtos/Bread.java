package produtos;

public class Bread extends Product {

    public Bread(
        String Description,
        double Quantity
    ) {
        super(Description, 12.50, Quantity, "kg");
    }

    @Override
    public String imprimir() {
        String produto = "[PÃO]: " + this.getDescription() + " | Preço (" + this.getUnitOfMeasurement() + ") - " + this.getUnitPrice() + " | Quantidades no sistema: " + this.getQuantity();

        return produto;
    }
}