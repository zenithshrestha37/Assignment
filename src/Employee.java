public class Employee {
    String name;
    int yoj;
    String add;


    public static void main(String[] args) {

        Employee n1=new Employee();
        Employee y1=new Employee();
        Employee a1=new Employee();
        n1.name="robert";
        n1.yoj=1994;
        n1.add="64c walls street";
        System.out.println("Name  Year Of joining    Address");
        System.out.println(n1.name +"\t"+ n1.yoj +"\t\t"+ n1.add);

        y1.name="Sam";
        y1.yoj=2000;
        y1.add="64c walls street";

        System.out.println(y1.name +"\t"+ y1.yoj +"\t\t"+ y1.add);

        a1.name="jon";
        a1.yoj=2005;
        a1.add="64c walls street";

        System.out.println(a1.name +"\t"+ a1.yoj +"\t\t"+ a1.add);
    }

}

