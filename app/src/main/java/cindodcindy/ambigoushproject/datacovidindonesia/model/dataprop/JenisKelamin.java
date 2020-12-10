
package cindodcindy.ambigoushproject.datacovidindonesia.model.dataprop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

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

    public long getDocCount() {
        return docCount;
    }

    public void setDocCount(long docCount) {
        this.docCount = docCount;
    }
/*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("key", key).append("docCount", docCount).toString();
    }

 */

}
