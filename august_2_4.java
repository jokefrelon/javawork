class outer{
    int num = 100000000;
}

class inner{
    public void show() {
        System.out.println(new outer().num);
    }
}
class august_2_4{
    public static void main(String[] args) {
        new inner().show();
        
    }
}