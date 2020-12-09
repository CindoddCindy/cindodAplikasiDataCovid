package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import cindodcindy.ambigoushproject.datacovidindonesia.R;

public class AdapterPropinsi extends RecyclerView.Adapter<AdapterPropinsi.AdapterPropinsiChild> {

    @NonNull
    @Override
    public AdapterPropinsiChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPropinsiChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
