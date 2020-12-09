package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

import cindodcindy.ambigoushproject.datacovidindonesia.R;
import cindodcindy.ambigoushproject.datacovidindonesia.model.SliderItem;

import static cindodcindy.ambigoushproject.datacovidindonesia.R.drawable.*;
import static cindodcindy.ambigoushproject.datacovidindonesia.R.id.back_and_forth;

public class SliderAdapterExample extends SliderViewAdapter<SliderAdapterExample.SliderAdapterVH> {

    private Context context;

    public SliderAdapterExample(Context context){
        this.context=context;
    }



    @Override
    public SliderAdapterExample.SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_news,null);

        return  new SliderAdapterExample.SliderAdapterVH(inflate);


    }

    @Override
    public void onBindViewHolder(SliderAdapterExample.SliderAdapterVH viewHolder, int position) {

        switch (position){
            case 0:
                viewHolder.imageViewBackground_drink.setImageResource(news_bekrond);
                break;

            case 1:
                viewHolder.imageViewBackground_drink.setImageResource(news);
                break;

            case 2:
                viewHolder.imageViewBackground_drink.setImageResource(slider_news_dua);
                break;

            case 3:
                viewHolder.imageViewBackground_drink.setImageResource(slider_news_tiga);
                break;

            case 4:
                viewHolder.imageViewBackground_drink.setImageResource(slider_news_empat);
                break;
            case 5:
                viewHolder.imageViewBackground_drink.setImageResource(slider_news_lima);
                break;
            case 6:
                viewHolder.imageViewBackground_drink.setImageResource(slider_news_enam);
                break;
            case 7:
                viewHolder.imageViewBackground_drink.setImageResource(slider_new_tujuh);
                break;

            case 8:
                viewHolder.imageViewBackground_drink.setImageResource(news_sembilan);
                break;

            default:
                viewHolder.imageViewBackground_drink.setImageResource(slider_news);
                break;

        }


    }




    @Override
    public int getCount() {
        return 10;
    }

    public class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imageViewBackground_drink;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imageViewBackground_drink=itemView.findViewById(R.id.iv_auto_image_slider);
            // textViewDescription=itemView.findViewById(R.id.tv_auto_image_slider);
            this.itemView=itemView;

        }
    }
}
