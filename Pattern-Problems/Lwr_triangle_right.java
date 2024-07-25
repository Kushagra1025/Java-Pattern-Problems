import java.util.*;
public class Lwr_triangle_right {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows=sc.nextInt();
        char marker='*';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(marker);
            }
            System.out.print("\n");
        }
    }
}
