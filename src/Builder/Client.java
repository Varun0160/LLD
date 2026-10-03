package Builder;

public class Client {
    public static void main(String[] args) {

//    Builder b=new Builder();
  Student std= new Student.Builder()
          .setName("varun")
          .setAge(18)
          .setYear(2026)
          .setPhoneNumber("123")
          .setClg("123")
          .setBatch("cs")
          .setUsn(1.22)
          .build();
        std.display();
        System.out.println();



    }
}
