package Builder;

public class Student {
    private String name;
    private int age;
    private String clg;
    private String Batch;
    private double usn;
    private  String PhoneNumber;
    private int year;


//    public static Builder getBuilder(){
//        return new Builder();
//    }


    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.clg = builder.clg;
        this.Batch = builder.Batch;
        this.usn = builder.usn;
        this.PhoneNumber = builder.PhoneNumber;
        this.year = builder.year;

    }

    public void display(){
        System.out.println(name + " " + age + " " + clg + " " + Batch + " " + usn+" "+PhoneNumber+" "+year);

    }

    public static class Builder {
        private String name;
        private int age;
        private String clg;
        private String Batch;
        private double usn;
        private String PhoneNumber;
        private int year;

        public Builder setPhoneNumber(String phoneNumber) {
            this.PhoneNumber = phoneNumber;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setClg(String clg) {
            this.clg = clg;
            return this;
        }

        public Builder setBatch(String batch) {
            this.Batch = batch;
            return this;
        }

        public Builder setUsn(double usn) {
            this.usn = usn;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Student build() {
            return new Student(this);

        }

    }
}
