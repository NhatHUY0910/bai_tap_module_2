package so_nguyen_to;

public class Primenumbersmallerthan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int inputNumber) {
        if (inputNumber <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}

