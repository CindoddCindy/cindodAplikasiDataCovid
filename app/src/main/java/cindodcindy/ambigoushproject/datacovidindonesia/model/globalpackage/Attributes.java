
package cindodcindy.ambigoushproject.datacovidindonesia.model.globalpackage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Attributes {

    @SerializedName("OBJECTID")
    @Expose
    private long oBJECTID;
    @SerializedName("Country_Region")
    @Expose
    private String countryRegion;
    @SerializedName("Last_Update")
    @Expose
    private long lastUpdate;
    @SerializedName("Lat")
    @Expose
    private double lat;
    @SerializedName("Long_")
    @Expose
    private double _long;
    @SerializedName("Confirmed")
    @Expose
    private long confirmed;
    @SerializedName("Deaths")
    @Expose
    private long deaths;
    @SerializedName("Recovered")
    @Expose
    private long recovered;
    @SerializedName("Active")
    @Expose
    private long active;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param recovered
     * @param _long
     * @param countryRegion
     * @param lastUpdate
     * @param active
     * @param oBJECTID
     * @param confirmed
     * @param lat
     * @param deaths
     */
    public Attributes(long oBJECTID, String countryRegion, long lastUpdate, double lat, double _long, long confirmed, long deaths, long recovered, long active) {
        super();
        this.oBJECTID = oBJECTID;
        this.countryRegion = countryRegion;
        this.lastUpdate = lastUpdate;
        this.lat = lat;
        this._long = _long;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
        this.active = active;
    }

    public long getOBJECTID() {
        return oBJECTID;
    }

    public void setOBJECTID(long oBJECTID) {
        this.oBJECTID = oBJECTID;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public long getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(long lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLong() {
        return _long;
    }

    public void setLong(double _long) {
        this._long = _long;
    }

    public long getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(long confirmed) {
        this.confirmed = confirmed;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
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


}
