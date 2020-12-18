
package cindodcindy.ambigoushproject.datacovidindonesia.model.globalempat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GlobalResponseEmpat {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("cases")
    @Expose
    private long cases;
    @SerializedName("todayCases")
    @Expose
    private long todayCases;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("todayDeaths")
    @Expose
    private long todayDeaths;
    @SerializedName("recovered")
    @Expose
    private long recovered;
    @SerializedName("active")
    @Expose
    private long active;
    @SerializedName("critical")
    @Expose
    private long critical;
    @SerializedName("casesPerOneMillion")
    @Expose
    private long casesPerOneMillion;
    @SerializedName("deathsPerOneMillion")
    @Expose
    private long deathsPerOneMillion;
    @SerializedName("totalTests")
    @Expose
    private long totalTests;
    @SerializedName("testsPerOneMillion")
    @Expose
    private long testsPerOneMillion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GlobalResponseEmpat() {
    }

    /**
     * 
     * @param country
     * @param recovered
     * @param cases
     * @param critical
     * @param deathsPerOneMillion
     * @param active
     * @param casesPerOneMillion
     * @param deaths
     * @param testsPerOneMillion
     * @param todayCases
     * @param todayDeaths
     * @param totalTests
     */
    public GlobalResponseEmpat(String country, long cases, long todayCases, long deaths, long todayDeaths, long recovered, long active, long critical, long casesPerOneMillion, long deathsPerOneMillion, long totalTests, long testsPerOneMillion) {
        super();
        this.country = country;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todayDeaths = todayDeaths;
        this.recovered = recovered;
        this.active = active;
        this.critical = critical;
        this.casesPerOneMillion = casesPerOneMillion;
        this.deathsPerOneMillion = deathsPerOneMillion;
        this.totalTests = totalTests;
        this.testsPerOneMillion = testsPerOneMillion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getCases() {
        return cases;
    }

    public void setCases(long cases) {
        this.cases = cases;
    }

    public long getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(long todayCases) {
        this.todayCases = todayCases;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(long todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public long getActive() {
        return active;
    }

    public void setActive(long active) {
        this.active = active;
    }

    public long getCritical() {
        return critical;
    }

    public void setCritical(long critical) {
        this.critical = critical;
    }

    public long getCasesPerOneMillion() {
        return casesPerOneMillion;
    }

    public void setCasesPerOneMillion(long casesPerOneMillion) {
        this.casesPerOneMillion = casesPerOneMillion;
    }

    public long getDeathsPerOneMillion() {
        return deathsPerOneMillion;
    }

    public void setDeathsPerOneMillion(long deathsPerOneMillion) {
        this.deathsPerOneMillion = deathsPerOneMillion;
    }

    public long getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(long totalTests) {
        this.totalTests = totalTests;
    }

    public long getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(long testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

}
