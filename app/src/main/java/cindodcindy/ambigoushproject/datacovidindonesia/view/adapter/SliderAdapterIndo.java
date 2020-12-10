package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import cindodcindy.ambigoushproject.datacovidindonesia.R;

import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.backron_world;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.backronindonesia;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.bagron_indonesia;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.bakron_world;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.barond_data_propinsi;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.indonesai_slider_empat;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.indonesia_slider_lima;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.indonesia_slider_tiga;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.news;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.news_bekrond;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.news_sembilan;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_indonesia_satu;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_indonesia_tiga;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_new_tujuh;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_news;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_news_dua;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_news_empat;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_news_enam;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_news_lima;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.slider_news_tiga;

public class SliderAdapterIndo extends SliderViewAdapter<SliderAdapterIndo.SliderAdapterVH> {

    private Context context;

    public SliderAdapterIndo(Context context){
        this.context=context;
    }


    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_data_indonesia_fragmnet,null);

        return  new SliderAdapterIndo.SliderAdapterVH(inflate);


    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {

        switch (position){
            case 0:
                viewHolder.imageViewBackground_drink.setImageResource(indonesia_slider_tiga);
                break;

            case 1:
                viewHolder.imageViewBackground_drink.setImageResource(backronindonesia);
                break;

            case 2:
                viewHolder.imageViewBackground_drink.setImageResource(bagron_indonesia);
                break;

            case 3:
                viewHolder.imageViewBackground_drink.setImageResource(indonesai_slider_empat);
                break;

            case 4:
                viewHolder.imageViewBackground_drink.setImageResource(indonesia_slider_lima);
                break;
            case 5:
                viewHolder.imageViewBackground_drink.setImageResource(slider_indonesia_satu);
                break;
            case 6:
                viewHolder.imageViewBackground_drink.setImageResource(slider_indonesia_tiga);
                break;
            case 7:
                viewHolder.imageViewBackground_drink.setImageResource(barond_data_propinsi);
                break;

            case 8:
                viewHolder.imageViewBackground_drink.setImageResource(backron_world);
                break;

            default:
                viewHolder.imageViewBackground_drink.setImageResource(bakron_world);
                break;

        }



    }

    @Override
    public int getCount() {
        return 10;
    }

    public class SliderAdapterVH extends SliderViewAdapter.ViewHolder{

        View itemView;
        ImageView imageViewBackground_drink;


        public SliderAdapterVH(View itemView) {
            super(itemView);

            imageViewBackground_drink=itemView.findViewById(R.id.iv_auto_image_slider_indo);
            // textViewDescription=itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView=itemView;

        }
    }
}


