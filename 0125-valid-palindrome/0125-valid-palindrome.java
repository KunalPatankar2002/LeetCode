class Solution {
    public boolean isPalindrome(String x) {
        String s="";
        for(int i =0;i<x.length();i++){
            if(Character.isLetterOrDigit(x.charAt(i)))
                s+=x.charAt(i);
        }
        s=s.toLowerCase();
        System.out.println(s);
        for(int i=0, j=s.length()-1; i<=j;i++,j--){
            if(s.charAt(i)==s.charAt(j)){}
            else 
                return false;
        }
        return true;
    }
}