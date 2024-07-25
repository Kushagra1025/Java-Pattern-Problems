import java.util.*;
public class Rect_hollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        System.out.print("\nEnter no. of columns: ");
        int cols=sc.nextInt();
        char marker='*';
        for(int i=0;i<rows;i++){
            if(i==0||i==rows-1){
                for(int j=0;j<cols;j++){
                    System.out.print(marker);
                }
                System.out.print("\n");
            }
            else{
                System.out.print(marker);
                for(int j=2;j<=cols-1;j++){
                    System.out.print(" ");
                }
                System.out.print(marker);
                System.out.print("\n");
            }
        }
    }
}
