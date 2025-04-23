
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
    public static void main(String[] args) {
        MoveZeroes obj=new MoveZeroes();
        int[] nums={1,0,0,1,2};
        obj.moveZeroes(nums);

    }
}
