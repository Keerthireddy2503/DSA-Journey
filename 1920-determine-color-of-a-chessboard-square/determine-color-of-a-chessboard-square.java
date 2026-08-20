class Solution {
    public boolean squareIsWhite(String c) {
        char ch = c.charAt(0);
        int num = c.charAt(1)-'0';
        if(ch=='a'||ch=='c'||ch=='e'||ch=='g'){
            if(num%2==0)
                return true;
            else
                return false;
        }
        else{
            if(num%2==0)
                return false;
            else
                return true;
        }
    }
}