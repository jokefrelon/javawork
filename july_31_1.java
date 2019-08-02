class outer{
    private int full=20;
    class dast{
        void delete(int inspect){
            full = inspect;
            System.out.println("目前数字"+full);
        }
    }
    void mete (int fgg){
        dast in = new dast();
        in.delete(fgg);
    }
}
class july_31_1{
    public static void main(String[] args) {
        outer.dast uuud = new outer() .new dast();
        uuud.delete(100);
    }
}