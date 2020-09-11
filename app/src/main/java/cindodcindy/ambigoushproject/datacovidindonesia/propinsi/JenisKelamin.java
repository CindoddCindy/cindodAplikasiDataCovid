
package cindodcindy.ambigoushproject.datacovidindonesia.propinsi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JenisKelamin {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("doc_count")
    @Expose
    private long docCount;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JenisKelamin() {
    }

    /**
     * 
     * @param docCount
     * @param key
     */
    public JenisKelamin(String key, long docCount) {
        super();
        this.key = key;
        this.docCount = docCount;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public JenisKelamin withKey(String key) {
        this.key = key;
        return this;
    }

    public long getDocCount() {
        return docCount;
    }

    public void setDocCount(long docCount) {
        this.docCount = docCount;
    }

    public JenisKelamin withDocCount(long docCount) {
        this.docCount = docCount;
        return this;
    }

}
