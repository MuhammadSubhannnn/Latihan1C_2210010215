package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //Membuat objek
        Matematika subhan = new Matematika(1,5);
        
        System.out.println("Hasil penjumlahan "+subhan.setPenjumlahan());
        System.out.println("Hasil pengurangan "+subhan.setPengurangan());
        System.out.println("Hasil perkalian "+subhan.setPerkalian());
        System.out.println("Hasil pembagian "+subhan.setPembagian());
        
    }
}
