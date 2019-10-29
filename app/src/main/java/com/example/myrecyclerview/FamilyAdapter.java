package com.example.myrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class FamilyAdapter extends RecyclerView.Adapter<FamilyAdapter.FamilyViewHolder> {

    private ArrayList<Family> dataList;

    public FamilyAdapter(ArrayList<Family> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public FamilyAdapter.FamilyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluargaku, parent, false);
        return new FamilyViewHolder(view);
    }

    public void onBindViewHolder(FamilyViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
        holder.txtTtl.setText(dataList.get(position).getTtl());
        holder.Vfoto.setImageResource(dataList.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class FamilyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtStatus, txtTtl;
        private ImageView Vfoto;

        public FamilyViewHolder(View itemView) {
            super(itemView);

            txtNama = (TextView) itemView.findViewById(R.id.txt_nama_keluarga);
            txtStatus = (TextView) itemView.findViewById(R.id.txt_status_keluarga);
            txtTtl = (TextView) itemView.findViewById(R.id.txt_ttl_keluarga);
            Vfoto = (ImageView) itemView.findViewById(R.id.viewfoto);
        }
    }
}