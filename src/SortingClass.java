public class SortingClass {
    private int[] valuesArray;

    public SortingClass(int[] inputValues){
        this.valuesArray = inputValues;
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
                }
            }
            if (numTrades == 0){
                break;
            }
            for (int k = 0; k<sortedArray.length;k++){
                System.out.print(sortedArray[k]+",");
            }

            System.out.println("\n");
        }
        System.out.println("-------------------------------------------------------------");
        return sortedArray;
    }

    public int[] insertionSort(){
        int count = 1;
        int[] sortedArray 
        while (count<)
        return sortedArray;
    }
//    public int[] quickSort(){
//
//    }
}
