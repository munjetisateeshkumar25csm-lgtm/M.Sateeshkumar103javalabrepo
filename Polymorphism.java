class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void display() {
        System.out.println("Calculator Program");
    }
}

class Test {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.display();

        System.out.println("Two numbers: " + c.add(10, 20));
        System.out.println("Three numbers: " + c.add(10, 20, 30));
        System.out.println("Decimal numbers: " + c.add(2.5, 3.5));
    }
}