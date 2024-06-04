package hitung;

public class Matematika {
        //Membuat Variabel
    private double bil1, bil2;
    
    //Membuat constructor
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //Membuat SetMethod Penjumlahan
    double setPenjumlahan(){
        return bil1 + bil2;
    }
}
