class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)->{
         if(a[0]==b[0])
          return Integer.compare(a[1],b[1]);
         else
          return Integer.compare(a[0],b[0]);
       }   
       );
       for(int i=0;i<points.length;i++)
        System.out.println(points[i][0]+" "+points[i][1]);

    int prev=points[0][1];
    int c=1;
    for(int i=1;i<points.length;i++)
    {
     if(prev >= points[i][0])
     {
         if(prev > points[i][1])
         {
            prev=points[i][1];
         }
     }
     else
     {
        prev=points[i][1];
        c++;
     }
      
    }

      return c;
    }
}