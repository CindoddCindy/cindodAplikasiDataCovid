
package cindodcindy.ambigoushproject.datacovidindonesia.model.globaltiga;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GlobalResponseTiga {

    @SerializedName("provinceState")
    @Expose
    private Object provinceState;
    @SerializedName("countryRegion")
    @Expose
    private String countryRegion;
    @SerializedName("lastUpdate")
    @Expose
    private long lastUpdate;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("long")
    @Expose
    private double _long;
    @SerializedName("confirmed")
    @Expose
    private long confirmed;
    @SerializedName("recovered")
    @Expose
    private long recovered;
    @SerializedName("deaths")
    @Expose
    private long deaths;
    @SerializedName("active")
    @Expose
    private long active;
    @SerializedName("admin2")
    @Expose
    private Object admin2;
    @SerializedName("fips")
    @Expose
    private Object fips;
    @SerializedName("combinedKey")
    @Expose
    private String combinedKey;
    @SerializedName("incidentRate")
    @Expose
    private double incidentRate;
    @SerializedName("peopleTested")
    @Expose
    private Object peopleTested;
    @SerializedName("peopleHospitalized")
    @Expose
    private Object peopleHospitalized;
    @SerializedName("uid")
    @Expose
    private long uid;
    @SerializedName("iso3")
    @Expose
    private String iso3;
    @SerializedName("iso2")
    @Expose
    private String iso2;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GlobalResponseTiga() {
    }

    /**
     * 
     * @param countryRegion
     * @param peopleHospitalized
     * @param active
     * @param fips
     * @param peopleTested
     * @param confirmed
     * @param provinceState
     * @param incidentRate
     * @param uid
     * @param recovered
     * @param _long
     * @param lastUpdate
     * @param admin2
     * @param combinedKey
     * @param iso2
     * @param lat
     * @param deaths
     * @param iso3
     */
    public GlobalResponseTiga(Object provinceState, String countryRegion, long lastUpdate, double lat, double _long, long confirmed, long recovered, long deaths, long active, Object admin2, Object fips, String combinedKey, double incidentRate, Object peopleTested, Object peopleHospitalized, long uid, String iso3, String iso2) {
        super();
        this.provinceState = provinceState;
        this.countryRegion = countryRegion;
        this.lastUpdate = lastUpdate;
        this.lat = lat;
        this._long = _long;
        this.confirmed = confirmed;
        this.recovered = recovered;
        this.deaths = deaths;
        this.active = active;
        this.admin2 = admin2;
        this.fips = fips;
        this.combinedKey = combinedKey;
        this.incidentRate = incidentRate;
        this.peopleTested = peopleTested;
        this.peopleHospitalized = peopleHospitalized;
        this.uid = uid;
        this.iso3 = iso3;
        this.iso2 = iso2;
    }

    public Object getProvinceState() {
        return provinceState;
    }

    public void setProvinceState(Object provinceState) {
        this.provinceState = provinceState;
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

    public long getRecovered() {
        return recovered;
    }

    public void setRecovered(long recovered) {
        this.recovered = recovered;
    }

    public long getDeaths() {
        return deaths;
    }

    public void setDeaths(long deaths) {
        this.deaths = deaths;
    }

    public long getActive() {
        return active;
    }

    public void setActive(long active) {
        this.active = active;
    }

    public Object getAdmin2() {
        return admin2;
    }

    public void setAdmin2(Object admin2) {
        this.admin2 = admin2;
    }

    public Object getFips() {
        return fips;
    }

    public void setFips(Object fips) {
        this.fips = fips;
    }

    public String getCombinedKey() {
        return combinedKey;
    }

    public void setCombinedKey(String combinedKey) {
        this.combinedKey = combinedKey;
    }

    public double getIncidentRate() {
        return incidentRate;
    }

    public void setIncidentRate(double incidentRate) {
        this.incidentRate = incidentRate;
    }

    public Object getPeopleTested() {
        return peopleTested;
    }

    public void setPeopleTested(Object peopleTested) {
        this.peopleTested = peopleTested;
    }

    public Object getPeopleHospitalized() {
        return peopleHospitalized;
    }

    public void setPeopleHospitalized(Object peopleHospitalized) {
        this.peopleHospitalized = peopleHospitalized;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

}
