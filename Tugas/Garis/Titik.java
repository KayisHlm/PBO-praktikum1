/* Nama File    : Titik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Kayis Hilmi Farih/24060123140152
 * Tanggal      : 19 Februari 2025
 */


package praktikum1.Tugas.Garis;

public class Titik {

    double absis;
    double ordinat;
    static int counterTitik = 0;

    Titik(double absis, double ordinat) {
        this.absis= absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    Titik() {
        this(0,0);
    }

    static int getCounterTitik() {
        return counterTitik;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    void setAbsis(double x) {
        absis = x;
    }

    void setOrdinat(double y) {
        ordinat = y;
    }

    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik() {
        System.out.println("Titik ("+absis+','+ordinat+')');
    }

    void printCounterTitik() {
        System.out.println(Titik.counterTitik);
    }

    int getKuadran() {
        if (this.absis >= 0 && this.ordinat >0 ) {
            return 1;
        }
        else if (this.absis < 0 && this.ordinat >= 0) {
            return 2;
        }
        else if (this.absis >= 0 && this.ordinat < 0) {
            return 4;
        }
        else  {
            return 3;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    double getJarak(Titik T) {
        Titik T1 = new Titik();
        T1.absis = T.absis + this.absis;
        T1.ordinat = T.ordinat + this.ordinat;
        return Math.sqrt(Math.pow(T1.absis, 2) + Math.pow(T1.ordinat, 2));
    }

    void refleksiX() {
        this.ordinat *= -1;
    }

    void refleksiY() {
        this.absis *= -1;
    }
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}