
class Main {
    public static void main(String[] args) {
        int n =6;
       int count =1;
       int flag =1;
       for(int i =0;i<n;i++){
           count = flag;
           for(int j =0;j<n;j++){
               count=count>n?count-n:count;
               System.out.print(count + " ");
               count++;
           }
           flag++;
           System.out.println(" ");
       }
    }
}