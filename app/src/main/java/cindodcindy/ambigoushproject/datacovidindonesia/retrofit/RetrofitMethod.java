package cindodcindy.ambigoushproject.datacovidindonesia.retrofit;

import cindodcindy.ambigoushproject.datacovidindonesia.model.PropinsiResponse;
import cindodcindy.ambigoushproject.datacovidindonesia.model.data_prop_dua.DataCovidResponse;
import cindodcindy.ambigoushproject.datacovidindonesia.model.dataprop.ResponseDataPropinsiDua;
import cindodcindy.ambigoushproject.datacovidindonesia.model.modelmodel.ResponseDataPropinsi;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitMethod {
    @GET("provinsi/")
    Call<DataCovidResponse> getDataPropinsi();

}
