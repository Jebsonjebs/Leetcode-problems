class Solution {
    public int chalkReplacer(int[] chalk, int k) {
    while(true){
      for(int i=0;i<chalk.length;i++)
      {
        if(k-chalk[i] < 0)
        return  i;
        k=k-chalk[i];
      }
    }  

    }
}