package CollectionAndGenerics;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return "Student{name= " + name + ", marks= " + marks + " }";
    }
}
