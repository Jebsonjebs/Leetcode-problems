class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<>();
       Map<Integer,Integer> map=new LinkedHashMap<>();
       for(int i=0;i<nums.length;i++)
       {
          if(map.containsKey(nums[i]))
           map.put(nums[i],map.get(nums[i])+1);
          else
           map.put(nums[i],1);
       } 
       for(Map.Entry<Integer,Integer> m:map.entrySet())
       {
        if(m.getValue()==2)
        list.add(m.getKey());
       }
       return list;
    }
}