abstract class animal{
    abstract void eat();
    abstract void sleep();
}
class cat extends animal{
    public void eat(){
        System.out.println("Do not just drink , u eat the headaoguertunkerlulos");
    }
    public void sleep(){
        System.out.println("sleep like the pig");
    }
    void fight(){
        System.out.println("hahaha");
    }
}
class july_30_4{
    public static void main(String[] args) {
        animal dd = new cat();
        dd.sleep();
        // dd.fight();cat类特有方法,animal不可以调用
    }
}