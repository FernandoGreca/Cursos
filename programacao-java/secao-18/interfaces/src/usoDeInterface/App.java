package usoDeInterface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import semInterface.model.entities.CarRental;
import semInterface.model.entities.Vehicle;
import semInterface.model.services.BrazilTaxService;
import semInterface.model.services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental car01 = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Entre com o preco por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preco por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService retalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        retalService.processInvoice(car01);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + String.format("%.2f",  car01.getInvoice().getBasicPayment()));
        System.out.println("Inposto: " + String.format("%.2f", car01.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f", car01.getInvoice().getTotalPayment()));

        sc.close();
    }
}
