package bai_tap_io_text_flie;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {

    private Scanner scanner;
    private static final String FILE = "products.csv";
    private static ArrayList<Product> productArrayList = new ArrayList<>();

    public static void main(String[] args) {
        readProductsFromFile();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-----------Vui lòng chọn chức năng-----------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị tất cả sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Lưu danh sách sản phẩm và thoát");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    displayAllProduct();
                    break;
                case 3:
                    sreachProduct(scanner);
                    break;
                case 4:
                    writeProductsToFile();
                    break;
            }
        } while (choice != 4);
    }

    private static void readProductsFromFile() {
        try {
            File file = new File(FILE);
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    String[] productData = line.split(",");
                    if (productData.length == 5) {
                        try {
                            Product product = new Product(productData[0], productData[1], Double.parseDouble(productData[2]), productData[3], productData[4]);
                            productArrayList.add(product);
                        } catch (NumberFormatException e) {
                            System.out.println("Lỗi định dạng số: " + line);
                        }
                    } else {
                        System.out.println("Dữ liệu sản phẩm không đúng định dạng: " + line);
                    }
                }

                bufferedReader.close();
                System.out.println("Đã lấy dữ liệu sản phẩm từ file thành công");
            } else {
                System.out.println("Không thể tìm thấy dữ liệu sản phẩm");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeProductsToFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE));

            for (Product product : productArrayList) {
                bufferedWriter.write(product.getProductID() + "," + product.getName() + "," + product.getPrice() + "," + product.getManufacturer() + "," + product.getDescription());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void addProduct(Scanner scanner) {
        System.out.println("Nhập mã ID sản phẩm:");
        String productID = scanner.next();
        scanner.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất:");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm:");
        String description = scanner.nextLine();

        Product newProduct = new Product(productID, name, price, manufacturer, description);
        productArrayList.add(newProduct);
        System.out.println("Đã thêm sản phẩm mới thành công");
    }

    public static void displayAllProduct() {
        if (productArrayList.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm nào");
        } else {
            for (Product product : productArrayList) {
                System.out.println(product);
            }
        }
    }

    public static void sreachProduct(Scanner scanner) {
        System.out.println("Nhập mã ID sản phẩm bạn muốn tìm:");
        String productID = scanner.next();

        boolean found = false;

        for (Product product : productArrayList) {
            if (product.getProductID().equalsIgnoreCase(productID)) {
                System.out.println(product);
                found = true;
                break;
            }
        }
    }
}
