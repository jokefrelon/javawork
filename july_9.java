class speak{
    private String stanfou;
    private int califonia;

    void setstanfou(String _stanfou) {
        stanfou = _stanfou;
    }
    String getstanfou(){
        return stanfou;
    }
    void setcalifonia(int _califonia){
        califonia=_califonia;
    }
    int getcalifonia(){
        return califonia;
    }
    void show(){
        System.out.println(stanfou+" is "+califonia+"* and ��������");
    }

}

class runcode {
    public static void main (String[] args){
    speak person = new speak();
    person.setstanfou("����");
    person.setcalifonia(2);
    person.show();
    }
}