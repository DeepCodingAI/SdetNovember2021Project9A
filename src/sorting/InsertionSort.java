package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {6,5,1,8,7,3,4,2};
        for(int i=0; i<array.length; i++){
            int k = array[i];
            int j = i-1;
            while(j>=0 && array[j] > k){
                array[j+1] = array[j];
                j = j-1;
            }//end of while loop
            array[j+1] = k;
        }//end of for loop

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }//end of main
}//end of class
