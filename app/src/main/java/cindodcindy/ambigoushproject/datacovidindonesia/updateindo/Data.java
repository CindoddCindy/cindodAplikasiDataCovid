
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("jumlah_odp")
    @Expose
    private long jumlahOdp;
    @SerializedName("jumlah_pdp")
    @Expose
    private long jumlahPdp;
    @SerializedName("total_spesimen")
    @Expose
    private long totalSpesimen;
    @SerializedName("total_spesimen_negatif")
    @Expose
    private long totalSpesimenNegatif;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param jumlahPdp
     * @param jumlahOdp
     * @param totalSpesimen
     * @param totalSpesimenNegatif
     * @param id
     */
    public Data(long id, long jumlahOdp, long jumlahPdp, long totalSpesimen, long totalSpesimenNegatif) {
        super();
        this.id = id;
        this.jumlahOdp = jumlahOdp;
        this.jumlahPdp = jumlahPdp;
        this.totalSpesimen = totalSpesimen;
        this.totalSpesimenNegatif = totalSpesimenNegatif;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Data withId(long id) {
        this.id = id;
        return this;
    }

    public long getJumlahOdp() {
        return jumlahOdp;
    }

    public void setJumlahOdp(long jumlahOdp) {
        this.jumlahOdp = jumlahOdp;
    }

    public Data withJumlahOdp(long jumlahOdp) {
        this.jumlahOdp = jumlahOdp;
        return this;
    }

    public long getJumlahPdp() {
        return jumlahPdp;
    }

    public void setJumlahPdp(long jumlahPdp) {
        this.jumlahPdp = jumlahPdp;
    }

    public Data withJumlahPdp(long jumlahPdp) {
        this.jumlahPdp = jumlahPdp;
        return this;
    }

    public long getTotalSpesimen() {
        return totalSpesimen;
    }

    public void setTotalSpesimen(long totalSpesimen) {
        this.totalSpesimen = totalSpesimen;
    }

    public Data withTotalSpesimen(long totalSpesimen) {
        this.totalSpesimen = totalSpesimen;
        return this;
    }

    public long getTotalSpesimenNegatif() {
        return totalSpesimenNegatif;
    }

    public void setTotalSpesimenNegatif(long totalSpesimenNegatif) {
        this.totalSpesimenNegatif = totalSpesimenNegatif;
    }

    public Data withTotalSpesimenNegatif(long totalSpesimenNegatif) {
        this.totalSpesimenNegatif = totalSpesimenNegatif;
        return this;
    }

}
