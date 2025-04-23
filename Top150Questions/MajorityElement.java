package Top150Questions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int maxFreq=0;
        int maxFreqEle=nums[0];

        Map <Integer,Integer> elementAndItsFreq =new HashMap<>();

        for(int num: nums){
           elementAndItsFreq.put(num,elementAndItsFreq.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : elementAndItsFreq.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                maxFreqEle=entry.getKey();
            }
        }
        return maxFreqEle;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {1,2,2,2,2,1,1}));
    }
}
