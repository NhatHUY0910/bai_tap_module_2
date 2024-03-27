package bai_tap_io_text_flie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    private static List<Product> productArrayList = new ArrayList<>();

    public static void main(String[] args) {
        ProductDTO productDTO = new ProductDTO("product.csv");
        productArrayList = productDTO.readProductsFromFile();

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
                    productDTO.writeProductsToFile(productArrayList);
                    break;
            }
        } while (choice != 4);
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
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có mã ID: " + productID);
        }
    }
}
