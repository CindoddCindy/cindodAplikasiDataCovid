package cindodcindy.ambigoushproject.datacovidindonesia.view.fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import cindodcindy.ambigoushproject.datacovidindonesia.R;
import cindodcindy.ambigoushproject.datacovidindonesia.model.ModelTest;
import cindodcindy.ambigoushproject.datacovidindonesia.view.adapter.AdapterGlobal;
import cindodcindy.ambigoushproject.datacovidindonesia.view.adapter.SliderAdapterGlobal;
//import cindodcindy.ambigoushproject.datacovidindonesia.view.adapter.SliderAdapterIndo;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataGlobal#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataGlobal extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private List<ModelTest> modelSementaraList ;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager_dua;
    private AdapterGlobal adapterGlobal;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DataGlobal() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataGlobal.
     */
    // TODO: Rename and change types and number of parameters
    public static DataGlobal newInstance(String param1, String param2) {
        DataGlobal fragment = new DataGlobal();
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
        View view = inflater.inflate(R.layout.fragment_data_global, container, false);

        SliderView sliderView = view.findViewById(R.id.imageSlider_global_data);

        SliderAdapterGlobal adapter = new SliderAdapterGlobal(getContext());

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(4); //set scroll delay in seconds :
        sliderView.startAutoCycle();




        recyclerView =view.findViewById(R.id.rv_global);
        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        //


        modelSementaraList = new ArrayList<>();
        modelSementaraList.add(new ModelTest("Jenis Pesanan","Isi Pesan"));
        modelSementaraList.add(new ModelTest("Jenis Pesanan","Isi Pesan"));
        modelSementaraList.add(new ModelTest("Jenis Pesanan","Isi Pesan"));
        modelSementaraList.add(new ModelTest("Jenis Pesanan","Isi Pesan"));
        modelSementaraList.add(new ModelTest("Jenis Pesanan","Isi Pesan"));
        modelSementaraList.add(new ModelTest("Jenis Pesanan","Isi Pesan"));
        modelSementaraList.add(new ModelTest("Jenis Pesanan","Isi Pesan"));



        adapterGlobal= new AdapterGlobal(getContext(),modelSementaraList);
        recyclerView.setAdapter(adapterGlobal);


        return view;

    }
}