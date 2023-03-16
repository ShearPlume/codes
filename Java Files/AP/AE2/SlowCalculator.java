package AE2;

public class SlowCalculator implements Runnable {

    private final long N;
    private boolean ifCancelled=false;
    private  int R;

    public SlowCalculator(final long N) {
        this.N = N;
        R=0;
    }

    public long getN()
    {
        return N;
    }

    public void setSign(boolean b)
    {
        ifCancelled=b;
    }

    public boolean getSign()
    {
        return ifCancelled;
    }

    public int getR()
    {
        return R;
    }

    public void run() {
        final int result = calculate(N);
        // final long tempN=this.N;
        if(!ifCancelled)//in case it was interrupted and returned an incorrect result, then we do not give it to R
        R=result;

        // System.out.println(result);  // you'll be changing this
    }

    private static int calculate(final long N) {
        // This (very inefficiently) finds and returns the number of unique prime factors of |N|
        // You don't need to think about the mathematical details; what's important is that it does some slow calculation taking N as input
        // You should not modify the calculation performed by this class, but you may want to add support for interruption
        int count = 0;
        for (long candidate = 2; candidate < N; ++candidate) {

            if(Thread.currentThread().isInterrupted())
            break;//stop the calculation if interrupted
            if (isPrime(candidate)) {
                if (Math.abs(N) % candidate == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPrime(final long n) {
        // This (very inefficiently) checks whether n is prime
        // You should not modify this method
        for (long candidate = 2; candidate < Math.sqrt(n); ++candidate) {
            if (n % candidate == 0) {
                return false;
            }
        }
        return true;
    }
}