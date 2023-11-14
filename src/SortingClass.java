public class SortingClass {
    private int[] valuesArray;

    public SortingClass(int[] inputValues){
        this.valuesArray = inputValues;
    }

    public void showArray(int[] array){
        for (int k = 0; k<array.length;k++){
            System.out.print(array[k]+",");
        }

        System.out.println("\n");
    }
    public int[] bubbleSort(){
        System.out.println("-----------------Bubble Sort--------------------");
        int temp = 0;
        int[] sortedArray = this.valuesArray;
        for (int i = 0; i < sortedArray.length;i++){
            int numTrades = 0;
            for (int j = 0; j < sortedArray.length-1; j++){
                if (sortedArray[j]>sortedArray[j+1]){
                    temp = sortedArray[j+1];
                    sortedArray[j+1] = sortedArray[j];
                    sortedArray[j] = temp;
                    numTrades++;
                    showArray(sortedArray);
                }
            }
            if (numTrades == 0){
                break;
            }


        }
        System.out.println("-------------------------------------------------------------");
        return sortedArray;
    }

    public int[] insertionSort(){
        System.out.println("-----------------Insertion Sort--------------------");
        int[] sortedArray = this.valuesArray;
        for (int i = 1; i<sortedArray.length; i++){
            insertionSort(i,sortedArray);
        }
        System.out.println("-------------------------------------------------------------");
        return sortedArray;
    }

    public int[] insertionSort(int index,int[] valuesArray){
        int temp = 0;
        for (int i = index; i > 0 ; i--){
            if (valuesArray[i]<valuesArray[i-1]){
                temp = valuesArray[i-1];
                valuesArray[i-1] = valuesArray[i];
                valuesArray[i] = temp;
            }
            showArray(valuesArray);
        }
        return valuesArray;
    }


    public int[] quickSort(){
        int[] sortedArray = this.valuesArray;
        System.out.println("-----------------Quick Sort--------------------");
        quickSort(sortedArray,0,sortedArray.length-1);
        System.out.println("-------------------------------------------------------------");

         return sortedArray;
    }
    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                showArray(array);
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        showArray(array);

        return i + 1;
    }
}
