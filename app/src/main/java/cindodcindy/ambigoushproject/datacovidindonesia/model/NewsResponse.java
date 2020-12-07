
package cindodcindy.ambigoushproject.datacovidindonesia.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewsResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();
    @SerializedName("length")
    @Expose
    private long length;
    @SerializedName("status")
    @Expose
    private long status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NewsResponse() {
    }

    /**
     * 
     * @param data
     * @param length
     * @param status
     */
    public NewsResponse(List<Datum> data, long length, long status) {
        super();
        this.data = data;
        this.length = length;
        this.status = status;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getStatus() {
        return status;
    }

    public void setStatus(long status) {
        this.status = status;
    }

}
