import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        // Step 1: Build Graph and In-degree Map
        Map<String, List<String>> graph = new HashMap<>(); // Ingredient → Recipes that need it
        Map<String, Integer> inDegree = new HashMap<>();    // Recipe → Count of missing ingredients

        // Initialize inDegree for recipes
        for (String recipe : recipes) {
            inDegree.put(recipe, 0);
        }

        // Build the dependency graph
        for (int i = 0; i < recipes.length; i++) {
            String recipe = recipes[i];
            for (String ingredient : ingredients.get(i)) {
                graph.putIfAbsent(ingredient, new ArrayList<>());
                graph.get(ingredient).add(recipe); // Ingredient → Recipe
                inDegree.put(recipe, inDegree.get(recipe) + 1); // Increment in-degree
            }
        }

        // Step 2: Initialize Queue with Available Supplies
        Queue<String> queue = new LinkedList<>();
        Set<String> available = new HashSet<>(Arrays.asList(supplies)); // Fast lookup

        for (String supply : supplies) {
            queue.offer(supply);
        }

        // Step 3: Process Queue (Topological Sorting)
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            String item = queue.poll();

            // If it's a recipe and has zero in-degree, add to result
            if (inDegree.containsKey(item) && inDegree.get(item) == 0) {
                result.add(item);
            }

            // Process recipes dependent on this ingredient
            if (graph.containsKey(item)) {
                for (String dependentRecipe : graph.get(item)) {
                    inDegree.put(dependentRecipe, inDegree.get(dependentRecipe) - 1);
                    
                    // If recipe is now fully available, add to queue
                    if (inDegree.get(dependentRecipe) == 0) {
                        queue.offer(dependentRecipe);
                    }
                }
            }
        }

        return result;
    }
}
