public class Student {

    public static void main(String[] args) {
        StudentClass p1= new StudentClass();
        StudentClass p2= new StudentClass("zenith");
        StudentClass p3= new StudentClass("shrestha");

    }

}

class StudentClass{
    String name;
    StudentClass(){
        this.name="unknown";
        System.out.println("unknown");
    }
    StudentClass(String a){
        this.name=a;
        System.out.println("the name on student is " +a);

    }
}