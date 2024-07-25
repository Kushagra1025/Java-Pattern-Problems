import java.util.*;
public class Num_s1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");    
//  To print multiple things using a single sout statement, we use + operator. Just syntax....     
//  To reverse the series, (i=rows;i>=1;i++)
            }
            System.out.print("\n");
        }
    }
}
