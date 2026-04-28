package OOPS.Enums;

public enum PaymentMethod {
    CREDIT_CARD("Credit Card", 2.5),
    DEBIT_CARD("Debit Card", 1.0),
    UPI("UPI", 0.0),
    NET_BANKING("Net Banking", 1.5);

    private final String displayName;
    private final double feePercent;

    PaymentMethod(String displayName, double feePercent) {
        this.displayName = displayName;
        this.feePercent = feePercent;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getFeePercent() {
        return feePercent;
    }
}
