import java.util.*;
public class Rect_filled {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int rows=sc.nextInt();
        System.out.print("\nEnter the no, of columns: ");
        int cols=sc.nextInt();
        char marker='*';
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(marker);
            }
            System.out.print("\n");
        }
    }
}