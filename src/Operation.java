public class Operation {

    public OperationType operation;
    public double unitCost;
    public int quantity;

    public Operation(OperationType operation, double unitCost, int quantity) {
        this.operation = operation;
        this.unitCost = unitCost;
        this.quantity = quantity;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }


}
