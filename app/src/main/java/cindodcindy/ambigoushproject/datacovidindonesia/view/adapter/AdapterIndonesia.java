package cindodcindy.ambigoushproject.datacovidindonesia.view.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterIndonesia  extends RecyclerView.Adapter<AdapterIndonesia.IndonesiaAdapterChild> {

    @NonNull
    @Override
    public IndonesiaAdapterChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull IndonesiaAdapterChild holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class IndonesiaAdapterChild extends RecyclerView.ViewHolder{

        public IndonesiaAdapterChild(@NonNull View itemView) {
            super(itemView);
        }
    }
}
