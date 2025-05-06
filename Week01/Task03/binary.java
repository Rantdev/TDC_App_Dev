import java.util.*;
public class binary {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int a=sc.nextInt();
        int x[]=new int[a];
        System.out.println("Enter the value of array element");
        for(int y=0;y<a;y++){
            x[y]=sc.nextInt();

        }
Arrays.sort(x);
System.out.println("enter the search element");
int s=sc.nextInt();
int start=0;
int end=a-1;
int res=-1;
while(start<=end){
   int mid=start+ (end-start)/2;
    if(s<x[mid])
    end=mid-1;
    else if(s>x[mid])
    start=mid+1;
    else if(s==x[mid]){
    res=mid;
    System.out.println(res);
    break;}
}if(res==-1)
System.out.println(-1);
    }
}
