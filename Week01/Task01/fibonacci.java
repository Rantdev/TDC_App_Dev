import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
      for(int i=3;i<=n;i++){

            System.out.print(a+ " ");
            System.out.print(b+" ");
            a=b+a;
            b=a+b;}
         
        
     /*  while(b<100){
            System.out.print(a+ " ");
            System.out.print(b+" ");
            a=b+a;
            b=a+b;}
    */
        }
    
    }
