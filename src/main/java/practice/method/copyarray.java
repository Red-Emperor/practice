package practice.method;

public class copyarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] copyarr = copyOfRange(arr, 1, 5);

        for (int i = 0; i < copyarr.length; i++) {
            System.out.println(copyarr[i]);
        }
    }

    public static int[] copyOfRange(int[] arr, int start, int end){
        int[] newarr = new int[end-start];
        int index =0;
        for (int i = start; i < end; i++) {
            newarr[index] = arr[i];
            index++;
        }
        return newarr;
    }
}
