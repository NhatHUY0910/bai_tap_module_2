package bai_tap_io_text_flie;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDTO {
    private String fileName;

    public ProductDTO(String fileName) {
        this.fileName = fileName;
    }

    public List<Product> readProductsFromFile() {
        List<Product> productList = new ArrayList<>();
        try {
            File file = new File(fileName);
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    String[] productData = line.split(",");
                    if (productData.length == 5) {
                        try {
                            Product product = new Product(productData[0], productData[1], Double.parseDouble(productData[2]), productData[3], productData[4]);
                            productList.add(product);
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
        return productList;
    }

    public void writeProductsToFile(List<Product> productList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

            for (Product product : productList) {
                bufferedWriter.write(product.getProductID() + "," + product.getName() + "," + product.getPrice() + "," + product.getManufacturer() + "," + product.getDescription());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
