package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cindodcindy.ambigoushproject.datacovidindonesia.R;
import cindodcindy.ambigoushproject.datacovidindonesia.model.PropinsiAtributes;

public class AdapterIndonesia  extends RecyclerView.Adapter<AdapterIndonesia.IndonesiaAdapterChild> {


    Context context;
    List<PropinsiAtributes> propinsiAtributes;

    public AdapterIndonesia(Context context, List<PropinsiAtributes> propinsiAtributesList){
        this.context=context;
        this.propinsiAtributes=propinsiAtributesList;
    }

    @NonNull
    @Override
    public IndonesiaAdapterChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.propinsi_layout, parent, false);
        IndonesiaAdapterChild mViewHolder = new IndonesiaAdapterChild(mView);


        return mViewHolder;
       }

    @Override
    public void onBindViewHolder(@NonNull IndonesiaAdapterChild holder, int position) {
        holder.textView_nama_prop.setText(propinsiAtributes.get(position).getProvinsi());
//        holder.textView_isi.setText(modelSementaras.get(position).isi);


    }

    @Override
    public int getItemCount() {
        return propinsiAtributes.size();
    }

    public  class IndonesiaAdapterChild extends RecyclerView.ViewHolder{

        private TextView textView_nama_prop, textView_positif, textView_meninggal, textView_sembuh;

        public IndonesiaAdapterChild(@NonNull View itemView) {
            super(itemView);
            textView_nama_prop=itemView.findViewById(R.id.tv_prop_nama_propinsi);
            textView_positif=itemView.findViewById(R.id.tv_propinsi_positif);
            textView_meninggal=itemView.findViewById(R.id.tv_propinsi_meninggal);
            textView_sembuh=itemView.findViewById(R.id.tv_propinsi_sembuh);
        }
    }
}
