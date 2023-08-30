class Solution {
    public boolean isAnagram(String s, String t) {
        int len = t.length(), i=0;
        if(s.length() != t.length())
            return false;
        while(!(s.equals("") || t.equals(""))){
            // System.out.println(s);
            // System.out.println(t);
            if(s.equals(t))
                return true;
            int idx= s.indexOf(t.charAt(i));
            if(idx==-1)
                break;
            s = s.substring(0, idx) + s.substring(idx + 1,s.length());
            t = t.substring(0, i) + t.substring(i + 1,t.length());
            // System.out.println(s);
            // System.out.println(t);
        }
        if ((s.equals("") && t.equals("")) || (s.equals(t)))
            return true;
        return false;
    }
}