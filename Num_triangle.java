import java.util.*;
public class Num_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        int counter=1;
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=rows-counter;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=counter*2-1;j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(counter);
                }
            }
            for(int j=1;j<=rows-counter;j++){
                System.out.print(" ");
            }
                
            
            counter++;
            System.out.println();
        }
    }
}
