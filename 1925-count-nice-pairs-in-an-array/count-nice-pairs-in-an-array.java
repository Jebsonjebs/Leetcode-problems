class Solution {
    public  int rev(int num){
       int ans=0;
       while(num>0)
       {
         int rem=num%10;
         ans  = ans*10 +rem;
         num=num/10;
       } 
       return ans;
    }
    public int countNicePairs(int[] nums) {
     int result=0;
     Map<Integer,Integer> map=new HashMap<>();
     for(int i:nums)
     System.out.print(i-rev(i)+" ");
     System.out.println();
     for(int i:nums)
     {
        int target=i- rev(i);
        int a=map.getOrDefault(target,0);
        System.out.println(a);
        result = (result+ a) %1000000007;
        map.put(target,a+1);
     }   

     return result;
    }
}