import java.util.*;
public class Num_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                if(j%2==0){
                    System.out.print(" "+(Math.abs(i-j)+1)+" ");
                }
                else{
                    System.out.print(Math.abs(i-j)+1);
                }
            }
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
