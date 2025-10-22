import java.util.stream.*;
class Solution {
    
      public int missingMultiple(int[] nums, int k) {
        int small=0;
        int longNum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<small && nums[i]%k==0)
            small=nums[i];
            if(nums[i]>longNum )
            longNum=nums[i];
        }

        List<Integer> list =Arrays.stream(nums).boxed().collect(Collectors.toList());
        if(!list.contains(k))
        return k;
        System.out.println(list);
        int temp=k;
        int incre=1;
        while(temp<=longNum)
        {
          if(!list.contains(temp))   {
           System.out.println("DDDD");
            return temp;      
          }
           
           incre++;
           temp=temp+k;
            System.out.println("temp = "+temp);
           System.out.println("incre = "+incre);
        }
        return temp;

    }
}