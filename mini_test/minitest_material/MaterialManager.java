package minitest_material;

import java.util.ArrayList;
import java.util.List;

public class MaterialManager {
    private List<Material> materials;

    public MaterialManager() {
        this.materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void editMaterial(int index, Material material) {
        if (index >= 0 && index < materials.size()) {
            materials.set(index, material);
        }
    }

    public void removeMaterial(int index) {
        if (index >= 0 && index < materials.size()) {
            materials.remove(index);
        }
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public int searchMeatByPrice(List<Material> meats, int searchPrice) {
        int low = 0;
        int high = meats.size() -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (meats.get(mid).getAmount() == searchPrice) {
                return mid;
            } else if (meats.get(mid).getAmount() < searchPrice) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
            return -1;
    }

    public int searchCrispyFlourByName(List<Material> crispyFlours, String searchName) {
        int low = 0;
        int high = crispyFlours.size() -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (crispyFlours.get(mid).getName().equalsIgnoreCase(searchName)) {
                return mid;
            } else if (crispyFlours.get(mid).getName().compareToIgnoreCase(searchName) < 0) {
                {
                low = mid + 1;
                }
            } else {
                high = mid -1;
            }
        }
            return -1;
    }
}
