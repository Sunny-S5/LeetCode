package Top150Questions;

public class DuplicateElementsOne {
    public static int removeDuplicatesone(int[] nums) {
        int k=1;
     for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[k-1]){
            nums[k]=nums[i];
            k++;
        }
     }
     return k;
    }
     public static void main(String[] args) {
    System.out.println(removeDuplicatesone(new int[] {1,1,1,2,2,2,2}));   
    }
}
