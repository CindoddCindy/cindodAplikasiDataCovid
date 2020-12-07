
package cindodcindy.ambigoushproject.datacovidindonesia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GlobalResponse {

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GlobalResponse() {
    }

    /**
     * 
     * @param attributes
     */
    public GlobalResponse(Attributes attributes) {
        super();
        this.attributes = attributes;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

}
