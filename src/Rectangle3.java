public class Rectangle3 {

    public static void main(String[] args) {
        Rectangle L1= new Rectangle();
        Rectangle B1= new Rectangle(4,5);
        Rectangle C1= new Rectangle(6);

        L1.area();
        B1.area();
        C1.area();
    }

}

class Rectangle{
    int length;
    int breath;

    Rectangle() {
        this.length=0;
        this.breath=0;
    }

    Rectangle(int l, int b) {
        this.length=l;
        this.breath=b;
    }
    Rectangle(int l) {
        this.length=l;
        this.breath=l;
    }

    void area() {
        int area=this.length*this.breath;
        System.out.println("Area:"+area);
    }
}