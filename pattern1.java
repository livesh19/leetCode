import java.util.*;
class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            int x=i-1;
            for(int j =0;j<x;j++){
                System.out.print(" ");
            }
            for(int k =0;k<(n-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}