public class Fork {
    volatile private boolean onTable;

    public Fork() {
        onTable = true;
    }

    public boolean isOnTable() {
        return onTable;
    }

    public void setOnTable(boolean onTable) {
        this.onTable = onTable;
    }
}
