class outer{
    int num = 100;
    class inner{
        int num = 200;
        void show(){
            int num = 300;
            System.out.println(outer.this.num);
			System.out.println(inner.this.num);
			System.out.println(this.num);
			System.out.println(num);
        }
    }
    void meth (){
        new inner().show();
    }
}
class august_2_3{
    public static void main(String[] args) {
        new outer().meth();
    }
}