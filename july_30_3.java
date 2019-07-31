interface interA{
    void hello();
}
interface interB extends interA{
    void sayHello();
}
class halo implements interB{
    public void hello(){
        System.out.println("haha");
    }
    public void sayHello(){
        System.out.println("nihao");
    }
}
class july_30_3 extends halo{
    public static void main(String[] args) {
        halo fff = new halo();
        fff.hello();
        fff.sayHello();
    }
}