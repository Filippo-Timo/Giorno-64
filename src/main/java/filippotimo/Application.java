package filippotimo;

import com.github.javafaker.Faker;
import filippotimo.entities.Customer;
import filippotimo.entities.Order;
import filippotimo.entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;


public class Application {

    public static void main(String[] args) {
        Faker faker = new Faker(Locale.ITALIAN);


        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Order> orders = new ArrayList<Order>();
        ArrayList<Product> products = new ArrayList<Product>();

        customers.add(new Customer("Filippo"));
        customers.add(new Customer("Rita"));
        customers.add(new Customer("Mario"));
        customers.add(new Customer("Marco"));
        customers.add(new Customer("Rodolfo"));
        customers.add(new Customer("Tommaso"));
        customers.add(new Customer("Giovanni"));
        customers.add(new Customer("Riccardo"));
        customers.add(new Customer("Marta"));
        customers.add(new Customer("Valentino"));

        products.add(new Product("Computer", "Boys"));
        products.add(new Product("Il signore degli anelli", "Books"));
        products.add(new Product("Culla", "Baby"));
        products.add(new Product("Don Chisciotte della Mancia", "Books"));
        products.add(new Product("Sigaretta elettronica", "Boys"));
        products.add(new Product("Ps5", "Boys"));
        products.add(new Product("Io sono programmatore", "Books"));
        products.add(new Product("Diario di un programmatore", "Books"));
        products.add(new Product("Sonaglietto", "Baby"));
        products.add(new Product("Biberon", "Baby"));
        products.add(new Product("Palla da calcio", "Boys"));

        //      -------------------------------------------------------------- PRIMO ORDINE --------------------------------------------------------------
        ArrayList<Product> carrello1 = new ArrayList<Product>();
        carrello1.add(products.get(0));
        carrello1.add(products.get(7));
        carrello1.add(products.get(5));

        orders.add(new Order("Pagato", LocalDate.of(2025, 9, 25), carrello1, customers.get(3)));

        //      -------------------------------------------------------------- SECONDO ORDINE --------------------------------------------------------------
        ArrayList<Product> carrello2 = new ArrayList<Product>();
        carrello2.add(products.get(8));
        carrello2.add(products.get(6));
        carrello2.add(products.get(9));

        orders.add(new Order("Pagato", LocalDate.of(2021, 2, 15), carrello2, customers.get(0)));


        //      -------------------------------------------------------------- TERZO ORDINE --------------------------------------------------------------
        ArrayList<Product> carrello3 = new ArrayList<Product>();
        carrello3.add(products.get(2));
        carrello3.add(products.get(4));
        carrello3.add(products.get(5));

        orders.add(new Order("Pagato", LocalDate.of(2023, 12, 6), carrello3, customers.get(7)));


        //      -------------------------------------------------------------- QUARTO ORDINE --------------------------------------------------------------
        ArrayList<Product> carrello4 = new ArrayList<Product>();
        carrello4.add(products.get(2));
        carrello4.add(products.get(8));
        carrello4.add(products.get(9));

        orders.add(new Order("Pagato", LocalDate.of(2021, 2, 15), carrello2, customers.get(1)));

        System.out.println("---------------------------------------------- PRIMO ESERCIZIO ----------------------------------------------");

        
    }
}
