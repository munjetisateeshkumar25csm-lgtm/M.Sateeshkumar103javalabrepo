interface Addition {
    void add();
}

class Calculate implements Addition {
    int a = 10;
    int b = 20;

    public void add() {
        int sum = a + b;
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Sum = " + sum);
    }
}

class Test {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.add();
    }
}