public class fruitsIntoBasket {
    
}
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n= fruits.length;
        boolean [] bool = new boolean[n];
        int unplaced =0;
        for(int num : fruits){
            boolean placed = false;
            for(int j=0;j<n;j++){
                if(!bool[j]&&baskets[j]>=num){
                    bool[j]=true;
                    placed = true;
                    break;
                }
                
            }
            if(!placed){
                unplaced++;;
            }
        }
        return unplaced;
    }
}