package learning;
import java.util.Arrays;

public class assignCookie {
        public static void main(String[] args){
            int[] g={1,2,3};
            int[] s={1,1};
            System.out.println(findContentChildren(g,s));
        }
        public static int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int result=0;
            int child=g.length-1;
            int cookie=s.length-1;

            while(child >=0 && cookie >=0){
                if(s[cookie]>=g[child]){
                    result++;
                    cookie--;
                }
                child--;
            }
            return result;
        }
    }

