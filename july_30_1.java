abstract class wowo{
    private String voice;
    abstract void woof();
    void getVoice(){
        System.out.println(voice);
    }
    void setVoice(String de){
        voice=de;
    }
}
class dog extends wowo{
    void woof(){
        // setVoice("wang wang");
        getVoice();
    }
}
class july_30_1{
    public static void main(String[] args) {
        dog voia = new dog();
        voia.setVoice("jiu jiu");
        voia.woof();
    }
}