import java.util.Scanner;
public class FolumeTabung {
    

    public static double hitungVolume(double r, double t){
        return 3.14 * r * r * t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double r = sc.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = sc.nextDouble();

        double volume = hitungVolume(r, t);
        System.out.println("Volume tabung: " + volume);
    }
}


