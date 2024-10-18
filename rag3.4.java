public class Main {
   
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
  
        int result1 = sum(5, 10);
        System.out.println("Sum of 5 and 10: " + result1);
        
        int result2 = sum(-3, 7);
        System.out.println("Sum of -3 and 7: " + result2);
        
        int result3 = sum(0, 0);
        System.out.println("Sum of 1 and 1: " + result3);
    }
}
