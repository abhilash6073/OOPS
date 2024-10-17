package Strings;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = s1;
        s1.marks = 90;
        s2.marks = 95;
        System.out.println("s1 marks: " + s1.marks);
        System.out.println("s2 marks: " + s2.marks);

        String str = "ABCD";
        String str1 = str;
        str = str + "E";
        System.out.println(str);
        System.out.println(str1);

        String y = "A";
        y = y + 'B';
        System.out.println(y);
        System.out.println(y+1);
    }
}
