import java.util.*;
public class Diamond {
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
                System.out.print(" * ");
            }
            else{
                System.out.print("*");
            }
        }
        for(int j=1;j<=rows-i;j++){
            System.out.print("  ");
        }
        System.out.println();
    }
    for(int i=rows;i>=1;i--){
        for(int j=1;j<=rows-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i*2-1;j++){
            if(j%2==0){
                System.out.print(" * ");
            }
            else{
                System.out.print("*");
            }
        }
        for(int j=1;j<=rows-i;j++){
            System.out.print("  ");
        }
        System.out.println();
    }
   } 
}
