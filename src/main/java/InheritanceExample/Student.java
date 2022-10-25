package InheritanceExample;

public class Student extends Person{
    private String studentid;

    public Student(String firstname,String lasname,String studentid){
        super(firstname,lasname);
        this.studentid=studentid;
    }
    public String getStudentid(){
        return studentid;
    }
    public void setStudentid(String studentid){
        this.studentid=studentid;
    }
    @Override
    public String toString() {
        return "studenid" + studentid+super.toString();
    }
}
