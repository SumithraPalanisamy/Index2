import java.util.*;

public class Indexarray {
   private static Scanner s;

public static void main(String[] args) {
      s = new Scanner(System.in);
     int n=s.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
           {
           a[i]=s.nextInt();
       }
       
       for(int i=0;i<n;i++)
       {
        if(a[i]>=0&&a[i]==i)
            System.out.println(a[i]);
       }
           
   }
}