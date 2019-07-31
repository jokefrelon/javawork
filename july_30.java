class july_30{
    int n;
    String s;

    july_30(){
       n=32;
    }
    void getN(){
        System.out.println(n);
    }
    void setN(int se ){
        n=se;
        System.out.println(se);
    }
    public static void main(String[] args) {
        july_30 kile = new july_30();
        kile.getN();
        kile.setN(20);
    }
}

