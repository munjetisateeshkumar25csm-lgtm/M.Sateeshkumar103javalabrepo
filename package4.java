package numberpack;

public class CheckNumber {
    int number;

    public CheckNumber(int n) {
        number = n;
    }

    public void check() {
        System.out.println("Number: " + number);

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}