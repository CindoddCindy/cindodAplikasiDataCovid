package cindodcindy.ambigoushproject.datacovidindonesia.model;

public class SliderItem {

    private String  image_satu, image_dua, image_tiga;

    private String deskripsigbr;

    public SliderItem(String image_satu, String image_dua, String image_tiga, String deskripsigbr) {
        this.image_satu = image_satu;
        this.image_dua = image_dua;
        this.image_tiga = image_tiga;
        this.deskripsigbr = deskripsigbr;
    }

    public String getDeskripsigbr() {
        return deskripsigbr;
    }

    public void setDeskripsigbr(String deskripsigbr) {
        this.deskripsigbr = deskripsigbr;
    }

    public SliderItem(String image_satu, String image_dua, String image_tiga) {
        this.image_satu = image_satu;
        this.image_dua = image_dua;
        this.image_tiga = image_tiga;
    }

    public String getImage_satu() {
        return image_satu;
    }

    public void setImage_satu(String image_satu) {
        this.image_satu = image_satu;
    }

    public String getImage_dua() {
        return image_dua;
    }

    public void setImage_dua(String image_dua) {
        this.image_dua = image_dua;
    }

    public String getImage_tiga() {
        return image_tiga;
    }

    public void setImage_tiga(String image_tiga) {
        this.image_tiga = image_tiga;
    }
}
