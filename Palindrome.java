class Solution {
    public boolean isPalindrome(int x) {
        int d,rev=0;
        int p=x;
        if(x<0)
        {
            return false;
        }   
             while(p!=0)
            {
                 d=p%10;
                rev=rev*10+d;
                 p=p/10;
            }
            if(rev==x)
            {
                return true;
            }
             return false;
    
    }
}