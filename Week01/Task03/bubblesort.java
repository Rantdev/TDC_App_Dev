import java.util.*;
 class bubblesort {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
int arr[]=new int[N];
    for(int s=0;s<N;s++){
      arr[s]=sc.nextInt();
    }
        
for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-i-1;j++){
if(arr[j]>arr[j+1]){
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}
    }
}
System.out.println(Arrays.toString(arr));
    }
}
