package DesignPatterns.Singleton.DesignPatterns;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()
                .setId(1)
                .setName("Abhilash")
                .setGradYear(2021)
                .setYoe(1)
                .setPsp(80)
                .setBatchName("LLD Mar23")
                .build();

        System.out.println(s);
    }
}
