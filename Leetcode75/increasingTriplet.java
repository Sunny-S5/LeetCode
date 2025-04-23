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
    public static void main(String[] args) {
        int arr[]={5,6,7,6,5};
        boolean hasTriplet=false;
        increasingTriplet obj=new increasingTriplet();
        hasTriplet=obj.increasingtriplet(arr);
        System.out.println(hasTriplet);
    }
}
