
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JumlahDirawatKum {

    @SerializedName("value")
    @Expose
    private long value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JumlahDirawatKum() {
    }

    /**
     * 
     * @param value
     */
    public JumlahDirawatKum(long value) {
        super();
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public JumlahDirawatKum withValue(long value) {
        this.value = value;
        return this;
    }

}
