class Solution {
    public int passThePillow(int n, int time) {
       int m=1;
       int c=0;
       boolean flag=false;
       while(true)
       {
        if(m==1 || flag==false)
        {
         System.out.print(m+" -> ");
          m++;
          flag=false;
          if(m==n)
           flag=true;
        }
        else if(n==m || flag==true)
        {
           m--;
           flag=true;
           if(m==1)
           {
            flag=false;
           }
        }
        c++;
        if(c==time)
        {
            return m;
        }

       }

    }
}