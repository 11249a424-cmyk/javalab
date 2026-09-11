interface Academic {
    void academicMarks();
}

interface Sports {
    void sportsMarks();
}

class Student implements Academic, Sports {
    int academic, sports;

    Student(int academic, int sports) {
        this.academic = academic;
        this.sports = sports;
    }

    public void academicMarks() {
        System.out.println("Academic Marks: " + academic);
    }

    public void sportsMarks() {
        System.out.println("Sports Marks: " + sports);
    }

    void display() {
        academicMarks();
        sportsMarks();
        System.out.println("Total Marks: " + (academic + sports));
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student(85, 90);
        s.display();
    }
}