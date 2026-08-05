package Exercises.ApplicationStructure.ProductInventory.inventory;

public class Warehouse {
    private int warehouseId;
    private String warehouseName;
    private String inventories;

    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getInventories() {
        return inventories;
    }

    public void setInventories(String inventories) {
        this.inventories = inventories;
    }
}
