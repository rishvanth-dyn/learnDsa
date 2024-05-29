package learing;
public class palindrome {													
		String s[] = new String[]{"madam", "Racecar", "and", "civic", "are", "level", "words" };
		String ans[] = new String[s.length];

		int index =0;

		for(String str: s){
			boolean isPalindrome = isPalindrome(str);
			ans[index] = isPalindrome ? "\n"+str+" ="+" palindrome" : "\n"+str+" ="+" notPalindrome";
			index++;
		}

		System.out.println(Arrays.toString(ans));
	}

	static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        str = str.toLowerCase();

        for (int i = 0; i <= str.length() / 2; i++) 
		{
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) 
			{
                return false;
            }
        }

        return true;
    }
}
