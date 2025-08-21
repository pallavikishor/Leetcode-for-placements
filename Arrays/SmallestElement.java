public class SmallestElement {
    public static int getSmallest(int nums[]){
        int smallest = Integer.MAX_VALUE; // + INFINITY

        for(int i = 0; i < nums.length; i++){
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int nums[] = {7, 3, 5, 8, 1, 0};
        System.out.println("Smallest number is : " + getSmallest(nums));
    }
}
