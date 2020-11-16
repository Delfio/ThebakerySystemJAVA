package produtos;

public class Milk extends Product {
   
    public Milk(
        String Description,
        double Quantity
    ) {
        super(Description, 4.00, Quantity, "L");
    }

    @Override
    public String imprimir() {
        String produto = "[Leite]: " + this.getDescription() + " | Preço (" + this.getUnitOfMeasurement() + ") - " + this.getUnitPrice() + " | Quantidades no sistema: " + this.getQuantity();

        return produto;
    } 
}
