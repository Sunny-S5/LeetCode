package Classes.Leetcode.Top150InterviewPrograms;
import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
         int[] newarr=new int[len];

        for(int i=0;i<k;i++){
            newarr[i]=nums[len-k+i];
        }
        int j=0;

        for (int i = k; i < len; i++) {
            newarr[i]=nums[j];
            j++;
        }
        
        int l=0;
        for (int i = 0; i < newarr.length; i++) {
            nums[i]=newarr[l++];
        }
        System.out.println(Arrays.toString(newarr));
        System.out.println(Arrays.toString(nums));
    }
}
