package Classes.Leetcode.Top150InterviewPrograms;

import java.util.Arrays;

public class Hindex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        reverse(citations);
        System.out.println(Arrays.toString(citations));
        for (int i = 0; i < citations.length; i++) {
            if(citations[i]<i+1){
                return i;
            }
        }
        return citations.length;
    }
    public void reverse(int[] citations){
        for (int idx =0 ; idx<citations.length/2; idx++) {
            int temp=citations[idx];
            citations[idx]=citations[citations.length-idx-1];
            citations[citations.length-idx-1]=temp;
        }
    }
}
