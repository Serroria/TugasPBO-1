/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.nilai;

/**
 *
 * @author meryl
 */
public class Nilai {
    String NIM;
    String Nama;
    double Absen;
    double Tugas;
    double UTS;
    double UAS;
    double Akhir;

    void Nilai(){
        double nilaiAbsen = this.Absen * 10 / 100;
        double nilaiTugas = this.Tugas * 20 / 100;
        double nilaiUTS = this.UTS * 30 / 100;
        double nilaiUAS = this.UAS * 40 / 100;
        System.out.println ("Poin Absen = "+ nilaiAbsen);
        System.out.println ("Poin Tugas = "+ nilaiTugas);
        System.out.println ("Poin UTS = "+ nilaiUTS);
        System.out.println ("Poin UAS = "+ nilaiUAS);
    }
    
    void CetakNilai(){
        double nilaiAbsen = this.Absen * 10 / 100;
        double nilaiTugas = this.Tugas * 20 / 100;
        double nilaiUTS = this.UTS * 30 / 100;
        double nilaiUAS = this.UAS * 40 / 100;
        this.Akhir = nilaiAbsen + nilaiTugas + nilaiUTS + nilaiUAS;
        
        
        System.out.println ("Nilai Akhir = "+this.Akhir);
    }
}
