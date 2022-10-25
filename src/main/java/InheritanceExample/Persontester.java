package InheritanceExample;

public class Persontester {
    public static void main(String [] args){
        Person sally=new Person("Sally:","Phillips");
        System.out.println(sally);
        Student miek=new Student("mike","thompson","12345");
        System.out.println(miek);
        StudentEmployee jeff= new StudentEmployee("Jeff","sam","4567",20.5,"#12345");
        System.out.println(jeff);


    }
}
