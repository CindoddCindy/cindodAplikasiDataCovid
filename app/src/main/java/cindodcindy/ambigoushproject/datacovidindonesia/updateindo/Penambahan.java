
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Penambahan {

    @SerializedName("jumlah_positif")
    @Expose
    private long jumlahPositif;
    @SerializedName("jumlah_meninggal")
    @Expose
    private long jumlahMeninggal;
    @SerializedName("jumlah_sembuh")
    @Expose
    private long jumlahSembuh;
    @SerializedName("jumlah_dirawat")
    @Expose
    private long jumlahDirawat;
    @SerializedName("tanggal")
    @Expose
    private String tanggal;
    @SerializedName("created")
    @Expose
    private String created;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Penambahan() {
    }

    /**
     * 
     * @param jumlahMeninggal
     * @param created
     * @param jumlahDirawat
     * @param tanggal
     * @param jumlahPositif
     * @param jumlahSembuh
     */
    public Penambahan(long jumlahPositif, long jumlahMeninggal, long jumlahSembuh, long jumlahDirawat, String tanggal, String created) {
        super();
        this.jumlahPositif = jumlahPositif;
        this.jumlahMeninggal = jumlahMeninggal;
        this.jumlahSembuh = jumlahSembuh;
        this.jumlahDirawat = jumlahDirawat;
        this.tanggal = tanggal;
        this.created = created;
    }

    public long getJumlahPositif() {
        return jumlahPositif;
    }

    public void setJumlahPositif(long jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
    }

    public Penambahan withJumlahPositif(long jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
        return this;
    }

    public long getJumlahMeninggal() {
        return jumlahMeninggal;
    }

    public void setJumlahMeninggal(long jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
    }

    public Penambahan withJumlahMeninggal(long jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
        return this;
    }

    public long getJumlahSembuh() {
        return jumlahSembuh;
    }

    public void setJumlahSembuh(long jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
    }

    public Penambahan withJumlahSembuh(long jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
        return this;
    }

    public long getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(long jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public Penambahan withJumlahDirawat(long jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
        return this;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public Penambahan withTanggal(String tanggal) {
        this.tanggal = tanggal;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Penambahan withCreated(String created) {
        this.created = created;
        return this;
    }

}
