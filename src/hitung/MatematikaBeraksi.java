
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Matematika madan = new Matematika(7,8);
        
        System.out.println("Hasil Penjumlahan : " + madan.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + madan.setPengurangan()); 
        System.out.println("Hasil Perkalian : " + madan.setPerkalian()); 
        System.out.println("Hasil Pembagian : " + madan.setPembagian()); 
        
    }
}
