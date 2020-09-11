
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JumlahPositif {

    @SerializedName("value")
    @Expose
    private long value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JumlahPositif() {
    }

    /**
     * 
     * @param value
     */
    public JumlahPositif(long value) {
        super();
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public JumlahPositif withValue(long value) {
        this.value = value;
        return this;
    }

}
