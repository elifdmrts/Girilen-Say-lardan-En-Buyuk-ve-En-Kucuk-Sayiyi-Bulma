package minmax;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList();

        int min;
        int max;
        for (min = 1; min <= n; ++min) {
            System.out.print("(" + min + ")Sayıyı giriniz : ");
            max = scanner.nextInt();
            numbers.add(max);
        }

        min = (Integer) Collections.min(numbers);
        max = (Integer) Collections.max(numbers);
        System.out.println("En Küçük Sayı: " + min + "\nEn Büyük Sayı: " + max);
    }
}




      /*  int sayı, deger,i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:  ");
        sayı = scanner.nextInt();


       for ( i=1; i<sayı ; i++);
        {
            System.out.print("Sayıyı Giriniz: ");
            deger = scanner.nextInt();
            System.out.println(i++);

        }*/
