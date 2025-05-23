package Classes.Leetcode.Leetcode75;

class increasingTriplet {
    public boolean increasingtriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

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
}
