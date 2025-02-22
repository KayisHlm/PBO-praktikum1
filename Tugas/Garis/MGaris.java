/* Nama File    : MGaris.java
 * Deskripsi    : Berisi main dari file Titik
 * Pembuat      : Kayis Hilmi Farih/24060123140152
 * Tanggal      : 20 Februari 2025
 */

package praktikum1.Tugas.Garis;

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        
        //getTitikAwal
        System.out.println("\nTitik awal Garis G1 adalah ("+G1.getTitikAwal().getAbsis() + ", " + G1.getTitikAwal().getOrdinat()+")");

        //getTitikAkhir
        System.out.println("\nTitik akhir Garis G1 adalah ("+G1.getTitikAkhir().getAbsis() + ", "+ G1.getTitikAkhir().getOrdinat()+")");

        //setTitikAwal
        G1.setTitikAwal(new Titik(3,4));

        //setTitikAkhir
        G1.setTitikAkhir(new Titik(7,7));

        //printAwalAkhir
        G1.printAwalAkhir();
        
        //getCounterTitik
        System.out.println("\nJumlah garis yang terbentuk adalah " +  Garis.getCounterGaris());

        //getPanjangGaris
        System.out.println("\nPanjang garis G1 adalah " + G1.getPanjangGaris());

        //getGradienGaris
        System.out.println("\nGradien garis G1 adalah " + G1.getGradienGaris());

        //getTitikTengah
        System.out.println("\nTitik tengah dari garis G1 adalah (" + G1.getTitikTengah().getAbsis() + ", " + G1.getTitikTengah().getOrdinat()+ ")");

        //garis G2 
        Garis G2 = new Garis(new Titik(1,6), new Titik(4,9));

        //apakahSejajar
        System.out.println("\nApakah garis G1 dan G2 sejajar ? = "+ G1.apakahSejajar(G2));

        //getPersamaanGaris
        System.out.println("\nPersamaan garis G1");
        G1.getPersamaanGaris();
        System.out.println("\nPersamaan garis G2");
        G2.getPersamaanGaris();
    }
}