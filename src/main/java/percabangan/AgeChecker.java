package percabangan;

import java.util.Scanner;

public class AgeChecker {
    public static void main (String[] args) {
        try  (Scanner userInput = new Scanner(System.in);) {
       
        int person1,person2;
        String person1Name, person2Name;

        System.out.println(" Masukan nama orang pertama ");
        person1Name =  userInput.next();
        
        System.out.println(" Masukan Umur orang pertama ");
        person1 =  userInput.nextInt();
        
        System.out.println(" Masukan nama orang ke 2 ");
        person2Name = userInput.next();
        
        System.out.println("Masukan Umur orang kedua");
        person2 =  userInput.nextInt();
            
        if (person1 > person2){
            System.out.printf("%s lebih tua dari %s \n", person1Name,person2Name);
            System.out.printf("Selisih umur %d ", person1-person2);
        }else if (person1 == person2) {
            System.out.println("Kedua orang punya umur yang sama");
        }else{
            System.out.printf("%s lebih muda dari pada %s \n",person1Name,person2Name);
            System.out.printf("Selisih umur : %d tahun", person2-person1);
        }
        }
    }

}


