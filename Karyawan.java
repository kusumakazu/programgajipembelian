
import java.util.Scanner;

public class Karyawan {

    public static void main(String[] args) {
        try {
            int menupilih;
            Scanner scanner = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            //tampilan awal
            System.out.println("=============================================");
            System.out.println("====== Program UAS ==========================");
            System.out.println("====== NAMA : IZLAN KERTA KUSUMAH ===========");
            System.out.println("====== 181011401173 =========================");
            System.out.println("=============================================");
            System.out.println("MENU UTAMA :");
            System.out.println("1. Program Penggajian  ");
            System.out.println("2. Program Penjualan   ");
            System.out.println("3. Keluar");
            System.out.println("=============================================");

            do { //pengulangan dengan menjalankan program
                System.out.println("Pilih Menu : ");
                menupilih = scanner.nextInt();

                switch (menupilih) {

                    case 1:  //jika memilih 1
                        String nama,
                         jk,
                         statIstri = null;
                        int jml_anak;
                        double gajiPokok = 0,
                         gajitotal = 0,
                         tunjanganAnak = 0,
                         tunjangankeluarga = 0,
                         tunjanganIstri = 0,
                         jones = 0;

                        System.out.println("Nama Karyawan : ");
                        nama = input.nextLine();
                        System.out.println("Jenis Kelamin : ");
                        jk = input.nextLine();

                        System.out.println("Status Nikah : (yes/no) ");
                        statIstri = input.nextLine();

                        if (statIstri.equalsIgnoreCase("yes")) { //jika input dari status nikah bernilai yes
                            do {
                                System.out.println("Jumlah Anak: ");
                                jml_anak = input.nextInt();
                                if (jml_anak < 0) {
                                    System.out.println("Jumlah anak tidak bisa negatif, harap ulangi");
                                }
                                if (jk.equalsIgnoreCase("LK")) {
                                    tunjangankeluarga = 300000;
                                } else if (jk.equalsIgnoreCase("PR")) {
                                    tunjangankeluarga = 0;
                                }
                            } while (jml_anak < 0);
                            gajiPokok = 150000;
                            if (jml_anak != 0) {
                                if (jml_anak <= 2) {
                                    tunjanganAnak = (jml_anak * 100000);
                                } else if (jml_anak >= 3) {
                                    tunjanganAnak = (3 * 100000) * 0.05;
                                }
                                tunjanganIstri = gajiPokok * 0.1;
                            }
                            gajitotal = gajiPokok + tunjanganIstri + tunjanganAnak + tunjangankeluarga;

                            System.out.println("=========================================");
                            System.out.println("Jenis Kelamin       : " + jk);
                            System.out.println("Status Kawin        : " + statIstri);
                            System.out.println("Tunjangan istri     : " + tunjanganIstri);
                            System.out.println("Tunjangan anak      : " + tunjanganAnak);
                            System.out.println("Tunjangan Keluarga  : " + tunjanganAnak);
                            System.out.println("Jumlah anak         : " + jml_anak);
                            System.out.println("=========================================");
                            System.out.printf("Gaji Pokok           : %f\n", gajiPokok);
                            System.out.printf("Gaji Total           : %f\n", gajitotal);
                            System.out.println("=========================================");

                        } else if (statIstri.equalsIgnoreCase("no")) { //jika input dari status nikah bernilai no
                            gajiPokok = 150000;
                            jones = 50000;
                            gajitotal = gajiPokok + jones;

                            System.out.println("=========================================");
                            System.out.println("Jenis Kelamin       : " + jk);
                            System.out.println("Status Kawin        : " + statIstri);
                            System.out.println("Tunjangan istri     :-");
                            System.out.println("Tunjangan anak      :-");
                            System.out.println("Jumlah anak         :-");
                            System.out.println("=========================================");
                            System.out.printf("Gaji Pokok           : %f\n", gajiPokok);
                            System.out.printf("Gaji Total           : %f\n", gajitotal);
                            System.out.println("=========================================");
                            System.out.println("=========================================");
                        }

                        break;

                    case 2:  //jika memilih 2

                        String pembeli,
                         item;
                        double harga,
                         jumlah,
                         total = 0,
                         potonganHarga;

                        do {
                            System.out.println("======================================================");
                            System.out.println("====== Daftar Barang =================================");
                            System.out.println("====== 1.Susu Ultramilk 500ml @Rp.7000 ===============");
                            System.out.println("====== 2.BengBeng Coklat @Rp.1500 ====================");
                            System.out.println("====== 3.Yougurt Chimory Plain @Rp.8000 ==============");
                            System.out.println("====== 4.Sprite 500ml @Rp.4500 =======================");
                            System.out.println("======================================================");

                            System.out.print("Nama Pembeli : ");
                            pembeli = input.next();
                            input.nextLine();

                            System.out.print("Masukan nama barang yang ingin dibeli : ");
                            item = input.nextLine();

                            System.out.print("Harga Barang : ");
                            harga = input.nextDouble();

                            System.out.print("Masukan jumlah barang yang ingin dibeli :");
                            jumlah = input.nextDouble();

                            jumlah = harga * jumlah;

                            potonganHarga = jumlah * 0.1;

                            total = jumlah - potonganHarga;

                            if (harga >= 100000) {
                                potonganHarga = harga * 0.1;
                            } else if (harga <= 100000) {
                                potonganHarga = harga * 0.05;
                            }

                            System.out.println(" ");
                            System.out.println("Nama Pembeli : " + pembeli);
                            System.out.println("=========================================");
                            System.out.println("Nama Barang : " + item);
                            System.out.println("Harga Barang : " + harga);
                            System.out.println("Jumlah yang Dibeli : " + jumlah);
                            System.out.println("=========================================");
                            System.out.println("Total Harga  : " + total);
                            System.out.println("Diskon : " + potonganHarga);

                        } while (pembeli != null);

                        break;

                    case 3:  //jika memilih 3
                        System.out.println(" Keluar Program....");
                        System.exit(0);

                        break;

                    default:
                        System.out.println("=============================================");
                        System.out.println("MENU UTAMA :");
                        System.out.println("1. Program Penggajian  ");
                        System.out.println("2. Program Penjualan   ");
                        System.out.println("3. Keluar");
                        System.out.println("=============================================");

                        break;
                }

            } while (menupilih != 0);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("");
        }
    }
}
