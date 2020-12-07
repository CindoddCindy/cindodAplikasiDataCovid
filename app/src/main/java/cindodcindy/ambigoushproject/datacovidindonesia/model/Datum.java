
package cindodcindy.ambigoushproject.datacovidindonesia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("judul")
    @Expose
    private String judul;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("poster")
    @Expose
    private String poster;
    @SerializedName("tipe")
    @Expose
    private String tipe;
    @SerializedName("waktu")
    @Expose
    private String waktu;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param link
     * @param waktu
     * @param judul
     * @param tipe
     * @param poster
     */
    public Datum(String judul, String link, String poster, String tipe, String waktu) {
        super();
        this.judul = judul;
        this.link = link;
        this.poster = poster;
        this.tipe = tipe;
        this.waktu = waktu;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

}
