package review_oop;

import java.util.Arrays;

public class Student {
    int id;
    String name;
    String address;
    String priority;
    String[] examSubject;

    public Student(){

    }

    public Student(int id, String name, String address, String priority, String[] examSubject) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priority = priority;
        this.examSubject = examSubject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority(String priority) {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String[] getExamSubject() {
        return examSubject;
    }

    public void setExamSubject(String[] examSubject) {
        this.examSubject = examSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priority='" + priority + '\'' +
                ", examSubject=" + Arrays.toString(examSubject) +
                '}';
    }
}
