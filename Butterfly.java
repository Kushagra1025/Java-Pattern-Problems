import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            for(int j=i+1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.print("\n");
        }
        for(int i=rows/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            for(int j=i+1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }
}
