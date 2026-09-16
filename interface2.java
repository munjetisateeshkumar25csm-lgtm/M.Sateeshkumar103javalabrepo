interface Shape {
    void area();
}

class Rectangle implements Shape {
    int length = 10;
    int breadth = 5;

    public void area() {
        int result = length * breadth;
        System.out.println("Rectangle");
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + result);
    }
}

class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}