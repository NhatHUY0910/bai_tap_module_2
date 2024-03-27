package minitest_material;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Tạo mới 5 đối tượng CrispyFlour và Meat
        MaterialManager materialManager = new MaterialManager();

        for (int i = 1; i <= 5; i++) {
            LocalDate manufacturingDate = LocalDate.now();

            CrispyFlour crispyFlour = new CrispyFlour("CF" + i, "Loại bột thứ " + i, manufacturingDate, 10 + i, i);

            Meat meat = new Meat("M" + i, "Loại thịt thứ " + i + " ", manufacturingDate, 30 + i, i);

            materialManager.addMaterial(crispyFlour);
            materialManager.addMaterial(meat);

            // In ra 5 loại bột và 5 loại thịt
            System.out.println(crispyFlour.getName() + ", " + "Mã id: " + crispyFlour.getId() + ", " + "Ngày sản xuất: " + meat.getManufacturingDate() + ", " + "Giá: " + crispyFlour.getCost() + ", " + "Số lượng: " + crispyFlour.getQuantity());

            System.out.println(meat.getName() + ", " + "Mã id: " + meat.getId() + ", " + "Ngày sản xuất: " +  meat.getManufacturingDate() + ", " + "Giá: " + meat.getCost() + ", " + "Khối lương: " + meat.getWeight() + "kg");

            System.out.println();
        }

        // Tính tổng tiền 10 nguyên vật liệu
        double totalCost = 0.0;

        List<Material> materials = materialManager.getMaterials();

        for (Material material : materials) {
            if (material instanceof CrispyFlour) {
                totalCost += material.getCost() * ((CrispyFlour) material).getQuantity();
            } else if (material instanceof Meat) {
                totalCost += material.getCost() * ((Meat) material).getWeight();
            }
        }
        System.out.println("Tổng tiền của 10 nguyên vật liệu là: " + totalCost);
        System.out.println();

        // Sắp xếp nguyên vật liệu theo giá
        System.out.println("Các nguyên vật liệu sau khi được sắp xếp theo giá:");
        materialManager.getMaterials().sort(Comparator.comparingDouble(Material::getCost));

        for (Material material : materials) {
            System.out.println(material.toString());
        }
        System.out.println();

        // Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay
        double discountAmount = 0;
        double realMoneyAmount = 0;

        for (Material material : materialManager.getMaterials()) {
            discountAmount += material.getAmount();
            realMoneyAmount += material.getRealMoney();
        }
        double discountDifference = discountAmount - realMoneyAmount;
        System.out.println("Số chệnh lệnh giữa chiết khấu và không chiết khấu là: " + discountDifference);

        //Tìm kiếm thịt theo giá được nhập:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá thịt cần tìm:");
        int inputPrice = scanner.nextInt();
        scanner.nextLine();

        int searchPrice = materialManager.searchMeatByPrice(materials, inputPrice);
        if (searchPrice != -1) {
            Meat foundMeat = (Meat) materials.get(inputPrice);
            System.out.println(foundMeat);
        } else {
            System.out.println("Không tìm thấy loại thịt có giá " + inputPrice);
        }
        System.out.println();

        // Tìm kiếm bột theo tên được nhập:
        System.out.println("Nhập tên loại bột:");
        String inputName = scanner.nextLine();

        int searchName = materialManager.searchCrispyFlourByName(materials, inputName);
        if (searchName != -1) {
            CrispyFlour foundCrispyFlour = (CrispyFlour) materials.get(searchName);
            System.out.println(foundCrispyFlour);
        } else {
            System.out.println("Không tìm thấy bột có tên " + inputName);
        }
    }
}
