package Classes.Leetcode.Top150InterviewPrograms;

public class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int [] merge=new int[nums1.length+nums2.length];
        while(i<=m){
          if(nums1[i]<=nums1[i+1]){
           i++;
           merge[i]=nums1[i];
          }
        }
        int j=0;
        while(j<=n){
            if(nums1[j]<=nums1[j+1]){
             j++;
            }
        }

    }
}
