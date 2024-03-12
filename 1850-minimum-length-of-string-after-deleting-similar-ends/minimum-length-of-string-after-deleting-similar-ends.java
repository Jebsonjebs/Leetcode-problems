class Solution {
    public int minimumLength(String s) {
        int l=0 ;
        int r=s.length()-1 ;
        while(l<r && s.charAt(l) == s.charAt(r) )
        {
          char ch=s.charAt(l);
          while(l<=r && s.charAt(l)==ch)
           l++;
          while(r>=l && s.charAt(r)==ch)
           r-- ;
        }
        System.out.println(l+" "+r);
        return r-l+1;
       
    }
}