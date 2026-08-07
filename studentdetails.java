class Student {
    int id;
    String name;
    int age;
    String department;

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.id = 101;
        s.name = "John";
        s.age = 20;
        s.department = "Computer Science";

        s.display();
    }
}