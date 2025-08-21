class LargestElement{
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; //-INFINITY

        for(int i = 0; i < num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] arg){
        int num[] = {2, 3, 8, 1, 9};
        System.out.println("largest number is : " + getLargest(num));
    }
}