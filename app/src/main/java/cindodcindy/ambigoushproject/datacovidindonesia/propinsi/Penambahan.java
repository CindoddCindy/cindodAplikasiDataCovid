
package cindodcindy.ambigoushproject.datacovidindonesia.propinsi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Penambahan {

    @SerializedName("positif")
    @Expose
    private long positif;
    @SerializedName("sembuh")
    @Expose
    private long sembuh;
    @SerializedName("meninggal")
    @Expose
    private long meninggal;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Penambahan() {
    }

    /**
     * 
     * @param meninggal
     * @param positif
     * @param sembuh
     */
    public Penambahan(long positif, long sembuh, long meninggal) {
        super();
        this.positif = positif;
        this.sembuh = sembuh;
        this.meninggal = meninggal;
    }

    public long getPositif() {
        return positif;
    }

    public void setPositif(long positif) {
        this.positif = positif;
    }

    public Penambahan withPositif(long positif) {
        this.positif = positif;
        return this;
    }

    public long getSembuh() {
        return sembuh;
    }

    public void setSembuh(long sembuh) {
        this.sembuh = sembuh;
    }

    public Penambahan withSembuh(long sembuh) {
        this.sembuh = sembuh;
        return this;
    }

    public long getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(long meninggal) {
        this.meninggal = meninggal;
    }

    public Penambahan withMeninggal(long meninggal) {
        this.meninggal = meninggal;
        return this;
    }

}
