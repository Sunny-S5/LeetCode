// import java.util.Arrays;

// public class ProductofeleArrayExceptSelf {

//     int[] productofelementArray(int[] nums) {
//         int[] newArray = new int[nums.length];
        
//         int productOfAll = 1;
//         for (int i = 0; i < nums.length; i++) {
//             productOfAll *= nums[i];
//         }

//         for (int i = 0; i < nums.length; i++) {
//             newArray[i] = productOfAll / nums[i];
//         }

//         return newArray;
//     }

//     public static void main(String[] args) {
//         int[] array = { -1,1,0,-3,3 };
//         ProductofeleArrayExceptSelf obj = new ProductofeleArrayExceptSelf();
//         int[] newArray = obj.productofelementArray(array);
//         System.out.println(Arrays.toString(newArray));
//     }
// }

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

    public static void main(String[] args) {
        int[] array = { -1, 1, 0, -3, 3 };
        ProductofeleArrayExceptSelf obj = new ProductofeleArrayExceptSelf();
        int[] newArray = obj.productofelementArray(array);
        System.out.println(Arrays.toString(newArray)); // Output should be [-0, 0, 9, 0, 0]
    }
}
