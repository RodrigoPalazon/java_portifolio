package academy.devdojo.maratonajava.javacore.K_enum.domain;

public enum CustomerType {
    FISCAL_PERSON(1, "Fiscal Person"),
    LEGAL_PERSON(2, "Legal Person");
    public final int VALUE;
    public final String CUSTOMER_REPORT;

    CustomerType(int value, String customerReport) {
        this.VALUE = value;
        this.CUSTOMER_REPORT = customerReport;
    }

}
