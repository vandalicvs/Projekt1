import java.time.LocalDate;

public class CountryInfo {
    private String countryCode;
    private String countryName;
    private double vat;
    private double vatLow;
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

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getVatLow() {
        return vatLow;
    }

    public void setVatLow(double vatLow) {
        this.vatLow = vatLow;
    }

    public boolean isSpecVat() {
        return specVat;
    }

    public void setSpecVat(boolean specVat) {
        this.specVat = specVat;
    }

    public CountryInfo(String countryCode, String countryName, double vat, double vatLow, boolean specVat) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.vat = vat;
        this.vatLow = vatLow;
        this.specVat = specVat;
    }

    public static CountryInfo parseCountryInfo(String data) {
        String[] items = data.split("\t");
        String countryCode = items[0];
        String countryName = items[1];
        String vatRep = (items[2]).replace(",",".");
        double vat = Double.parseDouble(vatRep);
        double vatLow = Double.parseDouble(items[3]);
        boolean specVat = Boolean.parseBoolean(items[4]);
        CountryInfo result = null;
        result = new CountryInfo(countryCode, countryName, vat, vatLow, specVat);
        return result;
    }
}