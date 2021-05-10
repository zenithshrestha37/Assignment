public class Intersection {
    public static void main(String[] args) {

        int[]a1 = {1,3,4,9,8};
        int[]a2 = {5,6,7,8,9,2};
        int i,j,temp=0;

        for(i=0;i<a1.length;i++)
        {
            for(j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    System.out.println("The intersection of the array is :"+ a2[j]);
                }
            }
        }


    }
}

