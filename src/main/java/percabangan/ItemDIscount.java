package percabangan;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Product {

    NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
    int id;
    String name;
    String description;
    double price;
    int stock;

    Product(int id,String name, String description, double price, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    void display() {
        System.out.printf("id: %d \n name: %s \n description: %s \n price: %s, stock: %s \n",id,name,description,usFormatter.format(price),stock);
    }
}

class Cart{
    int id;
    int productId;
    int stockAmount;

    Cart(int id, int productId, int stockAmount ) {
        this.id = id;
        this.productId= productId;
        this.stockAmount = stockAmount;
    }
}
public class ItemDIscount {
    private static Product[] InitProduct(){
        Product[] products = {
            new Product(
            1,
            "Laptop",
            "Laptop gaming ganteng idaman",
            100000,
            10
            ),
            new Product(
                2,
                "Handphone",
                "Handphone xioami mi mix 2",
                300000,
                10
            ),
            new Product(
                3,
                "mouse",
                "Mouse laptop",
                120000,
                70
            ),
            new Product(
                4,
                "Buku Tulis",
                "Buku tulis binder",
                60000,
                5
            )
        };
      return products;
    }
    public static void main(String[] args){
        try (Scanner userInput = new Scanner(System.in)) {
            Product[] products = InitProduct();
            System.out.println("Selamat Datang di TOKO Gweeh");
            System.out.println("Berikut list barang yang tersedia: ");
            for (Product product : products) {
                product.display();
            }
            System.out.println("Masukan id barang");
            int productId = userInput.nextInt();
            System.out.println("Masukan Jumlah barang");
            int stockInput = userInput.nextInt();
            System.out.printf("Produk %d dipilih sebanyak %d barang.%n", productId, stockInput);
        }
    }
}
