package hitung;

public class Matematika {
        //Membuat Variabel
    private double bil1, bil2;
    
    //Membuat constructor
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //Membuat Method SetPenjumlahan
    double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    //Membuat Method SetPenjumlahan
    double setPengurangan(){
        return bil1 - bil2;
    }
    
    //Membuat Method SetPenjumlahan
    double setPerkalian(){
        return bil1 * bil2;
    }
    
    //Membuat Method SetPenjumlahan
    double setPembagian(){
        return bil1 / bil2;
    }
}
