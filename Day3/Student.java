class Student {
    private String name;
    private int marks;

    void setData(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }
}

class GraduateStudent extends Student {
    void calculateGrade() {
        int total = getMarks() + 5;
        System.out.println("Final Marks: " + total);
    }
}