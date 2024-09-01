/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.nilai;

/**
 *
 * @author meryl
 */
public class NilaiMain {
     public static void main(String[] args){
     Nilai nilai1 = new Nilai();
     Nilai nilai2 = new Nilai();
     
     nilai1.NIM = "123";
     nilai1.Nama = "Roxas";
     nilai1.Absen = 70;
     nilai1.Tugas = 90;
     nilai1.UTS = 80;
     nilai1.UAS = 90;
     
     System.out.println("Input data");
     System.out.println("======================");
     System.out.println("Nama= "+nilai1.Nama);
     System.out.println("NIM= "+nilai1.NIM);
     System.out.println("Nilai Absen "+nilai1.Absen);
     System.out.println("Nilai Tugas "+nilai1.Tugas);
     System.out.println("Nilai UTS "+nilai1.UTS);
     System.out.println("Nilai UAS "+nilai1.UAS);
     System.out.println("======================");
     
     
     nilai1.Nilai();
     
     System.out.println();
     System.out.println("Hasil Nilai");
     nilai1.CetakNilai();
     
     nilai2.NIM = "2310631170096";
     nilai2.Nama = "Merylien Jovanda";
     nilai2.Absen = 90;
     nilai2.Tugas = 90;
     nilai2.UTS = 90;
     nilai2.UAS = 100;
     
     System.out.println();
     
     System.out.println("Input data");
     System.out.println("======================");
     System.out.println("Nama= "+nilai2.Nama);
     System.out.println("NIM= "+nilai2.NIM);
     System.out.println("Nilai Absen "+nilai2.Absen);
     System.out.println("Nilai Tugas "+nilai2.Tugas);
     System.out.println("Nilai UTS "+nilai2.UTS);
     System.out.println("Nilai UAS "+nilai2.UAS);
     System.out.println("======================");
     
     
     nilai2.Nilai();
     
     System.out.println();
     System.out.println("Hasil Nilai");
     nilai2.CetakNilai();
     }
}
