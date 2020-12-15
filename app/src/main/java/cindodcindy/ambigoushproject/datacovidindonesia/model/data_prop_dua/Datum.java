
package cindodcindy.ambigoushproject.datacovidindonesia.model.data_prop_dua;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("fid")
    @Expose
    private long fid;
    @SerializedName("kodeProvi")
    @Expose
    private long kodeProvi;
    @SerializedName("provinsi")
    @Expose
    private String provinsi;
    @SerializedName("kasusPosi")
    @Expose
    private long kasusPosi;
    @SerializedName("kasusSemb")
    @Expose
    private long kasusSemb;
    @SerializedName("kasusMeni")
    @Expose
    private long kasusMeni;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param fid
     * @param provinsi
     * @param kasusMeni
     * @param kodeProvi
     * @param kasusSemb
     * @param kasusPosi
     */
    public Datum(long fid, long kodeProvi, String provinsi, long kasusPosi, long kasusSemb, long kasusMeni) {
        super();
        this.fid = fid;
        this.kodeProvi = kodeProvi;
        this.provinsi = provinsi;
        this.kasusPosi = kasusPosi;
        this.kasusSemb = kasusSemb;
        this.kasusMeni = kasusMeni;
    }

    public long getFid() {
        return fid;
    }

    public void setFid(long fid) {
        this.fid = fid;
    }

    public long getKodeProvi() {
        return kodeProvi;
    }

    public void setKodeProvi(long kodeProvi) {
        this.kodeProvi = kodeProvi;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public long getKasusPosi() {
        return kasusPosi;
    }

    public void setKasusPosi(long kasusPosi) {
        this.kasusPosi = kasusPosi;
    }

    public long getKasusSemb() {
        return kasusSemb;
    }

    public void setKasusSemb(long kasusSemb) {
        this.kasusSemb = kasusSemb;
    }

    public long getKasusMeni() {
        return kasusMeni;
    }

    public void setKasusMeni(long kasusMeni) {
        this.kasusMeni = kasusMeni;
    }

}
