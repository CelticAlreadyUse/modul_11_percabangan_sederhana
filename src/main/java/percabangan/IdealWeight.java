package percabangan;

import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args) {
        try(Scanner input =  new Scanner(System.in);){
        double bWeight, bTall, weightCal;
        System.out.println(" Masukan berat badan");
        bWeight = input.nextDouble();
        System.out.println(" Masukan tinggi badan");
        bTall =  input.nextDouble();

        weightCal = bTall - bWeight;
        if (weightCal >= 90 && weightCal <= 110){
            System.out.println("Berat badan ideal");
        }else if ( weightCal < 90){
            System.out.println("Terlalu Kurus");
        }else{
            System.out.println("Terlalu gemuk");
        }

    }
    }
}
