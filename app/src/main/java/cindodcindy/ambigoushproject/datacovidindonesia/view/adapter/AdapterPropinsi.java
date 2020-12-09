package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cindodcindy.ambigoushproject.datacovidindonesia.R;
import cindodcindy.ambigoushproject.datacovidindonesia.model.PropinsiAtributes;

public class AdapterPropinsi extends RecyclerView.Adapter<AdapterPropinsi.AdapterPropinsiChild> {


    public List<PropinsiAtributes> propinsiAtributesList;

    public Context context;

    public AdapterPropinsi(Context context, List<PropinsiAtributes>propinsiAtributesList){
        this.context=context;
        this.propinsiAtributesList=propinsiAtributesList;
    }

    @NonNull
    @Override
    public AdapterPropinsiChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_propinsi, parent, false);
        AdapterPropinsiChild mViewHolder = new AdapterPropinsiChild(mView);


        return mViewHolder;
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPropinsiChild holder, int position) {

        final PropinsiAtributes datum= propinsiAtributesList.get(position);
        holder.textView_nama_prop.setText(datum.getProvinsi());
        holder.textView_positiv.setText((int) datum.getKasusPosi());
        holder.textView_meninggal.setText((int) datum.getKasusMeni());
        holder.textView_sembuh.setText((int) datum.getKasusSemb());


    }

    @Override
    public int getItemCount() {
        return propinsiAtributesList.size();
    }

    public  class  AdapterPropinsiChild extends RecyclerView.ViewHolder{

        private TextView textView_nama_prop, textView_positiv, textView_meninggal, textView_sembuh;


        public AdapterPropinsiChild(@NonNull View itemView) {
            super(itemView);

            textView_nama_prop=itemView.findViewById(R.id.tv_prop_nama_propinsi);
            textView_positiv=itemView.findViewById(R.id.tv_propinsi_positif);
            textView_meninggal=itemView.findViewById(R.id.tv_propinsi_meninggal);
            textView_sembuh=itemView.findViewById(R.id.tv_propinsi_sembuh);
        }
    }
}
