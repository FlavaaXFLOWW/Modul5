import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input data mahasiswa
        Scanner input = new Scanner(System.in);
        ArrayList<String[]> dataMahasiswa = new ArrayList<>();
        while (true) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = input.nextLine();
            System.out.print("Masukkan semester mahasiswa: ");
            String semester = input.nextLine();
            dataMahasiswa.add(new String[]{nama, nim, semester});
            System.out.print("Tambah data? (y/n): ");
            String ulangi = input.nextLine();
            if (ulangi.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Hapus data yang duplikat
        ArrayList<String[]> dataMahasiswaUnik = new ArrayList<>();
        for (String[] data : dataMahasiswa) {
            boolean isDuplicate = false;
            for (String[] dataUnik : dataMahasiswaUnik) {
                if (data[1].equals(dataUnik[1])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                dataMahasiswaUnik.add(data);
            }
        }

        // Tampilkan data mahasiswa yang unik
        System.out.println("Nama\tNIM\tSemester");
        for (String[] data : dataMahasiswaUnik) {
            System.out.println(data[0] + "\t" + data[1] + "\t" + data[2]);
        }
    }
}