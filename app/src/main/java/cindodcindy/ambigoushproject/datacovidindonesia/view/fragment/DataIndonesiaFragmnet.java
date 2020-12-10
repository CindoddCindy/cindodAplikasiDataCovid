package cindodcindy.ambigoushproject.datacovidindonesia.view.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cindodcindy.ambigoushproject.datacovidindonesia.R;
import cindodcindy.ambigoushproject.datacovidindonesia.model.ModelTest;
import cindodcindy.ambigoushproject.datacovidindonesia.model.PropinsiAtributes;
import cindodcindy.ambigoushproject.datacovidindonesia.model.PropinsiResponse;
import cindodcindy.ambigoushproject.datacovidindonesia.model.dataprop.ListDatum;
import cindodcindy.ambigoushproject.datacovidindonesia.model.dataprop.ResponseDataPropinsiDua;
import cindodcindy.ambigoushproject.datacovidindonesia.model.modelmodel.Attributes;
import cindodcindy.ambigoushproject.datacovidindonesia.model.modelmodel.ResponseDataPropinsi;
import cindodcindy.ambigoushproject.datacovidindonesia.retrofit.RetrofitMethod;
import cindodcindy.ambigoushproject.datacovidindonesia.retrofit.RetrofitUrl;
import cindodcindy.ambigoushproject.datacovidindonesia.view.adapter.AdapterIndonesia;
//import cindodcindy.ambigoushproject.datacovidindonesia.view.adapter.SliderAdapterIndo;
import cindodcindy.ambigoushproject.datacovidindonesia.view.adapter.SliderAdapterIndo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataIndonesiaFragmnet#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataIndonesiaFragmnet extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerView;
    private AdapterIndonesia adapterIndonesia;
    private List<ListDatum> propinsiAtributes = new ArrayList<>();
    private RetrofitMethod retrofitMethod;



    public DataIndonesiaFragmnet() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataIndonesiaFragmnet.
     */
    // TODO: Rename and change types and number of parameters
    public static DataIndonesiaFragmnet newInstance(String param1, String param2) {
        DataIndonesiaFragmnet fragment = new DataIndonesiaFragmnet();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_data_indonesia_fragmnet, container, false);

        SliderView sliderView = view.findViewById(R.id.imageSlider_indoenesia_data);

        SliderAdapterIndo adapter = new SliderAdapterIndo(getContext());

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();





        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rv_indo_data_prop);
        adapterIndonesia = new AdapterIndonesia( getContext(),propinsiAtributes);
        recyclerView.setAdapter(adapterIndonesia);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);


        getDataPropinsi();



    }


    public void getDataPropinsi(){

        retrofitMethod = RetrofitUrl.getRetrofitHandleDataCovid().create(RetrofitMethod.class);
        Call<ResponseDataPropinsiDua> orderListCall=retrofitMethod.getDataPropinsi();
        orderListCall.enqueue(new Callback<ResponseDataPropinsiDua>() {
            @Override
            public void onResponse(Call<ResponseDataPropinsiDua> call, Response<ResponseDataPropinsiDua> response) {

                if (response.isSuccessful()) {
                    response.body().getCurrentData();
                    adapterIndonesia = new AdapterIndonesia(getContext(),propinsiAtributes);
                    recyclerView.setAdapter(adapterIndonesia);
                    adapterIndonesia.notifyDataSetChanged();
                }
                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(getContext(), "404 not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(getContext(), "500 internal server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(getContext(), "401 unauthorized", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(getContext(), "unknown error", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseDataPropinsiDua> call, Throwable t) {
                Toast.makeText(getContext(), "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();

            }
        });


    }





    /*

    public void getContactList(){

        retrofitMethod = RetrofitUrl.getRetrofitHandleDataCovid().create(RetrofitMethod.class);
        Call<PropinsiResponse> orderListCall=retrofitMethod.getDataPropinsi();
        orderListCall.enqueue(new Callback<PropinsiResponse>() {
            @Override
            public void onResponse(Call<PropinsiResponse> call, Response<PropinsiResponse> response) {

                if (response.isSuccessful()) {
                    //ResponListOrederHistoryBaru responListOrederHistoryBaru=response.body();
                    //Datum datum = (Datum) responListOrederHistoryBaru.getData();
                    // ResponListContacts responListContacts=response.body();
                    //Datum data   = (Datum) responListContacts.getData();
                    propinsiAtributesList = Collections.singletonList(response.body().getAttributes());
                    adapterPropinsi = new AdapterPropinsi(getContext(),propinsiAtributesList);
                    recyclerView.setAdapter(adapterPropinsi);
                    adapterPropinsi.notifyDataSetChanged();

//
                }
                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(getContext(), "404 not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(getContext(), "500 internal server error", Toast.LENGTH_SHORT).show();
                            break;
                        case 401:
                            Toast.makeText(getContext(), "401 unauthorized", Toast.LENGTH_SHORT).show();
                            break;

                        default:
                            Toast.makeText(getContext(), "unknown error", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }

            @Override
            public void onFailure(Call<PropinsiResponse> call, Throwable t) {
                Toast.makeText(getContext(), "network failure :( inform the user and possibly retry ", Toast.LENGTH_SHORT).show();


            }
        });


    }

 */



}