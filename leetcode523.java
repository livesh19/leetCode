import java.util.ArrayList;

class ProductOfNumbers {
    private ArrayList<Integer> prefixProduct;
    
    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // Start with 1 as a dummy value for multiplication
    }
    
    public void add(int num) {
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1); // Reset the product list after encountering zero
        } else {
            int lastProduct = prefixProduct.get(prefixProduct.size() - 1);
            prefixProduct.add(lastProduct * num);
        }
    }
    
    public int getProduct(int k) {
        int n = prefixProduct.size();
        if (k >= n) return 0; // If k extends beyond a reset (0 was encountered)
        return prefixProduct.get(n - 1) / prefixProduct.get(n - 1 - k);
    }
}