package so_nguyen_to;

public class First20primenumbers {
    public static void main(String[] args) {
      int number = 2;
      int count = 0;

        System.out.println("20 số nguyên tố đầu tiên là: ");
        while (count <= 20) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
                number++;
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
