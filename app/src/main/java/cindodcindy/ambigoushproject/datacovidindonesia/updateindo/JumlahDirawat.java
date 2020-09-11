
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JumlahDirawat {

    @SerializedName("value")
    @Expose
    private long value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JumlahDirawat() {
    }

    /**
     * 
     * @param value
     */
    public JumlahDirawat(long value) {
        super();
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public JumlahDirawat withValue(long value) {
        this.value = value;
        return this;
    }

}
