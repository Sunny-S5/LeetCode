package Top150Questions;
import java.util.*;

public class MergeArray {
    public void merge(int[] nums1,int n,int [] nums2,int m){
      int i=m-1;
      int j=n-1;
      int k=m+n-1;
      while(i>=0 && j>=0){
        if(nums1[i]>nums2[j]){
            nums1[k--]=nums1[i--];
        }
        else{
          nums1[k--]=nums2[j--];
        }
      }
      while(j>=0){
        nums1[k--] = nums2[j--];
      }
      System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeArray obj=new MergeArray();
        obj.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6},3);
    }
}
