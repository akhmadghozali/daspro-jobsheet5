import java.util.Scanner;

    public class tugas1jobsheet5 {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            String nama, nim;
            char kelas;
            byte absen;
            double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
            char nilaiHuruf;
            String kualifikasi;

            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = sc.nextLine();
            System.out.print("Masukkan kelas: ");
            kelas = sc.nextLine().charAt(0);
            System.out.print("Masukkan nomor absen: ");
            absen = sc.nextByte();

            System.out.print("Masukkan nilai kuis: ");
            nilaiKuis = sc.nextDouble();
            System.out.print("Masukkan nilai tugas: ");
            nilaiTugas = sc.nextDouble();
            System.out.print("Masukkan nilai ujian: ");
            nilaiUjian = sc.nextDouble();

            nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;

            // Determine grade and qualification
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = 'A';
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = 'B';
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = 'B';
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = 'C';
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = 'C';
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = 'D';
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = 'E';
            kualifikasi = "Gagal";
        }

        // Output results
        System.out.println("Nama: " + nama + " (NIM " + nim + ") Kelas: " + kelas + " L nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
        }
        
    }
