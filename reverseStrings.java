package learning;

public class reverseStrings {
    public static void main(String[] args){
        char[] s = {'h','e','l','l','o'};
        revstring(s);
        for (char i : s) {
            System.out.print(i);
        }
    }
    public static void revstring(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
