package mypack;

public class Addition {
    int a, b;

    public Addition(int x, int y) {
        a = x;
        b = y;
    }

    public void display() {
        int sum = a + b;
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Sum = " + sum);
    }
}