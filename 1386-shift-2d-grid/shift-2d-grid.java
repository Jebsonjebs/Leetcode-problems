class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int z=1;
        int m = grid.length;
        int n = grid[0].length;

        int first=grid[m-1][n-1];
        while(z<=k){   
        int track=grid[0][0];
       
        for(int i=0;i<m;i++)
        {
            List<Integer> ll=new ArrayList<>();
            for(int j=0;j<n;j++)
            {   
                
               int temp=grid[i][j];
               grid[i][j]=track;
               track=temp;             
               if(i==m-1 && j==n-1 )
               {  
                int t=first;       
                grid[0][0]=temp;
                first=t;
               }
            }
        }
        z++;     
       }
       // Build result list after final shift
        for (int i = 0; i < m; i++) {
            List<Integer> ll = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                ll.add(grid[i][j]);
            }
            result.add(ll);
        }

       return result;
        

    }
}