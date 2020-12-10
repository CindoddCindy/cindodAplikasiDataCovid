
package cindodcindy.ambigoushproject.datacovidindonesia.model.modelmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

public class Attributes {

    @SerializedName("FID")
    @Expose
    private long fID;
    @SerializedName("Kode_Provi")
    @Expose
    private long kodeProvi;
    @SerializedName("Provinsi")
    @Expose
    private String provinsi;
    @SerializedName("Kasus_Posi")
    @Expose
    private long kasusPosi;
    @SerializedName("Kasus_Semb")
    @Expose
    private long kasusSemb;
    @SerializedName("Kasus_Meni")
    @Expose
    private long kasusMeni;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param fID
     * @param provinsi
     * @param kasusMeni
     * @param kodeProvi
     * @param kasusSemb
     * @param kasusPosi
     */
    public Attributes(long fID, long kodeProvi, String provinsi, long kasusPosi, long kasusSemb, long kasusMeni) {
        super();
        this.fID = fID;
        this.kodeProvi = kodeProvi;
        this.provinsi = provinsi;
        this.kasusPosi = kasusPosi;
        this.kasusSemb = kasusSemb;
        this.kasusMeni = kasusMeni;
    }

    public long getFID() {
        return fID;
    }

    public void setFID(long fID) {
        this.fID = fID;
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

    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fID", fID).append("kodeProvi", kodeProvi).append("provinsi", provinsi).append("kasusPosi", kasusPosi).append("kasusSemb", kasusSemb).append("kasusMeni", kasusMeni).toString();
    }

     */

}
