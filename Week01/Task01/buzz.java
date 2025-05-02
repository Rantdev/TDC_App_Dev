import java.util.*;
public class buzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%7==0||n%10==7){
            System.out.println("this number is buzz");
        }
        else
        System.out.println("this number is not buzz");
    }
}
