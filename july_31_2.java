class outer{
    int num = 2;
    class inner{
        int num = 3;
        void show(){
            int num = 4;
            System.out.println(outer.this.num);
            System.out.println(this.num);
            System.out.println(num);
        }
    }
    void method(){
        inner dfdf = new inner();
        dfdf.show();
    }
}
class july_31_2{
    public static void main(String[] args) {
        outer ss = new outer();
        ss.method();
    }
}