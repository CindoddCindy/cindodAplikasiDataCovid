
package cindodcindy.ambigoushproject.datacovidindonesia.model.modelmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.ToStringBuilder;

import cindodcindy.ambigoushproject.datacovidindonesia.model.Attributes;

public class ResponseDataPropinsi {

    @SerializedName("attributes")
    @Expose
    private cindodcindy.ambigoushproject.datacovidindonesia.model.Attributes attributes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseDataPropinsi() {
    }

    /**
     * 
     * @param attributes
     */
    public ResponseDataPropinsi(cindodcindy.ambigoushproject.datacovidindonesia.model.Attributes attributes) {
        super();
        this.attributes = attributes;
    }

    public cindodcindy.ambigoushproject.datacovidindonesia.model.Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /*
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attributes", attributes).toString();
    }

     */

}
