public class minMAx {
    public static void main(String args[]) {
        int arr[] = {10, 12, 3, 14, 15, 16};
        int min = arr[0];
        int max = arr[0];
        int Minanswer = Min(arr, min);
        int Maxanswer =Max(arr,max);
        System.out.println("The Minimum value in the given array is  " + Minanswer);
        System.out.println("The Maximum value in the given array is  " + Maxanswer);
    }

    // this code will give minimum value in a array

    public static int Min(int[] arr, int min) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                
            }
        }
        return min;
    }

    // this code will give maximum value in a array

    public static int Max(int[] arr, int max) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                
            }
        }
        return max;
    }
}
