
package cindodcindy.ambigoushproject.datacovidindonesia.model.dataprop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

//import cindodcindy.ambigoushproject.datacovidindonesia.model.Usia;

public class KelompokUmur {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("doc_count")
    @Expose
    private long docCount;
    @SerializedName("usia")
    @Expose
    private Usia usia;

    /**
     * No args constructor for use in serialization
     * 
     */
    public KelompokUmur() {
    }

    /**
     * 
     * @param usia
     * @param docCount
     * @param key
     */
    public KelompokUmur(String key, long docCount, Usia usia) {
        super();
        this.key = key;
        this.docCount = docCount;
        this.usia = usia;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getDocCount() {
        return docCount;
    }

    public void setDocCount(long docCount) {
        this.docCount = docCount;
    }

    public Usia getUsia() {
        return usia;
    }

    public void setUsia(Usia usia) {
        this.usia = usia;
    }

    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("docCount", docCount).append("usia", usia).toString();
    }

     */

}
