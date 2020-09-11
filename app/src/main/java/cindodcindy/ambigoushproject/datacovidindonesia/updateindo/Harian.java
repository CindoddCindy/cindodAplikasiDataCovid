
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Harian {

    @SerializedName("key_as_string")
    @Expose
    private String keyAsString;
    @SerializedName("key")
    @Expose
    private long key;
    @SerializedName("doc_count")
    @Expose
    private long docCount;
    @SerializedName("jumlah_meninggal")
    @Expose
    private JumlahMeninggal jumlahMeninggal;
    @SerializedName("jumlah_sembuh")
    @Expose
    private JumlahSembuh jumlahSembuh;
    @SerializedName("jumlah_positif")
    @Expose
    private JumlahPositif jumlahPositif;
    @SerializedName("jumlah_dirawat")
    @Expose
    private JumlahDirawat jumlahDirawat;
    @SerializedName("jumlah_positif_kum")
    @Expose
    private JumlahPositifKum jumlahPositifKum;
    @SerializedName("jumlah_sembuh_kum")
    @Expose
    private JumlahSembuhKum jumlahSembuhKum;
    @SerializedName("jumlah_meninggal_kum")
    @Expose
    private JumlahMeninggalKum jumlahMeninggalKum;
    @SerializedName("jumlah_dirawat_kum")
    @Expose
    private JumlahDirawatKum jumlahDirawatKum;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Harian() {
    }

    /**
     * 
     * @param jumlahMeninggal
     * @param jumlahDirawatKum
     * @param jumlahPositifKum
     * @param jumlahSembuhKum
     * @param docCount
     * @param jumlahDirawat
     * @param jumlahPositif
     * @param jumlahSembuh
     * @param jumlahMeninggalKum
     * @param keyAsString
     * @param key
     */
    public Harian(String keyAsString, long key, long docCount, JumlahMeninggal jumlahMeninggal, JumlahSembuh jumlahSembuh, JumlahPositif jumlahPositif, JumlahDirawat jumlahDirawat, JumlahPositifKum jumlahPositifKum, JumlahSembuhKum jumlahSembuhKum, JumlahMeninggalKum jumlahMeninggalKum, JumlahDirawatKum jumlahDirawatKum) {
        super();
        this.keyAsString = keyAsString;
        this.key = key;
        this.docCount = docCount;
        this.jumlahMeninggal = jumlahMeninggal;
        this.jumlahSembuh = jumlahSembuh;
        this.jumlahPositif = jumlahPositif;
        this.jumlahDirawat = jumlahDirawat;
        this.jumlahPositifKum = jumlahPositifKum;
        this.jumlahSembuhKum = jumlahSembuhKum;
        this.jumlahMeninggalKum = jumlahMeninggalKum;
        this.jumlahDirawatKum = jumlahDirawatKum;
    }

    public String getKeyAsString() {
        return keyAsString;
    }

    public void setKeyAsString(String keyAsString) {
        this.keyAsString = keyAsString;
    }

    public Harian withKeyAsString(String keyAsString) {
        this.keyAsString = keyAsString;
        return this;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public Harian withKey(long key) {
        this.key = key;
        return this;
    }

    public long getDocCount() {
        return docCount;
    }

    public void setDocCount(long docCount) {
        this.docCount = docCount;
    }

    public Harian withDocCount(long docCount) {
        this.docCount = docCount;
        return this;
    }

    public JumlahMeninggal getJumlahMeninggal() {
        return jumlahMeninggal;
    }

    public void setJumlahMeninggal(JumlahMeninggal jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
    }

    public Harian withJumlahMeninggal(JumlahMeninggal jumlahMeninggal) {
        this.jumlahMeninggal = jumlahMeninggal;
        return this;
    }

    public JumlahSembuh getJumlahSembuh() {
        return jumlahSembuh;
    }

    public void setJumlahSembuh(JumlahSembuh jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
    }

    public Harian withJumlahSembuh(JumlahSembuh jumlahSembuh) {
        this.jumlahSembuh = jumlahSembuh;
        return this;
    }

    public JumlahPositif getJumlahPositif() {
        return jumlahPositif;
    }

    public void setJumlahPositif(JumlahPositif jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
    }

    public Harian withJumlahPositif(JumlahPositif jumlahPositif) {
        this.jumlahPositif = jumlahPositif;
        return this;
    }

    public JumlahDirawat getJumlahDirawat() {
        return jumlahDirawat;
    }

    public void setJumlahDirawat(JumlahDirawat jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
    }

    public Harian withJumlahDirawat(JumlahDirawat jumlahDirawat) {
        this.jumlahDirawat = jumlahDirawat;
        return this;
    }

    public JumlahPositifKum getJumlahPositifKum() {
        return jumlahPositifKum;
    }

    public void setJumlahPositifKum(JumlahPositifKum jumlahPositifKum) {
        this.jumlahPositifKum = jumlahPositifKum;
    }

    public Harian withJumlahPositifKum(JumlahPositifKum jumlahPositifKum) {
        this.jumlahPositifKum = jumlahPositifKum;
        return this;
    }

    public JumlahSembuhKum getJumlahSembuhKum() {
        return jumlahSembuhKum;
    }

    public void setJumlahSembuhKum(JumlahSembuhKum jumlahSembuhKum) {
        this.jumlahSembuhKum = jumlahSembuhKum;
    }

    public Harian withJumlahSembuhKum(JumlahSembuhKum jumlahSembuhKum) {
        this.jumlahSembuhKum = jumlahSembuhKum;
        return this;
    }

    public JumlahMeninggalKum getJumlahMeninggalKum() {
        return jumlahMeninggalKum;
    }

    public void setJumlahMeninggalKum(JumlahMeninggalKum jumlahMeninggalKum) {
        this.jumlahMeninggalKum = jumlahMeninggalKum;
    }

    public Harian withJumlahMeninggalKum(JumlahMeninggalKum jumlahMeninggalKum) {
        this.jumlahMeninggalKum = jumlahMeninggalKum;
        return this;
    }

    public JumlahDirawatKum getJumlahDirawatKum() {
        return jumlahDirawatKum;
    }

    public void setJumlahDirawatKum(JumlahDirawatKum jumlahDirawatKum) {
        this.jumlahDirawatKum = jumlahDirawatKum;
    }

    public Harian withJumlahDirawatKum(JumlahDirawatKum jumlahDirawatKum) {
        this.jumlahDirawatKum = jumlahDirawatKum;
        return this;
    }

}
