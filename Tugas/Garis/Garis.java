/* Nama File    : Garis.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Kayis Hilmi Farih/24060123140152
 * Tanggal      : 20 Februari 2025
 */

package praktikum1.Tugas.Garis;

public class Garis {
    
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    Garis() {
        this.titikAwal = new Titik();
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }

    Titik getTitikAwal() {
        return titikAwal;
    }

    Titik getTitikAkhir() {
        return titikAkhir;
    }

    static int getCounterGaris() {
        return counterGaris;
    }

    void setTitikAwal(Titik T) {
        this.titikAwal = T;
    }

    void setTitikAkhir(Titik T) {
        this.titikAkhir = T;
    }
    
    double getPanjangGaris() {
        double deltaX = titikAkhir.absis - titikAwal.absis;
        double deltaY = titikAkhir.ordinat - titikAwal.ordinat;
        return Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY,2));
    }

    double getGradienGaris() {
        double deltaX = titikAkhir.absis - titikAwal.absis;
        double deltaY = titikAkhir.ordinat - titikAwal.ordinat;
        
        if (deltaX == 0) {
            throw new ArithmeticException("Gradien tak terdefinisi");
        } 
        else {
            return deltaY/deltaX;
        }
    }

    Titik getTitikTengah() {
        double xTengah = (titikAwal.absis + titikAkhir.absis)/2;
        double yTengah = (titikAwal.ordinat + titikAkhir.ordinat)/2;
        return new Titik(xTengah, yTengah);
    }

    boolean apakahSejajar(Garis G2) {
        double gradien1 = this.getGradienGaris();
        double gradien2 =  G2.getGradienGaris();
        return gradien1 == gradien2;
    }

    void printAwalAkhir() {
        System.out.println("Titik awal adalah ("+titikAwal.absis+", "+titikAwal.ordinat+")");
        System.out.println("Titik akhir adalah ("+titikAkhir.absis+", "+titikAkhir.ordinat+")");
    }

    void getPersamaanGaris() {
        double m = this.getGradienGaris();
        double c = titikAwal.ordinat - (m*titikAkhir.absis);
        System.out.println("y = " + m + "x + "+ c);
    }
}
