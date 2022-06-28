import org.junit.Assert;
import org.junit.Test;

import static constants.Constants.ARRAY_1;
import static constants.Constants.ARRAY_2;
import static constants.Constants.ARRAY_3;
import static constants.Constants.BYE;
import static constants.Constants.CIVIC;
import static constants.Constants.DOMINOS;
import static constants.Constants.DURATION;
import static constants.Constants.HELLO;
import static constants.Constants.LEVEL;

public class Task1 {

    @Test
    public void findTargetTest(){
        Assert.assertEquals(1, Task.findTarget(ARRAY_1, 8));
    }

    @Test
    public void findTargetTest2(){
        Assert.assertEquals(-1, Task.findTarget(ARRAY_2, 1));
    }

    @Test
    public void findTargetTest3(){
        Assert.assertEquals(-1, Task.findTarget(ARRAY_2, 5));
    }

    @Test
    public void findTargetTest4(){
        Assert.assertEquals(1, Task.findTarget(ARRAY_2, 0));
    }

    @Test
    public void findTargetTest5(){
        Assert.assertEquals(-1, Task.findTarget(ARRAY_3, 0));
    }

    @Test
    public void findDuplicatesTest(){
        Assert.assertTrue(Task.findDuplicates(HELLO));
    }

    @Test
    public void findDuplicatesTest2(){
        Assert.assertTrue(Task.findDuplicates(DOMINOS));
    }

    @Test
    public void findDuplicatesTest3(){
        Assert.assertFalse(Task.findDuplicates(BYE));
    }

    @Test
    public void isPalindromeTest(){
        Assert.assertTrue(Task.isPalindrome(LEVEL));
    }

    @Test
    public void isPalindromeTest2(){
        Assert.assertTrue(Task.isPalindrome(CIVIC));
    }

    @Test
    public void isPalindromeTest3(){
        Assert.assertFalse(Task.isPalindrome(DURATION));
    }
}
