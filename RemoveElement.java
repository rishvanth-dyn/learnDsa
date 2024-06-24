package learning;

public class RemoveElement {
    public static void main(String[] args){
       int[] arr = {3, 2, 2, 3};
       System.out.println(removeElement(arr));
    }
    public static int removeElement(int[] arr){
        int k =0;
        int val = 3;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=val){
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                k++;
            }
        }return k;
    }
}
