package Classes.Leetcode.Top150InterviewPrograms;
import java.util.Arrays;

public class DuplicateElements {
    public static int removeDuplicates(int[] nums) {
        int k=1;
     for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[k-1]){
          nums[k]=nums[i];
          k++;
        }
     }  
     System.out.println(Arrays.toString(Arrays.copyOf(nums, k)));
     return k;
    }
}
