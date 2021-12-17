package problem.solving;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int n=2; n<10000; n++){
            list = getPrimeNumbers(n);
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Total prime number so far : " + list.size());

    }
    public static List<Integer> getPrimeNumbers(int num){
        List<Integer> primeList = new ArrayList<Integer>();
        for(int j=2; j<num; j++){
            if(isPrime(j)){
                primeList.add(j);
            }
        }
        return primeList;
    }
    public static boolean isPrime(int value){
        for(int i=2; i<value; i++){
            if(value % i == 0){
               return false;
            }
        }
        return true;
    }
}
