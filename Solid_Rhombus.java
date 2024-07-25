import java.util.*;
public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        for(int i=rows-1;i>=0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<rows;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
