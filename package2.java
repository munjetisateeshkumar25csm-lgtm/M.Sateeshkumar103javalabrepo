class Pack {
    int rollno;
    String name;
    double marks;

    void display() {
        System.out.println(" \nrollno: " + rollno + " \nname: " + name + "  \nmarks " + marks);
    }
}

class ramu
{
    public static void main(String[] args)
	{
        Pack s1 = new Pack(); 
        s1.rollno = 35;
        s1.name = "pavan";
        s1.marks = 92.5;
        s1.display();
    }
}
