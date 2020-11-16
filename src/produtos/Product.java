package produtos;

public abstract class Product {
    private String Description;
    private double UnitPrice;
    private double Quantity;
    private String UnitOfMeasurement;
     
    public Product(
        String Description,
        double UnitPrice,
        double Quantity,
        String UnitOfMeasurement
    ) {
        this.Description = Description;
        this.UnitPrice = UnitPrice;
        this.Quantity = Quantity;
        this.UnitOfMeasurement = UnitOfMeasurement;
    }

    protected String getDescription() {
        return Description;
    }

    public double getQuantity() {
        return Quantity;
    }
    
    public double getUnitPrice() {
        return UnitPrice;
    }

    protected void setDescription(String description) {
        this.Description = description;
    }

    protected void setQuantity(double quantity) {
        this.Quantity = quantity;
    }

    protected void setUnitPrice(double unitPrice) {
        this.UnitPrice = unitPrice;
    }

    public abstract String imprimir();

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        UnitOfMeasurement = unitOfMeasurement;
    }

    public String getUnitOfMeasurement() {
        return UnitOfMeasurement;
    }

}
