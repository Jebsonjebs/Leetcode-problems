class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> answer= new LinkedList<>();
       p=sort(p);
       System.out.println(p);
       for(int i=0;i<=s.length()-p.length();i++)
       {
        
          if(p.equals(sort(s.substring(i,i+p.length()) ) ))
           answer.add(i);
       } 
       return answer;
    }

    public static String  sort(String s)
    {
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        //System.out.println(String.valueOf(arr));
        return String.valueOf(arr);
    }
}