import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km  ,mintutar=20 ;
        double kmbasina = 2.20 , tutar=10;
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Lutfen gideceginiz km cinsinden degeri giriniz : ");
        km=input.nextInt();
        tutar+=(kmbasina*km);
        tutar= (tutar<20) ? 20 : tutar;
        System.out.println("Toplam tutar : " + tutar);


    }
}
