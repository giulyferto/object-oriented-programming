package ar.com.ada.online.second.tesacamosunojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Cart {
    public static String dayOfWeek;
    public static Integer amountOfToys = 0;
    public static Double partialPriceToys = 0d;
    public static String paymentMethod;
    private ArrayList<Product> products;


    //constructor
    public Cart() {
        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.US);
        Date now = new Date();
        Cart.dayOfWeek = formatter.format(now);
        this.products = new ArrayList<>();
    }

    //metodo
    public void addProduct(Product product) {
        if (product instanceof Toys) {
            amountOfToys++;
            partialPriceToys += product.getPrice();
        }
        this.products.add(product);
    }

    public void generateAndPrintTicket(Scanner keyboard) {
        Double paymentWithoutDiscount = 0d;
        Double totalDiscount = 0d;
        Double totalPayment;

        System.out.println("Seleccione el metodo de pago: \n\t1) Tarjeta de debito\n\t2) Tarjeta de credito\n\t3) Efectivo");
        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                paymentMethod = "tdd";
                break;
            case 2:
                paymentMethod = "tdc";
            default:
                paymentMethod = "cash";
        }
        System.out.println("\nNombre \t Precio \t Descuento");
        for (Product product : this.products) {
            product.calculateDiscount();
            paymentWithoutDiscount += product.getPrice();
            totalDiscount += product.getDiscount();

            System.out.printf(
                    "%s\t\t%.2f\t\t%.2f\n",
                    product.getName(),
                    product.getPrice(),
                    product.getDiscount()
            );
        }

        totalPayment = paymentWithoutDiscount - totalDiscount;

        System.out.printf("\nTotal sin descuento: $ %.2f\n", paymentWithoutDiscount);
        System.out.printf("Descuento: $ %.2f\n", totalDiscount);
        System.out.printf("Total a pagar: $ %.2f\n", totalPayment);
    }

}
