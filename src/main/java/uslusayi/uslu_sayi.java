package uslusayi;
import java.util.Scanner;
public class uslu_sayi {
    public static void main(String[] args) {
        int n,k;

        Scanner input=new Scanner(System.in);
        System.out.println("Üssü alıncak sayı:");
        n=input.nextInt();
        System.out.println("Üs olacak sayı:");
        k=input.nextInt();

       int carpim=1;
       for (int i=1; i<=k; i++)


           carpim *=n;
        System.out.println(carpim);
    }
}
