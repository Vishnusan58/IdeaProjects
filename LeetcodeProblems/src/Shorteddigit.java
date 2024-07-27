public class Shorteddigit {
    public static int main(String[] args) {
        int[] nums ={ -4,-2,1,4,8};
    


        int closest = nums[0]; // Initialize with the first element

        for (int i = 1; i < nums.length; i++) {
            int absValue = Math.abs(nums[i]);
            int closestAbs = Math.abs(closest);

            if (absValue < closestAbs || (absValue == closestAbs && nums[i] > 0)) {
                closest = nums[i];
            }
        }

        return closest;
    }
}



