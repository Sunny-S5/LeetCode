package Classes.Leetcode.Leetcode75;
import java.util.Arrays;

public class ProductofeleArrayExceptSelf {
    int[] productofelementArray(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        Arrays.fill(result, 1);
        System.out.println(Arrays.toString(result));

        int cumulativeProductFromLeft = 1;
        for (int i = 0; i < length; i++) {
            result[i] =result[i] * cumulativeProductFromLeft; 
            cumulativeProductFromLeft *= nums[i];
        }

        int cumulativeProductFromRight = 1;
        for (int i = length - 1; i >= 0; i--) {
            result[i] *= cumulativeProductFromRight; 
            cumulativeProductFromRight *= nums[i];  
        }

        return result;
    }
}
