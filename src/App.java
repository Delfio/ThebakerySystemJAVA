import java.util.Scanner;

import order.Order;
import produtos.Bread;
import produtos.Cheese;
import produtos.Milk;
import produtos.Product;

public class App {
    static Scanner sc;
    static Order ordem;
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos começar o cadastro de itens");
        sc = new Scanner(System.in);

        System.out.print("Seu nome: ");
        String cliente = sc.nextLine();

        ordem = new Order(cliente);

        int Opcao = 0;

        while(Opcao != 5) {
            System.out.println("");

            System.out.println("O que você deseja fazer com sua ordem de pedidos?");
            System.out.println("[1] - Cadastrar Pão ");
            System.out.println("[2] - Cadastrar Queijo ");
            System.out.println("[3] - Cadastrar Leite ");
            System.out.println("[4] - Listar produtos ");
            System.out.println("[5] - Encerrar programa ");
            
            Opcao = sc.nextInt();

            switch (Opcao) {
                case 1:
                    ordem.AdProct(CadastrarBread());
                    break;

                case 2:
                    ordem.AdProct(CadastrarCheese());
                    break;

                case 3:
                    ordem.AdProct(CadastrarMilk());
                    break;
                case 4:
                    System.out.println(ordem.ListOfAllProducts());
                    break;
                default:
                    break;
            }


        }
        
        sc.close();
    }

    public static Product CadastrarBread() {
        System.out.println("Vamos cadastrar Pães");
        String Description = "";
        double Quantity = 0;

        while(Description.equals("")) {
            System.out.println("Qual tipo de pão você deseja cadastra?");
            System.out.println("[1] - Pão doce");
            System.out.println("[2] - Pão francês");
            System.out.println("[3] - Pão massa fina");
            int OpcaoDePao = sc.nextInt();
            
            switch (OpcaoDePao) {
                case 1:
                    Description = "Pão Doce";
                    break;
                case 2:
                    Description = "Pão Francês";
                    break;
                case 3:
                    Description = "Pão Massa Fina";
                    break;
                default:
                    break;
            }
        }

        while(Quantity <= 0) {
            System.out.println("Quantas unidades você deseja adicionar kg - acima de 0");
            Double quantidade = sc.nextDouble();
            if(quantidade <= 0) {
                continue;
            } else {
                Quantity = quantidade;
            }
            
        }
        Bread bread = new Bread(Description, Quantity);

        return bread;
    }

    public static Product CadastrarCheese() {
        System.out.println("Vamos cadastrar Queijos");
        String Description = "";
        double Quantity = 0;

        while(Description.equals("")) {
            System.out.println("Qual tipo de queijo você deseja adicionar?");
            System.out.println("[1] - Queijo Cheedar");
            System.out.println("[2] - Queijo Qualho");
            System.out.println("[3] - Queijo Normal");
            int OpcaoDePao = sc.nextInt();
            
            switch (OpcaoDePao) {
                case 1:
                    Description = "Queijo Cheedar";
                    break;
                case 2:
                    Description = "Queijo Qualho";
                    break;
                case 3:
                    Description = "Queijo Normal";
                    break;
                default:
                    break;
            }
        }

        while(Quantity <= 0) {
            System.out.println("Quantas unidades você deseja adicionar KG - acima de 0");
            double quantidade = sc.nextDouble();
            if(quantidade <= 0) {
                continue;
            } else {
                Quantity = quantidade;
            }
            
        }

        Cheese cheese = new Cheese(Description, Quantity);

        return cheese;
    }

    public static Product CadastrarMilk() {
        System.out.println("Vamos cadastrar Milk");
        String Description = "";
        double Quantity = 0;

        while(Description.equals("")) {
            System.out.println("Qual tipo de leite você quer cadastrar?");
            System.out.println("[1] - Leite Integral");
            System.out.println("[2] - Leite Desnatado");
            System.out.println("[3] - Leite De Soja");
            int OpcaoDePao = sc.nextInt();
            
            switch (OpcaoDePao) {
                case 1:
                    Description = "Leite Integral";
                    break;
                case 2:
                    Description = "Leite Desnatado";
                    break;
                case 3:
                    Description = "Leite De Soja";
                    break;
                default:
                    break;
            }
        }

        while(Quantity <= 0) {
            System.out.println("Quantas unidades você deseja adicionar Litros - acima de 0");
            double quantidade = sc.nextDouble();
            if(quantidade <= 0) {
                continue;
            } else {
                Quantity = quantidade;
            }
            
        }

        Milk cheese = new Milk(Description, Quantity);

        return cheese;
    }
}
