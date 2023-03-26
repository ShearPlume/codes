public class SlowCalculator implements Runnable {

    private final long N;
    private boolean isCancel=false;
    private int aR;//actual result

    public boolean getIsCancel(){
        return isCancel;
    }

    public void setIsCancel(boolean b){
        isCancel=b;
    }

    public SlowCalculator(final long N) {
        this.N = N;
    }

    public long getN(){
        return N;
    }

    public int getAR(){
        return aR;
    }
    
    public void setAR(int t){
        aR=t;
    }

    public void run() {
        final int result = calculate(N);
        aR=result;
        //System.out.println(result);  // you'll be changing this
    }

    private static int calculate(final long N) {
        // This (very inefficiently) finds and returns the number of unique prime factors of |N|
        // You don't need to think about the mathematical details; what's important is that it does some slow calculation taking N as input
        // You should NOT modify the calculation performed by this class, but you may want to add support for interruption
        int count = 0;
        for (long candidate = 2; candidate < N; ++candidate) {
            if(Thread.currentThread().isInterrupted()) break;
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
        // You should NOT modify this method
        for (long candidate = 2; candidate < Math.sqrt(n); ++candidate) {
            if (n % candidate == 0) {
                return false;
            }
        }
        return true;
    }
}