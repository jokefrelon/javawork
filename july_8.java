class baiu {
    String sign;
    int qag;
    // baiu(String sign_1,int qag_1 ){
    //     sign=sign_1;
    //     qag=qag_1;
    // }
    public void setsign(String lsn){
        sign=lsn;
    }
    public String getsign(){
        return sign;
    }
    public void setqag(int age){
        qag=age;
    }
    public int getqag(){
        return qag;
    }
    public void show(String as,int age){
        sign=as;
        qag=age;

        System.out.println("------------------------------");
        System.out.println("|Her name :"+sign+", "+"her age :"+qag+"|");
        System.out.println("------------------------------");

    } 
}
class july_8{
    public static void main(String[] args) {
        baiu h = new baiu();
        h.show("baiyu",18);
    }
} 