package Top150Questions;

public class CanJump {
    public boolean canJump(int[] nums) {
        int maxReach=0;
       for(int i=0;i<nums.length;i++){
        if(i>maxReach){
            return false;
        }
        maxReach=Math.max(maxReach, i+nums[i]);
       }
       return true;
    }

    public static void main(String[] args) {
        CanJump obj = new CanJump();
        System.out.println(obj.canJump(new int[] {}));
    }
}
