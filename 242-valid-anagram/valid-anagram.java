class Solution {
    public boolean isAnagram(String s, String t) {
    //  ************ Hashing ********** //
    //   int hash1[]= new int[256];
    //   int hash2[]= new int[256];
    //   for(int i=0;i<s.length();i++)
    //    hash1[s.charAt(i)-'0']++;
    //    for(int i=0;i<t.length();i++)
    //    hash2[t.charAt(i)-'0']++;
    //   for(int i=0;i<256;i++)
    //   {
    //       if(hash1[i] != hash2[i])
    //        return false;
    //   }
    //   return true;

    // **************************** Map = O(N) ******************************* //
    Map<Character,Integer> map=new LinkedHashMap<>();
    if(s.length() != t.length())
    {
        return false;
    }
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if( map.containsKey(ch) )
            map.put(ch , map.get(ch)+1 );
        else
            map.put(s.charAt(i) , 1);       
    }
    for(int i=0;i<t.length();i++)
    {
        // IF not in map return false
        if(! map.containsKey(t.charAt(i)))
         return false;
        else
        {
            // MAIN PART
            char ch=t.charAt(i);
            int count=map.get(ch);
            if(count==1)
              map.remove(ch);
            else
             map.put(ch,map.get(ch)-1);
        }
    }
    return map.isEmpty();
    }
}