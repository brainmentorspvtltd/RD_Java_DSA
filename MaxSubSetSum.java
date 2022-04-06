public class MaxSubSetSum {
    public static void main(String[] args) {
        windowSliding();
    }

    static void windowSliding() {
        int arr[] = { 10, 20, 30, 5, 50, 90, 2, 40 };
        int k = 3;
        int max = 0;
        int slideSum = 0;
        for (int i = 0; i < k; i++) {
            slideSum += arr[i];
        }
        max = slideSum;
        for (int i = k; i < arr.length; i++) {
            slideSum = slideSum + arr[i] - arr[i - k];
            if (slideSum > max) {
                max = slideSum;
            }
        }
        System.out.println("Max Sum " + max);
    }

    public static void bruteForce() {
        int arr[] = { 10, 20, 30, 5, 50, 90, 2, 40 };
        int k = 3;
        int max = 0;
        for (int i = 0; (i + k - 1) < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum = sum + arr[i + j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);

    }
}
