package kalkulasi;

public class kalkulasi {
    String operator;
    int number1;
    int number2;
    
    void tambah(int n1, int n2, String op){
        number1 = n1;
        number2 = n2;
        if(op == "+"){
             System.out.println(number1 + number2);
            } else {
                System.out.println("tidak dapat menjumlah");
            }
        }
    
        void kurang(int n1, int n2, String op){
        number1 = n1;
        number2 = n2;
        if(op == "-"){
             System.out.println(number1 - number2);
            } else {
                System.out.println("tidak dapat menjumlah");
            }
        }
        
        void bagi(int n1, int n2, String op){
        number1 = n1;
        number2 = n2;
        if(op == "/"){
             System.out.println(number1 / number2);
            } else {
                System.out.println("tidak dapat menjumlah");
            }
        }
        
        void kali(int n1, int n2, String op){
        number1 = n1;
        number2 = n2;
        if(op == "*"){
             System.out.println(number1 * number2);
            } else {
                System.out.println("tidak dapat menjumlah");
            }
        }
}
