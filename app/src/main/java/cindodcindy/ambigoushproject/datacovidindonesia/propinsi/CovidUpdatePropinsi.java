
package cindodcindy.ambigoushproject.datacovidindonesia.propinsi;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CovidUpdatePropinsi {

    @SerializedName("last_date")
    @Expose
    private String lastDate;
    @SerializedName("current_data")
    @Expose
    private double currentData;
    @SerializedName("missing_data")
    @Expose
    private double missingData;
    @SerializedName("tanpa_provinsi")
    @Expose
    private long tanpaProvinsi;
    @SerializedName("list_data")
    @Expose
    private List<ListDatum> listData = new ArrayList<ListDatum>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CovidUpdatePropinsi() {
    }

    /**
     * 
     * @param missingData
     * @param listData
     * @param tanpaProvinsi
     * @param currentData
     * @param lastDate
     */
    public CovidUpdatePropinsi(String lastDate, double currentData, double missingData, long tanpaProvinsi, List<ListDatum> listData) {
        super();
        this.lastDate = lastDate;
        this.currentData = currentData;
        this.missingData = missingData;
        this.tanpaProvinsi = tanpaProvinsi;
        this.listData = listData;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public CovidUpdatePropinsi withLastDate(String lastDate) {
        this.lastDate = lastDate;
        return this;
    }

    public double getCurrentData() {
        return currentData;
    }

    public void setCurrentData(double currentData) {
        this.currentData = currentData;
    }

    public CovidUpdatePropinsi withCurrentData(double currentData) {
        this.currentData = currentData;
        return this;
    }

    public double getMissingData() {
        return missingData;
    }

    public void setMissingData(double missingData) {
        this.missingData = missingData;
    }

    public CovidUpdatePropinsi withMissingData(double missingData) {
        this.missingData = missingData;
        return this;
    }

    public long getTanpaProvinsi() {
        return tanpaProvinsi;
    }

    public void setTanpaProvinsi(long tanpaProvinsi) {
        this.tanpaProvinsi = tanpaProvinsi;
    }

    public CovidUpdatePropinsi withTanpaProvinsi(long tanpaProvinsi) {
        this.tanpaProvinsi = tanpaProvinsi;
        return this;
    }

    public List<ListDatum> getListData() {
        return listData;
    }

    public void setListData(List<ListDatum> listData) {
        this.listData = listData;
    }

    public CovidUpdatePropinsi withListData(List<ListDatum> listData) {
        this.listData = listData;
        return this;
    }

}
