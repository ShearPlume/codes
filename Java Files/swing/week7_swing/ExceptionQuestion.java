package swing.week7_swing;

public class ExceptionQuestion {
    public static void main(String[] args) {
        int[] myArray = {};
        System.out.println("The first maximum number is " + maximum(myArray));
    }

    public static int[] subArray(int[] nums, int num1, int num2) {
        int[] nums2 = new int[num2 - num1 + 1];
        for (int i = 0; i < num2 - num1 + 1; i++) {
            nums2[i] = nums[num1 + i];
        }
        return nums2;
    }

    public static int max(int a1, int a2) {
        if (a1 > a2)
            return a1;
        else
            return a2;
    }

    public static int maximum(int[] numberArray) {
        if (numberArray.length == 1)
            return numberArray[0];
        else {
            int len = numberArray.length;
            int m = len / 2;
            int[] smallArray1 = subArray(numberArray, 0, m - 1);
            int[] smallArray2 = subArray(numberArray, m, len - 1);
            
            return max(maximum(smallArray1), maximum(smallArray2));
        }
    }

}