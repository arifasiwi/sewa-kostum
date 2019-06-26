/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;
import java.text.*; // memangil library date untuk menampilkan tanggal dan waktu sekarang 
import java.util.*; // memanggil library inputan

/**
 *
 * @author ASUS
 */
public class Uas { // nama kelas program untuk eksekusi
    
    private String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
        Date date = new Date();
        return dateFormat.format(date);
    } // membuat method getTanggal untuk memanggil data tanggal yang akan ditampilkan

    private String getWaktu() {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    } // membuat method getTanggal untuk memanggil data tanggal yang akan ditampilkan

    public static void main(String[] args) {
        Uas tgl = new Uas();
        System.out.println(tgl.getTanggal()); // menampilkan tanggal saat ini
        System.out.println(tgl.getWaktu()); // menampilkan waktu saat ini
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  //Memanggil kedua method getTanggal dan getWaktu untuk ditampilkan

        Scanner inputan = new Scanner(System.in);
        int harga = 0; //        inisialisasi harga awal

        ArrayList hari = new ArrayList<>();
        ArrayList nama = new ArrayList<>();
        ArrayList jenis = new ArrayList<>();
        ArrayList total = new ArrayList<>();
        ArrayList kembalian = new ArrayList<>();
        ArrayList cust = new ArrayList<>();
        ArrayList tglkembali = new ArrayList<>();

        int menu = 0; //        inisialisasi menu awal
        System.out.println("==========================================");
        System.out.println("             Rental CD Gamezone           ");
        System.out.println("==========================================");
        System.out.println("==========================================");
        System.out.println("| 1.Remo            = Rp. 80.000,- /Hari |");
        System.out.println("| 2.Pendet          = Rp. 60.000,- /Hari |");
        System.out.println("| 3.Gambyong        = Rp. 60.000,- /Hari |");
        System.out.println("| 4.Topeng          = Rp. 80.000,- /Hari |");
        System.out.println("| 5.Piring          = Rp. 75.000,- /Hari |");
        System.out.println("==========================================");

        System.out.print("Masukkan Nama Penyewa:  ");
        String sewa = inputan.next();
        cust.add(sewa);
        System.out.println();

        System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
        int banyak = inputan.nextInt();

         for (int ulang = 1; ulang <= banyak; ulang++) {
            System.out.print("Masukkan No Kostum: ");
            String pilih = inputan.next();
            System.out.println("================");

            if (pilih.equals("1")) {
                   
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Remo");
                nama.add("Kostum Tari Remo");
                
                System.out.println("Harga Kostum Tari Remo : Rp. 80.000/Hari");

                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();
        
                harga = harga + (80000*jumlah);
                System.out.println("================");
            } else if (pilih.equals("2")) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Pendet");
                nama.add("Kostum Tari Pendet");

                System.out.println("Harga Kostum Tari Pendet : 60.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (60000*jumlah);

                System.out.println("================");
            } else if (pilih.equals("3")) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Gambyong");
                nama.add("Kostum Tari Gambyong");

                System.out.println("Harga Kostum Tari Gambyong : 60.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (60000*jumlah);

                System.out.println("================");
            } else if (pilih.equals("4")) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Topeng");
                nama.add("Kostum Tari Topeng");

                System.out.println("Harga Kostum Tari Topeng : 80.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (80000*jumlah);

                System.out.println("================");
            } else if (pilih.equals("5")) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Piring");
                nama.add("Kostum Tari Piring");

                System.out.println("Harga Kostum Tari Piring : 75.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (75000*jumlah);

                System.out.println("================");

            }
         }
                
                System.out.print("Berapa Lama Anda ingin meminjam : ");
                int lama = inputan.nextInt();
                hari.add(lama);

                System.out.print("Tanggal pengembalian :");
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DAY_OF_MONTH, lama);
                System.out.println(sdf.format(cal.getTime()));

                int tot = harga * lama;

                System.out.println("Total pembayaran sebesar " +tot+".");
                System.out.println();

                System.out.print("Masukkan Uang Anda : ");
                int bayar = inputan.nextInt();

                int kembali1=0;
                int x=1;
                while (x!=0) {
                if (tot > bayar) {
                        System.out.print("Maaf Uang Anda Kurang,Tolong Masukkan dengan benar :");
                        bayar = inputan.nextInt();
                    
                }else{
                    kembali1 = bayar - tot;
                    System.out.println("Kembalian Anda = " + kembali1);
                    kembalian.add(kembali1);
                    x=0;
                }
                }
                    kembalian.add(kembali1);
                    
                    System.out.println(kembalian.get(0));
                
        System.out.println("==========================================");
        System.out.println("              STRUK PEMBAYARAN            ");
        System.out.println("==========================================");

            System.out.println(tgl.getTanggal());
            System.out.println(tgl.getWaktu());
      
            System.out.println("Nama Penyewa: " + sewa);
            System.out.println("Nama Kostum yang disewa: " + nama);
            System.out.print("Tanggal pengembalian :"); 
            System.out.println(sdf.format(cal.getTime()));
            System.out.println("Total pembayaran sebesar " +tot);
            System.out.println("Kembalian Anda: " +kembali1);
            System.out.println("Terimakasih atas kunjungannya.");
            
    }
}