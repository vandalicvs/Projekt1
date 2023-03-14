public class CountryInfo {
    private String countryCode;
    private String countryName;
    private Double vat;
    private Double vatLow;
    private boolean specVat;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getVatLow() {
        return vatLow;
    }

    public void setVatLow(Double vatLow) {
        this.vatLow = vatLow;
    }

    public boolean isSpecVat() {
        return specVat;
    }

    public void setSpecVat(boolean specVat) {
        this.specVat = specVat;
    }

    public CountryInfo(String countryCode, String countryName, Double vat, Double vatLow, boolean specVat) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.vat = vat;
        this.vatLow = vatLow;
        this.specVat = specVat;
    }
}
