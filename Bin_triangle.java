import java.util.*;
public class Bin_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            if(i%2==0){
                int val=0;
                for(int j=0;j<i;j++){
                    System.out.print(val+" ");
                    if(val==0){
                        val=1;
                    }
                    else{val=0;}
                }
            }
            else{
                int val=1;
                for(int j=0;j<i;j++){
                    System.out.print(val+" ");
                    if(val==1){
                        val=0;
                    }
                    else{val=1;}
                }
            }
            System.out.print("\n");
        }
    }
}
