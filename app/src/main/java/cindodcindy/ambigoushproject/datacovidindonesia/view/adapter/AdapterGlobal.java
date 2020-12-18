package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.PrimitiveIterator;

import cindodcindy.ambigoushproject.datacovidindonesia.R;
import cindodcindy.ambigoushproject.datacovidindonesia.model.Attributes;
import cindodcindy.ambigoushproject.datacovidindonesia.model.ModelTest;
import cindodcindy.ambigoushproject.datacovidindonesia.model.globalempat.GlobalResponseEmpat;
import cindodcindy.ambigoushproject.datacovidindonesia.model.globaltiga.GlobalResponseTiga;

public class AdapterGlobal extends RecyclerView.Adapter<AdapterGlobal.GlobalChild> {

    Context context;
    List<GlobalResponseEmpat> attributes;

    public AdapterGlobal(Context context, List<GlobalResponseEmpat> attributes){
        this.context=context;
        this.attributes=attributes;
    }

    public AdapterGlobal(Context context, String attributes) {
    }



    @NonNull
    @Override
    public GlobalChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View views= layoutInflater.inflate(R.layout.item_global, parent, false);
        GlobalChild kotakMasukChild=new GlobalChild(views);

        return kotakMasukChild;

    }

    @Override
    public void onBindViewHolder(@NonNull GlobalChild holder, int position) {
        holder.textView_nama_negara.setText(attributes.get(position).getCountry());
        holder.textView_postif.setText(String.valueOf(attributes.get(position).getTodayCases()));
        holder.textView_meninggal.setText(String.valueOf(attributes.get(position).getDeaths()));
        holder.textView_sembuh.setText(String.valueOf(attributes.get(position).getRecovered()));
        holder.textView_dirawat.setText(String.valueOf(attributes.get(position).getActive()));


    }

    @Override
    public int getItemCount() {
        return attributes.size();
    }

    public  class GlobalChild extends  RecyclerView.ViewHolder{

        private TextView textView_nama_negara, textView_postif, textView_meninggal, textView_sembuh, textView_dirawat;

        public GlobalChild(@NonNull View itemView) {
            super(itemView);

            textView_nama_negara=itemView.findViewById(R.id.tv_globa_nama_negara);
            textView_postif=itemView.findViewById(R.id.tv_global_positiv);
            textView_meninggal=itemView.findViewById(R.id.tv_global_meninggal);
            textView_sembuh=itemView.findViewById(R.id.tv_global_sembuh);
            textView_dirawat=itemView.findViewById(R.id.tv_global_dirawat);
        }
    }
}
