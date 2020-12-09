package cindodcindy.ambigoushproject.datacovidindonesia.retrofit;

import cindodcindy.ambigoushproject.datacovidindonesia.model.PropinsiResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitMethod {
    @GET("contacts?token=")
    Call<PropinsiResponse> getListContacts();

}
