package Prototype;

public class IntellStudent extends Student {
    int id;
    public IntellStudent(){

    }
    public IntellStudent(IntellStudent Intstudent){
        super(Intstudent);
        this.id = Intstudent.id;
    }
    public  IntellStudent clone(){
        return new IntellStudent(this);

    }
}
