package inheritanceandencaptulation;

public class Idol extends Human {
    public String intro;
    public String member;
    
    void setIntro(String intro){
        this.intro = intro;
    }
    
    void setMember(String member){
        this.member = member;
    }
    
    void helloEveryone(){
        System.out.println(this.intro + this.nama + this.member);
    }
    
}
