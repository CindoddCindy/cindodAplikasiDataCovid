
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CovidUpdateResponse {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("update")
    @Expose
    private Update update;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CovidUpdateResponse() {
    }

    /**
     * 
     * @param data
     * @param update
     */
    public CovidUpdateResponse(Data data, Update update) {
        super();
        this.data = data;
        this.update = update;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public CovidUpdateResponse withData(Data data) {
        this.data = data;
        return this;
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public CovidUpdateResponse withUpdate(Update update) {
        this.update = update;
        return this;
    }

}
