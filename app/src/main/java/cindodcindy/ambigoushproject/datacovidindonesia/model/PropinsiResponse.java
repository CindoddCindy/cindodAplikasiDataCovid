
package cindodcindy.ambigoushproject.datacovidindonesia.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PropinsiResponse {

    @SerializedName("attributes")
    @Expose
    private PropinsiAtributes propinsiAtributes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PropinsiResponse() {
    }

    /**
     * 
     * @param propinsiAtributes
     */
    public PropinsiResponse(PropinsiAtributes propinsiAtributes) {
        super();
        this.propinsiAtributes = propinsiAtributes;
    }

    public PropinsiAtributes getAttributes() {
        return propinsiAtributes;
    }

    public void setAttributes(Attributes attributes) {
        this.propinsiAtributes = propinsiAtributes;
    }

}
