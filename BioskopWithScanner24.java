import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

         switch (pilihan) {
             case 1:                
                   System.out.print("Masukkan nama: ");
                  nama = sc.nextLine();
                  while (true) {                    
                     while (true) {
                         System.out.print("Masukkan baris (1-4): ");
                          baris = sc.nextInt();
                         if (baris >= 1 && baris <= 4) {
                             break;
                         } else {
                         System.out.println("Nomor baris tidak tersedia. Silakan masukkan angka 1 hingga 4.");
                           }
                       }
                       while (true) {
                           System.out.print("Masukkan kolom (1-2): ");
                           kolom = sc.nextInt();
                          if (kolom >= 1 && kolom <= 2) {
                               break;
                          } else {
                              System.out.println("Nomor kolom tidak tersedia. Silakan masukkan angka 1 atau 2.");
                            }
                        }

                       sc.nextLine();                        
                       if (penonton[baris - 1][kolom - 1] == null) {                      
                           penonton[baris - 1][kolom - 1] = nama;
                           System.out.println("Data penonton berhasil dimasukkan.");
                           break;
                    } else {
                           System.out.println("Kursi pada baris " + baris + " kolom " + kolom + " sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ".");
                           System.out.println("Silakan pilih kursi lain.");
                    }
                  }
                   break;
                case 2:
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String tampilanNama = penonton[i][j] != null ? penonton[i][j] : "***";
                            System.out.printf("Baris %d Kolom %d: %s\n", i + 1, j + 1, tampilanNama);
                        }
                    }
                    break;

                case 3:
                 
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1, 2, atau 3.");
                    break;
            }
        }
    }
}
