package problem.solving;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21.......n
        int prev = 0;
        int next = 1;
        for(int i=0; i<20; i++){
            System.out.println(prev);
            next = next + prev;
            prev = next - prev;
        }
    }
}
