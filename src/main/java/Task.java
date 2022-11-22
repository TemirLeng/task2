public class Task {


    public static int findTarget(int[] nums, int target){
        /**
         * return 1 if sum of 2 elements in given array equals to target, else -1
         * e.g:
         * nums = {1, 5, 7, 9}
         * target = 10
         * should return 1, as 1 + 9 = 10
         *
         * target = 20
         * should return -1, as there is no 2 elements sum of which equal to target
         *
         */

        return -1;

    }
    public static boolean findDuplicates(String example){
        /**
         * Count duplicate chars in given string, return true if there are duplicates
         */
        char[] ch1=example.toCharArray();
        int[] freq=new int[ch1.length];
        for(int i=0;i<ch1.length;i++) {
            freq[i]=1;
            for (int j=1+i;j<ch1.length;j++) {
                if (ch1[i]==ch1[j] && ch1[j]!=' ') {
                    freq[i]++;
                    ch1[j]=' ';
                }

            }

        }
        for (int p=0;p<freq.length;p++) {
            if (freq[p]>1) {
                return true;
            }
        } return  false;



    }

    public static boolean isPalindrome(String word){
        /**
         * return true if given string is palindrome, else return false
         */
        String rev="";

        for (int i=word.length()-1;i>=0;i--) {
            rev=rev+word.charAt(i);

        }

        if (word.equalsIgnoreCase(rev)) {
            return true;
        }
        return false;
    }


}
