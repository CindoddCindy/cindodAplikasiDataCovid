
package cindodcindy.ambigoushproject.datacovidindonesia.propinsi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Lokasi {

    @SerializedName("lon")
    @Expose
    private double lon;
    @SerializedName("lat")
    @Expose
    private double lat;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lokasi() {
    }

    /**
     * 
     * @param lon
     * @param lat
     */
    public Lokasi(double lon, double lat) {
        super();
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public Lokasi withLon(double lon) {
        this.lon = lon;
        return this;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Lokasi withLat(double lat) {
        this.lat = lat;
        return this;
    }

}
