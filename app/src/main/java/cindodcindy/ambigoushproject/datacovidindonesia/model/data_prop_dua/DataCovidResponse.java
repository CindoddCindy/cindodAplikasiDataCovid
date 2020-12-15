
package cindodcindy.ambigoushproject.datacovidindonesia.model.data_prop_dua;

import java.util.ArrayList;
import java.util.List;

//import com.example.Datum;
import cindodcindy.ambigoushproject.datacovidindonesia.model.data_prop_dua.Datum;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataCovidResponse {

    @SerializedName("data")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataCovidResponse() {
    }

    /**
     * 
     * @param data
     */
    public DataCovidResponse(List<Datum> data) {
        super();
        this.data = data;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

}
