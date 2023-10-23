package inheritanceandencaptulation;

public class InheritanceAndEncaptulation {
    public static void main(String[] args) {
        
       // mengambil dari class guru yang extend ke human
       Teacher guru = new Teacher();
       guru.setName("Ibu Nurhaedah");
       guru.sayName();
       guru.setAge(24);
       guru.sayAge();
       guru.getJumlahAjar(24);
    }   
}
