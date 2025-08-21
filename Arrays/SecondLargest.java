public class SecondLargest {
    public static int getSecondLargest(int num[]){
        int largest = num[0];
        int slargest = -1;
        for(int i = 0; i < num.length; i++){
            if(num[i] > largest){
                slargest = largest;
                largest = num[i];
            }
            else if(num[i] < largest && num[i] > slargest){
                slargest = num[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int num[] = {1, 3, 7, 8, 5, 9};
        System.out.println("slargest element is : " + getSecondLargest(num));
    }
}
