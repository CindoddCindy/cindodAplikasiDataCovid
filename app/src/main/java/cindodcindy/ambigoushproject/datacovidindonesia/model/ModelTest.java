package cindodcindy.ambigoushproject.datacovidindonesia.model;

public class ModelTest {

    public String namaPropinsi;

    public  String kasus;

    public ModelTest(String namaPropinsi, String kasus) {
        this.namaPropinsi = namaPropinsi;
        this.kasus = kasus;
    }

    public String getNamaPropinsi() {
        return namaPropinsi;
    }

    public void setNamaPropinsi(String namaPropinsi) {
        this.namaPropinsi = namaPropinsi;
    }

    public String getKasus() {
        return kasus;
    }

    public void setKasus(String kasus) {
        this.kasus = kasus;
    }
}
