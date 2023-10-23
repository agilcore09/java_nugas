package inheritanceandencaptulation;
public class Human {
    protected String nama;
    protected String gender;
    protected int age;
    
    void setName(String name){
        this.nama = name;
    }
    
    void setAge(int ages){
        this.age = ages;
    }
    
    void sayName(){
        System.out.println("Halo nama aku " + this.nama);
    }
    
    void walk(){
        System.out.println("Saya sedang berjalan");
    }
    
    void sayAge(){
        System.out.println("Umur aku sudah " + this.age);
    }
}

