package order;

import java.util.ArrayList;
import produtos.Product;

public class Order {
    private ArrayList<Product> ListOfProducts;
    private String Client;
    
    public Order(String cliente) {
        this.Client = cliente;

        this.ListOfProducts = new ArrayList<Product>();
    }

    public void AdProct(Product product) {
        this.ListOfProducts.add(product);
    }

    public String ListOfAllProducts() {
        String List = "[CLIENTE] - " + this.Client + "\n";

        for (Product product : ListOfProducts) {
            List = List + "\n" + product.imprimir();
        }

        return List;
    }
}
