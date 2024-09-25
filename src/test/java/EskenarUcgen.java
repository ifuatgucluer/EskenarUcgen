import java.util.Scanner;

public class EskenarUcgen {

    public static void main(String[] args) {

        // Soru 4 - Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın,
        // üçgen eşkenar ise "Eşkenar üçgen" yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz...");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Üçgeniniz Eskenar, İşleriniz hep tam karar");
        }
    }
}
