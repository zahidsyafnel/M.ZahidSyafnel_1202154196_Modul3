package com.example.android.mzahidsyafnel_1202154196_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//class untuk wateradapter
public class WaterAdapter extends RecyclerView.Adapter<WaterAdapter.WaterViewHolder> {
    private ArrayList<Water> mDataAir; //arraylist
    private Context mcontext;
    //method untuk arraylist water dan menset data air
    public WaterAdapter(Context context, ArrayList<Water> waters) {
        this.mcontext = context;
        mDataAir = waters;
    }
    //method override untuk list dari item menu minuman
    @Override
    public WaterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WaterViewHolder(LayoutInflater.from(mcontext).inflate(R.layout.list_item, parent, false));
    }
    //method override saat air di klik maka dia akan hold
    @Override
    public void onBindViewHolder(WaterViewHolder holder, int position) {
        Water currentWater = mDataAir.get(position);
        holder.bindTo(currentWater);
    }
    // method override untuk ukuran data air
    @Override
    public int getItemCount() {
        return mDataAir.size();
    }
    class WaterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mTitle, mDescription;
        ImageView mWatersImage;
        public WaterViewHolder(View itemView) {
            super(itemView);
            mTitle = itemView.findViewById(R.id.title);
            mDescription = itemView.findViewById(R.id.subTitle);
            mWatersImage = itemView.findViewById(R.id.watersImage);
            itemView.setOnClickListener(this);
        }
        //untuk mengambil gambar,tittle,image
        void bindTo(Water currentWater) {
            mTitle.setText(currentWater.getTitle());
            mDescription.setText(currentWater.getDescpription());
            mWatersImage.setImageResource(currentWater.getImage());
        }
        //method saat di klik menu salah satu data air
        @Override
        public void onClick(View view) {
            Water currentWater = mDataAir.get(getAdapterPosition());
            Intent intent = new Intent(mcontext, DetailActivity.class);
            intent.putExtra("title", currentWater.getTitle());
            intent.putExtra("image", currentWater.getImage());
            intent.putExtra("detail", currentWater.getDetail());
            mcontext.startActivity(intent);
        }
    }
}