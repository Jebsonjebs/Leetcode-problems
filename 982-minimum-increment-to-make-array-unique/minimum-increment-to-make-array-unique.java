class Solution {
    public int minIncrementForUnique(int[] nums) {
      Arrays.sort(nums);
      int answer=0;
      for(int i=1;i<nums.length;i++)
      {
        int val=nums[i];
        if(nums[i] <= nums[i-1])
         nums[i]=nums[i-1]+1;
         answer+= (nums[i] - val);    
      }
      return answer;
    //  for(int i=0;i<nums.length;i++)
    //   {
    //     copy[i]=nums[i];
    //     max=Math.max(max,nums[i]);
    //     min=Math.min(max,nums[i]);        
    //     if(map.containsKey(nums[i]))
    //      map.put(nums[i],map.get(nums[i])+1);
    //     else
    //      map.put(nums[i],1);
    //   }    
    //  int answer=0;
    //  int ind=0;
    //   for(int i=0;i<nums.length;i++)
    //   {
    //     if(map.get(nums[i])>1)
    //     {
    //         for(int j=ind;j<nums.length;j++)
    //         {
    //             if(map.containsKey(copy[j]))
    //             {  }
    //             else{
    //                 if(copy[j]>nums[i])  {
    //                  answer+= (copy[j]-nums[i]);
    //                  map.put(copy[j],1);
    //                  ind=j;
    //                  break;
    //                 }
    //             } //else             
    //         }//for j
    //         map.put(nums[i],map.get(nums[i])-1);
           
    //     }//if
    //   }//for i
    //   return answer;
    }
}