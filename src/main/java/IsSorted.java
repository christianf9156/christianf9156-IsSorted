public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        boolean isSorted = false;
        int lastElement = arr[arr.length - 1];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= lastElement){
                isSorted = true;
            }
            else{
                isSorted = false;
                return isSorted;
            }
        }

        return isSorted;
    }
}
