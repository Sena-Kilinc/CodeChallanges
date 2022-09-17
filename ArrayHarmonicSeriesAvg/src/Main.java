public class Main {
    public static void main(String[] args) {
        double [] nums = {1,2,3,4};
        int length = nums.length;

        double sum=0;
        for (double num : nums) {
            sum += 1 / num;
        }

        double result=length/sum;
        System.out.printf("Harmonic Average: %.2f",result);
    }
}
