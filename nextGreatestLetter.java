package learning;

public class nextGreatestLetter {
    public static void main(String[] args){
        char[] letters ={'c','f','j'};
        char target ='a';
        System.out.println(nextgreatestLetter(letters,target));
    }
    public static char nextgreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid])
                end=mid-1;
            else
                start =mid+1;
        }
        return letters[start%letters.length];
    }
}
