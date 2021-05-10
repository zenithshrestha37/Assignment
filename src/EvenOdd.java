public class EvenOdd {
    public static void main(String[] args) {
        int[] a= {2,4,6,1,10};
        int io=0;
        int ie=0;
        int no=0;
        int ne=0;
        for(int i=0; i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                ne=ne+1;
                ie=i;
            }
            else
            {
                no=no+1;
                io=i;
            }
        }
        if(no==1)
        {
            System.out.println(a[io]);
        }
        else
        {
            System.out.println(a[ie]);
        }

    }
}
