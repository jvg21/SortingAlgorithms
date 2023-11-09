public class SortingClass {
    private int[] valuesArray;

    public SortingClass(int[] inputValues){
        this.valuesArray = inputValues;
    }

    public int[] bubbleSort(){
        int temp = 0;
        int[] sortedArray = this.valuesArray;
        for (int i = 0; i < sortedArray.length;i++){
            for (int j = 0; j < sortedArray.length-1; j++){
                if (sortedArray[j]>sortedArray[j+1]){
                    temp = sortedArray[j+1];
                    sortedArray[j+1] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
            System.out.println(sortedArray.toString());
        }
        return sortedArray;
    }
}
