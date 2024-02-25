public class arraySumAverage {
    public static void main(String[] args) {
        int[] num = ArrayUtility.inputArray();
        System.out.println("Sum of the array : "+ArraySum(num));
        System.out.println("Average of the array : "+ArrayAverage(num));
    }
    public static int ArraySum(int[] n){
        int i=0;
        int sum=0;
        while (i<n.length){
            sum+=n[i];
            i++;
        }
          return sum;
    }
    public static float ArrayAverage(int[] n){
        int sum=ArraySum(n);
        float avg=(float) sum/n.length;
        return avg;
    }

}
