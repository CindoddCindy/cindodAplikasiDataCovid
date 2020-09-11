
package cindodcindy.ambigoushproject.datacovidindonesia.updateindo;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Update {

    @SerializedName("penambahan")
    @Expose
    private Penambahan penambahan;
    @SerializedName("harian")
    @Expose
    private List<Harian> harian = new ArrayList<Harian>();
    @SerializedName("total")
    @Expose
    private Total total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Update() {
    }

    /**
     * 
     * @param penambahan
     * @param total
     * @param harian
     */
    public Update(Penambahan penambahan, List<Harian> harian, Total total) {
        super();
        this.penambahan = penambahan;
        this.harian = harian;
        this.total = total;
    }

    public Penambahan getPenambahan() {
        return penambahan;
    }

    public void setPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
    }

    public Update withPenambahan(Penambahan penambahan) {
        this.penambahan = penambahan;
        return this;
    }

    public List<Harian> getHarian() {
        return harian;
    }

    public void setHarian(List<Harian> harian) {
        this.harian = harian;
    }

    public Update withHarian(List<Harian> harian) {
        this.harian = harian;
        return this;
    }

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Update withTotal(Total total) {
        this.total = total;
        return this;
    }

}
