interface here {
    void trans();
}

class free implements here {
    public void trans() {
        System.out.println("haha");
    }
}
class july_30_2{
    public static void main(String[] args) {
        free fff = new free();
        fff.trans();
    }
}

