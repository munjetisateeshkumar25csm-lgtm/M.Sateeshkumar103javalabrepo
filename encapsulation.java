class Student {
    private String name;
    private int rollNo;
    private int marks;

    public void setName(String n) {
        name = n;
    }

    public void setRollNo(int r) {
        rollNo = r;
    }

    public void setMarks(int m) {
        marks = m;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

class Test {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahul");
        s.setRollNo(101);
        s.setMarks(85);

        s.display();
    }
}