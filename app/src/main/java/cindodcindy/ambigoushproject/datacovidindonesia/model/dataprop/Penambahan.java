
package cindodcindy.ambigoushproject.datacovidindonesia.model.dataprop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

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

    public long getSembuh() {
        return sembuh;
    }

    public void setSembuh(long sembuh) {
        this.sembuh = sembuh;
    }

    public long getMeninggal() {
        return meninggal;
    }

    public void setMeninggal(long meninggal) {
        this.meninggal = meninggal;
    }

    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("positif", positif).append("sembuh", sembuh).append("meninggal", meninggal).toString();
    }

     */

}
