class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0)return 0;
        int rows=grid.length;
        int cols = grid[0].length;
        int cntFresh=0;
        Queue<int []> queue = new LinkedList<>();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j]!=0){
                    cntFresh++;
                }
            }
        }
        if(cntFresh==0)return 0;
        int countMin = 0, cnt = 0;
        int dx[] = {0, 0, 1, -1};
        int dy[] = {1, -1, 0, 0};

        while(!queue.isEmpty()){
            int size = queue.size();
            cnt+=size;
            for(int i =0;i<size;i++){
                int pol[]=queue.poll();
                for(int j=0;j<4;j++){
                    int x= pol[0]+dx[j];
                    int y = pol[1]+dy[j];
                    if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || 
                    grid[x][y] == 2) continue;
                    
                    grid[x][y] = 2;
                    queue.offer(new int[]{x , y});
                }

            }
             if(queue.size() != 0) {
                countMin++;
             }
        }
          return cntFresh == cnt ? countMin : -1;

    }
}