interface NumberCheck {
    void check();
}

class Number implements NumberCheck {
    int n = 25;

    public void check() {
        System.out.println("Number = " + n);

        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Number obj = new Number();
        obj.check();
    }
}