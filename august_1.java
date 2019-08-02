class father {
    int x;

    father() {
        x = 4;
    }

    father(int de) {
        x = de;
    }
}

class son extends father {
    son() {
        super(4); // 这里有一个默认的super(x);即使不写也存在
        // this(4);//也可以用this(x)调用本类当中有参构造函数,因为有参当中有一个默认的super()
        System.out.println("son");
    }

    son(int er) {
        // 这里有一个默认的super();即使不写也存在
        System.out.println("son" + er);
    }
}

class august_1 {
    public void main(String[] args) {
        son ddd = new son();

    }
}