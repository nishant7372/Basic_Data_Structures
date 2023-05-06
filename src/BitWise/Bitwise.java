package BitWise;

public class Bitwise {

    // Integer.bitCount(int n);
    public int setBits(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }

    public boolean isPowerOfTwo(int n){
        // return Integer.bitCount(n)==1;
        return setBits(n)==1;
    }

    public boolean isOdd(int n){
        return (n&1)==1;
    }

    public boolean isEven(int n){
        return (n&1)==0;
    }

    public String convertToBinary(int n){
        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.append(n&1);
            n>>=1;
        }
        return sb.reverse().toString();
    }


    // reverse Actual Bits
    public int reverseBits(int n){
        int rev = 0;
        // getting last bit - n&1
        // accumulating to rev - n^(lastBit)
        while(n>0){
            rev<<=1;
            rev^=(n&1);
            n>>=1;
        }
        return rev;
    }

    public boolean isKthBitSet(int n,int k) {
        // right shift by k
        n >>= k;
        return (n & 1) == 1;
    }

    // Valid for Double
    // for both +ve and -ve powers
    public double pow(double x,int n){
        boolean neg = n < 0;

        long p = Math.abs((long)n);
        double ans=1.0;
        while(p>0){
            if((p&1)==1){
                ans=ans*x;
            }
            x=x*x;
            p>>=1;
        }
        return neg? 1/ans : ans;
    }

    private long power(long x, int y)
    {
        int mod  = 1000000007;
        long res = 1;

        while (y > 0)
        {
            if ((y & 1) != 0)
                res = (res * x) % mod;
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }
}
