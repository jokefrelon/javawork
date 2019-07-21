class sup{
    sup(){
        System.out.println("sup()");
    }
    sup(String n){
        System.out.println("sup(String n)"+n);
    }
}
class sub extends sup{
    sub(){
        System.out.println("sub()");
    }
    sub(String sds){
        System.out.println("sub(int sds)"+sds);
    }
}

class july_18{
    public static void main(String[] args) {
    sup suu= new sup();
    sup suu1= new sup("we");
    System.out.println("---------------------");
    sub subs = new sub();
    sub subss = new sub("wwwwwwwwwwwwwwww");
}
}
