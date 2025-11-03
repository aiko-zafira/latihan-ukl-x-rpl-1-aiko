import java.util.Scanner;
public class RatarataNilai {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlah = sc.nextInt();

        double total = 0;

        for(int i = 1; i <= jumlah; i++){
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            total += sc.nextDouble();
        }

        double rata = total / jumlah;
        System.out.println("Nilai rata-rata: " + rata);
    }
}


