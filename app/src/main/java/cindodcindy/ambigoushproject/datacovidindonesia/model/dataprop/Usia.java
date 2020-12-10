
package cindodcindy.ambigoushproject.datacovidindonesia.model.dataprop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

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

    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).toString();
    }

     */

}
