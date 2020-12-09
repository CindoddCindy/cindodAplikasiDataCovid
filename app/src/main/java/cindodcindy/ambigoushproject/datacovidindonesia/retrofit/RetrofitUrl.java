package cindodcindy.ambigoushproject.datacovidindonesia.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUrl {

    private static Retrofit retrofit=null;
    private RetrofitUrl(){

    }

    public static Retrofit getRetrofitHandleDataCovid() {

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

// set log level
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();

//add logging
        okHttpClient.addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;

    }

    }
