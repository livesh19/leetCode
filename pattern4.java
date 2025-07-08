// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j =i;j<n;j++){
                System.out.print(" "+" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k+" ");
            }
            for(int q=2;q<i+1;q++){
             
                System.out.print(q+" ");
            }
            System.out.println();
        }
    }
}