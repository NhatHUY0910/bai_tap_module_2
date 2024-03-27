import java.util.Scanner;

public class Shapecreated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("nhập số 1 để in hình chữ nhật");
            System.out.println("nhập số 2 để in hình tam giác vuông");
            System.out.println("nhập số 3 để in hình tam giác cân");
            System.out.println("nhập số 4 để thoát");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createdRectangle();
                    break;
                case 2:
                    createdSquareTriangle();
                    break;
                case 3:
                    createdIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Hãy thử lại");
                    break;
            }
        } while (choice != 4);
            scanner.close();
    }

    public static void createdRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void createdSquareTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void createdIsoscelesTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5 - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" 2 ");
            }
            System.out.println();
        }
    }
}
