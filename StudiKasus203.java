import java.util.Scanner;

public class StudiKasus203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumlahDokumen. juara, statusPKM;
        
        System.out.print("Nama mahasiswa: ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM.LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen: ");
        int jumlahDokumen = sc.nextInt();

        System.out.print("Peringkat juara: ");
        int juara = sc.nextInt();

        System.out.print("Status pendanaan PKM (1= lolos, 0= tidak lolos):");
        int statusPKM = sc.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            if (juara >= 1 && juara <= 3) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap (kurang 0 dokumen). Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jmlDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara (Juara Harapan/peserta). Dana penghargaan tidak diberikan.");
            }
            
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            if (statusPKM == 1) {
                if (jmlDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap (kurang 0 dokumen). Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jmlDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }
            
        } else {
            System.out.println("Status : Kegiatan di luar ketentuan (Lainnya). Dana penghargaan tidak diberikan.");
        }
    }
}