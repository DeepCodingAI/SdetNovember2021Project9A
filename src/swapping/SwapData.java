package swapping;

public class SwapData {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("After Swapping numbers");
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
