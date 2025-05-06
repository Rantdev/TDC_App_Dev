import java.util.*;
public class cumulative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            int s=sc.nextInt();
            sum=sum+s;
            arr[i]=sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
