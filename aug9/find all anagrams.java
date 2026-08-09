class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> list=new ArrayList<>();
    int n=p.length();
   
    int[] count1=new int[26];
     int[] count2=new int[26];
     if(n>s.length())
     {return list;
     }
     for(int i=0;i<n;i++)
     {
        count1[s.charAt(i)-'a']++;
     }
     for(int j=0;j<n;j++)
     {
        count2[p.charAt(j)-'a']++;
     }
     if(Arrays.equals(count1,count2))
     {
        list.add(0);

     }
     for(int r=n;r<s.length();r++)
     {  count1[s.charAt(r)-'a']++;
        int left=r-n;
        count1[s.charAt(left)-'a']--;
        if(Arrays.equals(count1,count2))
        {
            list.add(left+1);
        }
     }
     return list;
    }
}
