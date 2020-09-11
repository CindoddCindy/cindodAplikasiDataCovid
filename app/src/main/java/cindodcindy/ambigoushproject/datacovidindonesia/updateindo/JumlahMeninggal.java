
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JumlahMeninggal {

    @SerializedName("value")
    @Expose
    private long value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JumlahMeninggal() {
    }

    /**
     * 
     * @param value
     */
    public JumlahMeninggal(long value) {
        super();
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public JumlahMeninggal withValue(long value) {
        this.value = value;
        return this;
    }

}
