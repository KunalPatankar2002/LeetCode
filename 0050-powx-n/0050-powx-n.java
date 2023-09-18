class Solution {
    double power(double x, long n){
        
        if (n == 1)
            return x;
        if(n%2==0){
            double y = power(x,n/2);
            return y*y;
        }
        return x * power(x,n - 1);
    }
    public double myPow(double x, int n) {
        if (n == 0 || x==1 || (x==-1 && n%2==0))
            return 1;
        
        if(n==Integer.MIN_VALUE)
            n++;
        if(n<0){
            return 1/power(x,(long)-n);
        }
        return power(x,(long)n);
    }
}