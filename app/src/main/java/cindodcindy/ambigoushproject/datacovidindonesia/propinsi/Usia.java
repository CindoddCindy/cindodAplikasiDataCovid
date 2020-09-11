
package cindodcindy.ambigoushproject.datacovidindonesia.propinsi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usia {

    @SerializedName("value")
    @Expose
    private double value;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Usia() {
    }

    /**
     * 
     * @param value
     */
    public Usia(double value) {
        super();
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Usia withValue(double value) {
        this.value = value;
        return this;
    }

}
