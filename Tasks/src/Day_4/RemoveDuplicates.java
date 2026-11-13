package Day_4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {23,45,67,2,3,4,5,5,5,6,7,8,8};

        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;
        for(int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                temp[k++] = arr[i];
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

