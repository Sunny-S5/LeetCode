package Classes.Leetcode.Top150InterviewPrograms;

public class CanJump2 {
    public int jump(int[] nums) {
        int currentEnd=0;
        int farthest=0;
        int jumps=0;
        for (int i = 0; i < nums.length; i++) {
           farthest=Math.max(farthest, i+nums[i]);
           if(i==currentEnd){
            currentEnd=farthest;
            jumps++;
           }
           if(currentEnd>=nums.length-1){
            break;
           }
        }
        return jumps;
    }
}
