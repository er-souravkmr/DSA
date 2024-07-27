import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
      int[] arr = {3,7,1,2,9,10};

       arr = sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] sort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid =  arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr , 0 , mid));
        int[] right = sort(Arrays.copyOfRange(arr , mid, arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] sec) {

        int i =0;
        int j=0;
        int k =0;

        int[] temp = new int[first.length + sec.length];

        while(i<first.length && j<sec.length){
            if(first[i]<sec[j]){
                temp[k] = first[i];
                i++;
            }else{
                temp[k] = sec[j];
                j++;
            }
            k++;
        }


        while(i<first.length){
            temp[k] = first[i];
            i++;
            k++;
        }
        while(j<sec.length){
            temp[k] = sec[j];
            j++;
            k++;
        }

        return temp;

    }


}
