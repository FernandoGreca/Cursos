import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // --------------- Leitura dos dados do cliente --------------- 
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        // --------------- Criação do objeto 'client' ---------------
        Client client = new Client(name, email, birthDate);

        // --------------- Leitura da variável do tipo OrderStatus 'status', para salvar o estado do pedido ---------------
        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        // --------------- Criação do objeto 'order' ---------------
        Order order = new Order(new Date(), status, client);

        // --------------- Pergunta a quantidade de items serão cadastrados ---------------
        System.out.println();
        System.out.print("How many items to this order? ");
        Integer n = sc.nextInt();

        // --------------- Realiza um loop 'for' para a quantidade de itens digitado anteriormente ---------------
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println();
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product name: ");
            String nameProduct = sc.nextLine();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quatity: ");
            int quantity = sc.nextInt();

            // --------------- Criação do objeto 'product', recebendo as variáveis nome e preco do respectivo produto ---------------
            Product produtc = new Product(nameProduct, priceProduct);

            // --------------- Criação do objeto 'it', recebendo as variáveis quantidade, preço do produt e o objeto produto criado anteriormente ---------------
            OrderItem it = new OrderItem(quantity, priceProduct, produtc);

            // --------------- Adiciona o objeto 'it' ao objeto 'order' ---------------
            order.addItem(it);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        sc.close();
    }
}
