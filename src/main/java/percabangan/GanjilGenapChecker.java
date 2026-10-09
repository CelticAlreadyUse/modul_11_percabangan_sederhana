package percabangan;

import java.util.Scanner;

public class GanjilGenapChecker {
    public static void main(String[] args){

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("Masukkan angka: ");
            double angka = userInput.nextDouble();
            if (angka % 2 == 0) {
                System.out.println("Angka " + angka + " adalah genap");
            } else {
                System.out.println("Angka " + angka + " adalah ganjil");
            }
        }

    }

}


// Jika angka habis di bagi = 2 maka mengembalika genap
// Jika tidak kembalikan ganjil
// cth 5 : 2 masih memiliki sisa dan tidak habis = 0 maka 5 bukanlah bilangan genap
// cth 4:2 = 2:2 = 0 . tidak memiliki sisa maka 4 adalah genap