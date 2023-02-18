import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;
        double artikyil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl bilgisini giriniz: ");
        yil = input.nextInt();

        if (yil % 100 != 0) {
            if (yil % 4 == 0) {
                System.out.print("Artık bir yıldır.");
            } else {
                System.out.println("Artık bir yıl degildir.");
            }
        } else {
            if (yil % 400 == 0) {
                System.out.print("Artık bir yıldır.");
            } else {
                System.out.print("Artık bir yıl degildir.");
            }
        }
    }
}