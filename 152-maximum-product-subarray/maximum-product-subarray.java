class Solution {
    public int maxProduct(int[] nums) {
       int temp=1;
       int max=Integer.MIN_VALUE;
       //front to back Checkkkk
       for(int i:nums)
       {
        temp*=i;
        max=Math.max(temp,max);
        if(temp==0)
         temp=1;
       }
       // Back to front Checkkkkkk
       temp=1;
       for(int i=nums.length-1;i>=0;i--)
       {
        temp*=nums[i];
        max=Math.max(max,temp);
        if(temp==0)
         temp=1;
       }

       return max;
    }
}