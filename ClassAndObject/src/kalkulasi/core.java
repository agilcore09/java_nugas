package kalkulasi;

public class core {
    public static void main(String[] args){
        
        // membuat objek tambah
        kalkulasi tambah = new kalkulasi();
        tambah.tambah(10, 5, "+");
        
        // membuat objek kurang
        kalkulasi kurang = new kalkulasi();
        kurang.kurang(10, 5, "-");
        
        kalkulasi bagi = new kalkulasi();
        bagi.bagi(10, 2, "/");
        
        kalkulasi kali = new kalkulasi();
        kali.kali(10, 2, "*");
    }
}
