package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import cindodcindy.ambigoushproject.datacovidindonesia.R;

import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.bakron_world;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_delapan;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_enam;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_sepuluh;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_slider_dua;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_slider_empat;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_slider_lima;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_slider_satu;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_slider_tiga;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_seven;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.world_tujuh;

public class SliderAdapterGlobal extends SliderViewAdapter<SliderAdapterGlobal.SliderAdapterVH>{

    private Context context;

    public SliderAdapterGlobal(Context context){
        this.context=context;
    }


    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_data_global,null);

        return  new SliderAdapterGlobal.SliderAdapterVH(inflate);

        //return null;
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, int position) {

        switch (position){
            case 0:
                viewHolder.imageViewBackground_drink.setImageResource(world_slider_satu);
                break;

            case 1:
                viewHolder.imageViewBackground_drink.setImageResource(world_slider_dua);
                break;

            case 2:
                viewHolder.imageViewBackground_drink.setImageResource(world_slider_tiga);
                break;

            case 3:
                viewHolder.imageViewBackground_drink.setImageResource(world_slider_empat);
                break;

            case 4:
                viewHolder.imageViewBackground_drink.setImageResource(world_slider_lima);
                break;
            case 5:
                viewHolder.imageViewBackground_drink.setImageResource(world_enam);
                break;
            case 6:
                viewHolder.imageViewBackground_drink.setImageResource(world_seven);
                break;
            case 7:
                viewHolder.imageViewBackground_drink.setImageResource(world_delapan);
                break;

            case 8:
                viewHolder.imageViewBackground_drink.setImageResource(world_sepuluh);
                break;

            default:
                viewHolder.imageViewBackground_drink.setImageResource(world_tujuh);
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

            imageViewBackground_drink=itemView.findViewById(R.id.iv_auto_image_slider_global);
            // textViewDescription=itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView=itemView;

        }
    }
}
