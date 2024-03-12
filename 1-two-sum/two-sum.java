class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m= new HashMap<>();
        int a[]= new int[2];
        for(int i=0;i<nums.length;i++)
        {
          if(m.containsKey(target-nums[i])) 
          {
              int ele=target-nums[i];
              a[0]=i;
              a[1]=m.get(ele);
              return a;
          }  
          m.put(nums[i],i);
        }
        return a;
    }
}