public class lstr {
    public static void main(String args[]){
        String name = "rishvanth";
        char target = 'v';
        int result=linearString(name,target);
        boolean answer=linearString2(name,target);
        System.out.println("Index value of the target string given :" +result);
        System.out.println( "Is target is present in the string given :" +answer);
    }

    // this code will return the index value of the given Target

    static int linearString(String name,char target){
        int i;
        for (i=0;i<name.charAt(i);i++){
            if(target ==name.charAt(i)){
                return i;
            }
        }return 0;
    }

    // this code will check if the given Target is presnt are not

    static boolean linearString2(String name,char target) {
        int i;
        for (i = 0; i < name.charAt(i); i++) {
            if (target == name.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
