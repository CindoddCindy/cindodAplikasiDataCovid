
package cindodcindy.ambigoushproject.datacovidindonesia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public List<Attributes> getAttributes() {
        return (List<Attributes>) attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

}
