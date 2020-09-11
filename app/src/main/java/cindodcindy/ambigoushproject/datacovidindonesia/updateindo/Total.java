
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Total {

    @SerializedName("jumlah_positif")
    @Expose
    private long jumlahPositif;
    @SerializedName("jumlah_dirawat")
    @Expose
    private long jumlahDirawat;
    @SerializedName("jumlah_sembuh")
    @Expose
    private long jumlahSembuh;
    @SerializedName("jumlah_meninggal")
    @Expose
    private long jumlahMeninggal;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Total() {
    }

    /**
     * 
     * @param jumlahMeninggal
     * @param jumlahDirawat
     * @param jumlahPositif
     * @param jumlahSembuh
     */
    public Total(long jumlahPositif, long jumlahDirawat, long jumlahSembuh, long jumlahMeninggal) {
        super();
        this.jumlahPositif = jumlahPositif;
        this.jumlahDirawat = jumlahDirawat;
        this.jumlahSembuh = jumlahSembuh;
        this.jumlahMeninggal = jumlahMeninggal;
    }

    public long getJumlahPositif() {
        return jumlahPositif;
    }

    public void setJumlahPositif(long jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
    }

    public Total withJumlahPositif(long jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
        return this;
    }

    public long getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(long jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public Total withJumlahDirawat(long jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
        return this;
    }

    public long getJumlahSembuh() {
        return jumlahSembuh;
    }

    public void setJumlahSembuh(long jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
    }

    public Total withJumlahSembuh(long jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
        return this;
    }

    public long getJumlahMeninggal() {
        return jumlahMeninggal;
    }

    public void setJumlahMeninggal(long jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
    }

    public Total withJumlahMeninggal(long jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
        return this;
    }

}
