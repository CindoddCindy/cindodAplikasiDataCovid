
package cindodcindy.ambigoushproject.datacovidindonesia.model.globalpackage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GlobalResponseDua {

    @SerializedName("attributes")
    @Expose
    private Attributes attributes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GlobalResponseDua() {
    }

    /**
     * 
     * @param attributes
     */
    public GlobalResponseDua(Attributes attributes) {
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
