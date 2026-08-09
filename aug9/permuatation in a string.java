class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
       int[] count1=new int[26];
       int[] count2=new int[26];
        if(n>s2.length())
       {return false;
       }
       for(int i=0;i<n;i++)
       {
          count1[s1.charAt(i)-'a']++;
       }
       for(int j=0;j<n;j++)
       {
          count2[s2.charAt(j)-'a']++;
       }
      
       if(Arrays.equals(count1,count2))
       {return true;
       }
       for(int r=n;r<s2.length();r++)
       {  count2[s2.charAt(r)-'a']++;
            int left = r - n;
            count2[s2.charAt(left) - 'a']--;

            if (Arrays.equals(count1, count2)) {
                return true;
            }

       }
       return false;
    }
}
