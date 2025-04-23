public class IncreasingTripletSequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second =  Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        IncreasingTripletSequence obj = new IncreasingTripletSequence();
        boolean isTriplet = obj.increasingTriplet(arr);  
        System.out.println("Is there an increasing triplet sequence? " + isTriplet); 
    }
}
