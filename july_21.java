class father_animal {
    private String des;
    private int alaeg;
    String getDes(){
        System.out.println(des);
        return des;
    }
    void setDes(String inu){
        this.des=inu;
        System.out.println(des);
    }
    int getAlaeg(){
        System.out.println(alaeg);
        return alaeg;
    }
    void setAlaeg(int fs){
        this.alaeg=fs;
        System.out.println(alaeg);
    }
    void Sleep(String dees){
        System.out.println(dees+"123456789"+" this is father");
    }
}

class child_animal extends father_animal{
    private String Ql;
    private String Qll;
    void getQl(){
        System.out.println(Ql);
    }
    void getQll(){
        System.out.println(Qll);
        
    }
    void setQl(String qlq){
        this.Ql=qlq;
        System.out.println(Ql);
    }
    void setQll(String qlq){
        this.Qll=qlq;
        System.out.println(Qll);
    }
    void Sleep(String dees){
        System.out.println(dees+"abcdefghijk"+" this is son");
    }
    void doruble(){
    super.Sleep("ers");
    this.Sleep("sons");
    }
}

class july_21{
public static void main(String[] args) {
    child_animal ws=new child_animal();
    ws.getAlaeg();
    ws.getDes();
    ws.getQl();
    ws.getQll();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    ws.setAlaeg(12);
    ws.setDes("wesdf");
    ws.setQl("SDF");
    ws.setQll("wetqw45wertysdfhs5eysrty");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    ws.getAlaeg();
    ws.getDes();
    ws.getQl();
    ws.getQll();
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    ws.doruble(); 
     }
 
}