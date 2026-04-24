import java.util.Scanner;
public class SuratMain06 {
    public static void main(String[] args) {
        StackSurat06 stack = new StackSurat06(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi (dalam hari): ");
                    int durasi = scan.nextInt();
                    Surat06 surat = new Surat06(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin berhasil diterima!");
                    break;
                case 2:
                    Surat06 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat izin dari " + diproses.namaMahasiswa);
                        System.out
                                .println("Jenis Izin: " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                        System.out.println("Surat izin berhasil diproses dan terverifikasi!");
                    }
                    break;
                case 3:
                    Surat06 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir diterima dari " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa untuk mencari surat: ");
                    String namaCari = scan.nextLine();
                    stack.cariSurat(namaCari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih <= 4);
    }

}