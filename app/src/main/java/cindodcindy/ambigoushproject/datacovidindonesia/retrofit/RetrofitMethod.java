package cindodcindy.ambigoushproject.datacovidindonesia.retrofit;

import cindodcindy.ambigoushproject.datacovidindonesia.model.PropinsiResponse;
import cindodcindy.ambigoushproject.datacovidindonesia.model.modelmodel.ResponseDataPropinsi;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitMethod {
    @GET("provinsi")
    Call<ResponseDataPropinsi> getDataPropinsi();

}
