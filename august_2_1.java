class father {
    static void smile(){
        System.out.println("😄");
    }
}

class son extends father{

    public static void smile(){
        System.out.println("😄");
    }
}
class august_2_1{
    public static void main(String[] args) {
        father ddd = new son();
        ddd.smile();
    }
}
