public class ProgrammingLanguage {

    public static void main(String[] args) {
        Programming p1= new Programming();
        Programming p2= new Programming("java");

    }

}

class Programming{

    private String str;

    Programming(){
        this.str = "I love programming";
        System.out.println(this.str);
    }

    Programming(String a){
        this.str = "I love " +a;
        System.out.println(this.str);
    }
}
