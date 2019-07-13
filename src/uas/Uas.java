package uas;

import java.text.*; // memangil library date untuk menampilkan tanggal dan waktu sekarang 
import java.util.*; // memanggil library inputan
import static jdk.nashorn.tools.ShellFunctions.input;
import java.util.InputMismatchException;

public class Uas { 

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
        System.out.println(tgl.getTanggal());
        System.out.println(tgl.getWaktu());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //Memanggil kedua method getTanggal dan getWaktu untuk ditampilkan
        Scanner inputan = new Scanner(System.in);
        //        inisialisasi pembayaran awal
        int harga = 0;

        Integer[] hari = new Integer[1];
        String[] nama = new String[10];
        Integer[] kembalian = new Integer[1];
        String tglkembali[] = new String[1];

        int menu = 0; //        inisialisasi menu awal
        System.out.println("==========================================");
        System.out.println("             Peminjaman Kostum            ");
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
        System.out.println();

        int a = 1;
        int banyak = 0;
        while(a!=0){

            System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
            a = 0;
            try{
            banyak = inputan.nextInt();
        }catch (InputMismatchException ae) {
            a = 1;
            inputan.nextLine();
            System.out.println("Inputan Harus Angka");      

        }

        }
        
        for (int ulang = 1; ulang <= banyak; ulang++) {
            System.out.print("Masukkan No Kostum: ");
            int pilih = inputan.nextInt();
            System.out.println("================");

            if (pilih == 1) {

                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Remo");
                nama[ulang] = ("Kostum Tari Remo");
                System.out.println("Harga Kostum Tari Remo : Rp. 80.000/Hari");

                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();
        
                harga = harga + (80000*jumlah);
                System.out.println("================");
            } else if (pilih == 2) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Pendet");
                nama[ulang] =("Kostum Tari Pendet");

                System.out.println("Harga Kostum Tari Pendet : 60.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (60000*jumlah);

                System.out.println("================");
            } else if (pilih == 3) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Gambyong");
                nama[ulang] =("Kostum Tari Gambyong");

                System.out.println("Harga Kostum Tari Gambyong : 60.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (60000*jumlah);

                System.out.println("================");
            } else if (pilih == 4) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Topeng");
                nama[ulang] =("Kostum Tari Topeng");

                System.out.println("Harga Kostum Tari Topeng : 80.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (80000*jumlah);

                System.out.println("================");
            } else if (pilih == 5) {
                System.out.println("Nama Kostum yang dipinjam : Kostum Tari Piring");
                nama[ulang] =("Kostum Tari Piring");

                System.out.println("Harga Kostum Tari Piring : 75.000/Hari");
                
                System.out.print("Berapa banyak kostum yang ingin anda sewa:  ");
                int jumlah = inputan.nextInt();

                harga = harga + (75000*jumlah);

                System.out.println("================");
            }
        }

        System.out.print("Berapa Lama Anda ingin meminjam : ");
        hari[0] = inputan.nextInt();

        System.out.print("Tanggal pengembalian :");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, hari[0]);
        System.out.println(sdf.format(cal.getTime()));

        int total = harga * hari[0];

        System.out.println("Total pembayaran sebesar " + total + ".");
        System.out.println();

        System.out.print("Masukkan Uang Anda : ");
        int bayar = inputan.nextInt();

        int kembali1 = 0;
        int x = 1;
        while (x != 0) {
            if (total > bayar) {
                System.out.print("Maaf Uang Anda Kurang,Tolong Masukkan dengan benar :");
                bayar = inputan.nextInt();

            } else {
                kembali1 = bayar - total;
                System.out.println("Kembalian Anda = " + kembali1);
                kembalian[0] = kembali1;
                x = 0;
            }
        }
        kembalian[0] = kembali1;

        System.out.println("==========================================");
        System.out.println("              STRUK PEMBAYARAN            ");
        System.out.println("==========================================");
       
       System.out.println(tgl.getTanggal());
       System.out.println(tgl.getWaktu());

        System.out.println("Nama Penyewa: " + sewa);
        System.out.println("Nama Kostum yang disewa: ");
        for (int c = 1; c <= banyak; c++) {
            System.out.println(" ~" + nama[c] + "~");
        }
        System.out.print("Tanggal pengembalian :");
        System.out.println(sdf.format(cal.getTime()));
        System.out.println("Total pembayaran sebesar :" + total);
        System.out.println("Kembalian Anda: " + kembalian[0]);
        System.out.println("Terimakasih atas kunjungannya.");
    }
}