package Day_4;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {70,60,20,30,10,50,40,80};
        int first = arr[0], second = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] < first && arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println("Second Largest : "+second);
    }
}
