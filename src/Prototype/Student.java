package Prototype;

public class Student {
    String name;
    int age;
    String address;
    String phone;
    String Batch;
    public Student(){

    }


    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.address = student.address;
        this.phone = student.phone;
        this.Batch = student.Batch;

    }

    public Student clone(){
        return new Student(this);
    }
}
