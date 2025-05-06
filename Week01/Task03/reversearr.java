import java.util.*;
public class reversearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int ar[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            ar[size-1-i]=arr[i];
        }
        System.out.println(Arrays.toString(ar));
    }
}
