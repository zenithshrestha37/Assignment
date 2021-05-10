import java.util.Scanner;

public class ComplexNumber {


    public static void main(String[] args) {
        Complex C1=new Complex();
        Complex C2=new Complex();

        Scanner sc= new Scanner(System.in);
        C1.real= sc.nextInt();
        C1.imaginary= sc.nextInt();
        C2.real= sc.nextInt();
        C2.imaginary= sc.nextInt();
        C1.add(C1,C2);
        C1.sub(C1,C2);
        C1.mul(C1,C2);


    }

}

class Complex{
    int real;
    int imaginary;
    void add(Complex O1, Complex O2)
    {
        int z= O1.real+O2.real;
        int y= O1.imaginary+O2.imaginary;
        System.out.println("the addition is " +z + "+" +y +"i");
    }
    void sub(Complex O1, Complex O2)
    {
        int z= O1.real-O2.real;
        int y= O1.imaginary-O2.imaginary;
        System.out.println("the subtraction is " +z + "+" +y +"i");
    }
    void mul(Complex O1, Complex O2)
    {
        int z= (O1.real*O2.real)-(O2.imaginary*O1.imaginary);
        int y= (O1.real*O2.imaginary)+(O2.real*O1.imaginary);
        System.out.println("the multiplication is " +z +"+" +y +"i");
    }
}
