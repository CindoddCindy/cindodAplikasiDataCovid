
package cindodcindy.ambigoushproject.datacovidindonesia.propinsi;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListDatum {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("doc_count")
    @Expose
    private double docCount;
    @SerializedName("jumlah_kasus")
    @Expose
    private long jumlahKasus;
    @SerializedName("jumlah_sembuh")
    @Expose
    private long jumlahSembuh;
    @SerializedName("jumlah_meninggal")
    @Expose
    private long jumlahMeninggal;
    @SerializedName("jumlah_dirawat")
    @Expose
    private long jumlahDirawat;
    @SerializedName("jenis_kelamin")
    @Expose
    private List<JenisKelamin> jenisKelamin = new ArrayList<JenisKelamin>();
    @SerializedName("kelompok_umur")
    @Expose
    private List<KelompokUmur> kelompokUmur = new ArrayList<KelompokUmur>();
    @SerializedName("lokasi")
    @Expose
    private Lokasi lokasi;
    @SerializedName("penambahan")
    @Expose
    private Penambahan penambahan;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListDatum() {
    }

    /**
     * 
     * @param jumlahMeninggal
     * @param penambahan
     * @param jumlahKasus
     * @param kelompokUmur
     * @param lokasi
     * @param docCount
     * @param jenisKelamin
     * @param jumlahDirawat
     * @param jumlahSembuh
     * @param key
     */
    public ListDatum(String key, double docCount, long jumlahKasus, long jumlahSembuh, long jumlahMeninggal, long jumlahDirawat, List<JenisKelamin> jenisKelamin, List<KelompokUmur> kelompokUmur, Lokasi lokasi, Penambahan penambahan) {
        super();
        this.key = key;
        this.docCount = docCount;
        this.jumlahKasus = jumlahKasus;
        this.jumlahSembuh = jumlahSembuh;
        this.jumlahMeninggal = jumlahMeninggal;
        this.jumlahDirawat = jumlahDirawat;
        this.jenisKelamin = jenisKelamin;
        this.kelompokUmur = kelompokUmur;
        this.lokasi = lokasi;
        this.penambahan = penambahan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ListDatum withKey(String key) {
        this.key = key;
        return this;
    }

    public double getDocCount() {
        return docCount;
    }

    public void setDocCount(double docCount) {
        this.docCount = docCount;
    }

    public ListDatum withDocCount(double docCount) {
        this.docCount = docCount;
        return this;
    }

    public long getJumlahKasus() {
        return jumlahKasus;
    }

    public void setJumlahKasus(long jumlahKasus) {
        this.jumlahKasus = jumlahKasus;
    }

    public ListDatum withJumlahKasus(long jumlahKasus) {
        this.jumlahKasus = jumlahKasus;
        return this;
    }

    public long getJumlahSembuh() {
        return jumlahSembuh;
    }

    public void setJumlahSembuh(long jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
    }

    public ListDatum withJumlahSembuh(long jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
        return this;
    }

    public long getJumlahMeninggal() {
        return jumlahMeninggal;
    }

    public void setJumlahMeninggal(long jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
    }

    public ListDatum withJumlahMeninggal(long jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
        return this;
    }

    public long getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(long jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public ListDatum withJumlahDirawat(long jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
        return this;
    }

    public List<JenisKelamin> getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(List<JenisKelamin> jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public ListDatum withJenisKelamin(List<JenisKelamin> jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }

    public List<KelompokUmur> getKelompokUmur() {
        return kelompokUmur;
    }

    public void setKelompokUmur(List<KelompokUmur> kelompokUmur) {
        this.kelompokUmur = kelompokUmur;
    }

    public ListDatum withKelompokUmur(List<KelompokUmur> kelompokUmur) {
        this.kelompokUmur = kelompokUmur;
        return this;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    public ListDatum withLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
        return this;
    }

    public Penambahan getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
    }

    public ListDatum withPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
        return this;
    }

}
