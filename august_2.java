class animal {
    void eat() {
        System.out.println("eat something");
    };
}

class cat extends animal {
    void eat() {
        System.out.println("eat something");
    }

    void sleep() {
        System.out.println("sleep well");
    }
}

class dog extends animal {
    void lookhome() {
        System.out.println("look home");
    }

    void eat() {
        System.out.println(" eat meet");
    }

}

class august_2 {
    public static void main(String[] args) {
        animal ddd = new cat();
        ddd.eat();
        Dog d = (Dog) ddd;
        d.eat();

    }
}