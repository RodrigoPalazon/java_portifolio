package academy.devdojo.maratonajava.javacore.K_enum.domain;

public enum CustomerType {
    FISCAL_PERSON(1, "Fiscal Person"),
    LEGAL_PERSON(2, "Legal Person");
    public final int value;
    public final String reportName;

    CustomerType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public static CustomerType customerTypeByReportName(String reportName){
        for (CustomerType customerType : values()) {
            if(customerType.getReportName().equals(reportName)){
                return customerType;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getReportName() {
        return reportName;
    }
}
