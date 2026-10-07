package Prototype;

public class Client {
    public static void main(String[] args) {
        Student st=new Student();
        st.name="varun";
        st.age=10;
        st.phone="123";
        st.address="bengalore";
        st.Batch="cs";
        System.out.println(st);
        Student st1=st.clone();
        System.out.println(st1.address);
        System.out.println(st1);
    Student intstudent=new IntellStudent();
    intstudent.name="varun";
    intstudent.age=10;
    intstudent.phone="123";
    intstudent.address="bengalore";
    intstudent.Batch="cs";
    System.out.println(intstudent);
    Student intstudent1=intstudent.clone();
    System.out.println(intstudent1.address);
    System.out.println(intstudent1);

    }
}
