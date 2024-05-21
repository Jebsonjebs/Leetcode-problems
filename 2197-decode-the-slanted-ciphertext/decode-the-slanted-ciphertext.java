class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
       int col = encodedText.length() / rows;
       char ch[][]=new char[rows][col];
       int index=0;
       for(int i=0;i<rows;i++)
       {
          for(int j=0;j<col;j++)
          {
             ch[i][j]=encodedText.charAt(index++);
          }
       }
       StringBuffer s=new StringBuffer();
       for(int i=0;i<col;i++)
       {
        int ind=0;
        for(int j=i;j<rows+i;j++)
        {
            if(j<col)
            s.append(ch[ind++][j]);
        }
       }
      //System.out.println(s);
      return s.toString().stripTrailing();
    }
}