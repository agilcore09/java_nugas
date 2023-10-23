package inheritanceandencaptulation;

public class Teacher extends Human{
    public int jumlahSiswa;
    public int jumlahJamajar;
    
    void getJumlahAjar(int jam){
        this.jumlahJamajar = jam;
        System.out.println("jumlah ajar guru adalah : " + this.jumlahJamajar);
    }
}
