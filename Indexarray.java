import java.util.*;

public class Indexarray {
   private static Scanner s;

public static void main(String[] args) {
      s = new Scanner(System.in);
     int k=s.nextInt();
       int ar[]=new int[k];
       for(int i=0;i<k;i++)
           {
           ar[i]=s.nextInt();
       }
       
       for(int i=0;i<k;i++)
       {
        if(ar[i]>=0&&ar[i]==i)
            System.out.println(ar[i]);
       }
           
   }
}