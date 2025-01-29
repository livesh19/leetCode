class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        
        for (int i = 0; i < flowerbed.length; i++) { 
            if (count == n) {
                return true;
            }
            
          
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);  
                boolean rightEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0); 
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;  // Place a flower here
                    count++;
                }
            }
        }
        
        return count >= n;
    }
}