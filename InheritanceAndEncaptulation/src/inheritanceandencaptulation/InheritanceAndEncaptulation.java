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
       
       // mengambil class idol yang extend ke human
       Idol member = new Idol();
       
       // method dari class hman
       member.setName("Tomisato Nao");
       member.setAge(18);
       
       // metdhod dari class idol
       member.setIntro("Halo semua aku, ");
       member.setMember(", Aku dari idol Nogizaka 46");
       member.helloEveryone();
    }   
}
