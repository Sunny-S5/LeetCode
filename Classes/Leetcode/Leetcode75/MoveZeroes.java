package Classes.Leetcode.Leetcode75;
import java.util.Arrays;


public class MoveZeroes {
    public void moveZeroes(int[] nums){
        int index=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            nums[index]=nums[i];
            if(index!=0){
                nums[i]=0;  
            }
            index++;
        }
        System.out.println(Arrays.toString(nums));
      }
    }
}
