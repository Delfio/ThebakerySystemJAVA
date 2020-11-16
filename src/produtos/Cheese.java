package produtos;

public class Cheese extends Product {

    public Cheese(
        String Description,
        double Quantity
    ) {
        super(Description, 15.15, Quantity, "kg");
    }

    @Override
    public String imprimir() {
        String produto = "[Queijo]: " + this.getDescription() + " | Preço (" + this.getUnitOfMeasurement() + ") - " + this.getUnitPrice() + " | Quantidades no sistema: " + this.getQuantity();

        return produto;
    }
}