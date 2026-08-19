class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) {
            return false;
        }
        int freq[] = new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s1.length();i++){
            int index = s1.charAt(i)-'a';
            freq[index]++;
        }
        int Windfreq[] = new int[26];
        int winsize = s1.length();
        for(int i=0;i<winsize;i++){
            int index1 = s2.charAt(i)-'a';
            Windfreq[index1]++;
        }
        if(Arrays.equals(freq,Windfreq))
            return true;
        
        for(int r = winsize;r<s2.length();r++){
            int addind = s2.charAt(r)-'a';
            Windfreq[addind]++;
            int remind = s2.charAt(r-winsize)-'a';
            Windfreq[remind]--;
            if(Arrays.equals(freq,Windfreq))
                return true;
        }
        return false;
    }
}