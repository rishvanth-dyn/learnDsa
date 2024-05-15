package learning;

public class searchMAXMIN {
    public static void main(String args[]){
        int arr[][] = {{10,20,30,4},
                      {25,37,48,51},
                      {67,32,93}};
        int max = arr[0][0];
        int min = arr[0][0];
        int answerMIN = findmax(arr,max);
        int answerMAX = findmin(arr,min);
        System.out.println("The Minimum element in an 2D array " + answerMIN);
        System.out.println("The Maximum element in an 2D array " + answerMAX);
    }
    public static int findmax(int[][] arr,int max){
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[i].length;++j){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }return max;
    }
    public static int findmin(int[][] arr,int min) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j]<min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
