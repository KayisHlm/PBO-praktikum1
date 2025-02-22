/* Nama File    : MTitik.java
 * Deskripsi    : Berisi main dari file Titik
 * Pembuat      : Kayis Hilmi Farih/24060123140152
 * Tanggal      : 19 Februari 2025
 */


package praktikum1.Tugas.Titik;

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();

        //setAbsis
        T1.setAbsis(3);

        //set Ordinat
        T1.setOrdinat(4);

        //printTitik
        System.out.println("T1 awal" );
        T1.printTitik();

        //geser
        T1.geser(3,4);

        
        System.out.println("T1 sekarang" );
        T1.printTitik();
        
        //getAbsis
        System.out.println("Absis dari T1 adalah "+T1.getAbsis());

        //getOrdinat
        System.out.println("Ordinat dari T1 adalah "+T1.getOrdinat());

        //getCounterTitik
        Titik T2 = new Titik(3,5);
        System.out.println("Jumlah Objek Titik = "+Titik.getCounterTitik());
        
        //printCountertTitik
        System.out.println("\nJumlah titik saat ini adalah ");T1.printCounterTitik();

        //getKuadran
        System.out.println("Titik T1 berada pada kuadran " + T1.getKuadran());
    
        //getJarakPusat
        System.out.println("Jarak antara titik T1 dengan titik pusat adalah " + T1.getJarakPusat());

        //getJarak
        System.out.println("Jarak antara titik T1 dengan titik T2 adalah " + T1.getJarak(T2));

        //refleksiX
        System.out.println("\nTitik T1 sebelum direfleksikan terhadap sumbu X");
        T1.printTitik();
        T1.refleksiX();
        System.out.println("Titik T1 setelah direfleksikan terhadap sumbu X");
        T1.refleksiX();
        T1.printTitik();

        //refleksiY
        System.out.println("\nTitik T1 sebelum direfleksikan terhadap sumbu Y");
        T1.printTitik();
        T1.refleksiY();
        System.out.println("Titik T1 setelah direfleksikan terhadap sumbu Y");
        T1.refleksiY();
        T1.printTitik();

        //T2
        System.out.println("\nTitik T2");
        T2.printTitik();

        //getRefleksiX
        Titik T2RefleksiX = T2.getRefleksiX();
        System.out.println("\nTitik T2 setelah direfleksi dengan sumbu X dengan fungsi getRefleksiX");
        T2RefleksiX.printTitik();

        //getRefleksiY
        Titik T2RefleksiY = T2.getRefleksiY();
        System.out.println("\nTitik T2 setelah direfleksi dengan sumbu Y dengan fungsi getRefleksiY");
        T2RefleksiY.printTitik();


    }   
    
}
