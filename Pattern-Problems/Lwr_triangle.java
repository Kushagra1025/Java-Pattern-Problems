import java.util.*;
public class Lwr_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        char marker='*';
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(marker);
            }
            System.out.print("\n");
        }
    }
}
