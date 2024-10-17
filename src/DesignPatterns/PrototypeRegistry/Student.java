package DesignPatterns.PrototypeRegistry;

public class Student {
    private String batchName;
    private double avgBatchPsp;
    private String instructorName;
    private String monthOfEnrollment;
    private String currentModule;
    private String name;
    private String phoneNo;
    private String email;

    public Student(String batchName, double avgBatchPsp, String instructorName, String monthOfEnrollment, String currentModule, String name, String phoneNo, String email) {
        this.batchName = batchName;
        this.avgBatchPsp = avgBatchPsp;
        this.instructorName = instructorName;
        this.monthOfEnrollment = monthOfEnrollment;
        this.currentModule = currentModule;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public Student() {
    }

    public Student copy(){
        Student student = new Student();
        student.batchName = this.batchName;
        student.currentModule = this.currentModule;
        student.avgBatchPsp = this.avgBatchPsp;
        student.instructorName = this.instructorName;
        student.monthOfEnrollment = this.monthOfEnrollment;
        return student;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getMonthOfEnrollment() {
        return monthOfEnrollment;
    }

    public void setMonthOfEnrollment(String monthOfEnrollment) {
        this.monthOfEnrollment = monthOfEnrollment;
    }

    public String getCurrentModule() {
        return currentModule;
    }

    public void setCurrentModule(String currentModule) {
        this.currentModule = currentModule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



