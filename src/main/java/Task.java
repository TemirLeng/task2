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

	int temp = 0;
	for(int i=0;i<nums.length;i++){

		for(int j=i+1;j<nums.length;j++){
			temp = (nums[i]+nums[j]);
			if(temp==target){
				return 1;
		}
	}


        return -1;

    }
    public static boolean findDuplicates(String example){
        /**
         * Count duplicate chars in given string, return true if there are duplicates
         */
        return  false;
    }

    public static boolean isPalindrome(String word){
        /**
         * return true if given string is palindrome, else return false
         */
        return false;
    }


}
