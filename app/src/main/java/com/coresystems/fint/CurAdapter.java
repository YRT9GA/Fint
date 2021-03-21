package com.coresystems.fint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CurAdapter extends RecyclerView.Adapter<CurAdapter.CurViewHolder> {

    String acc_data1[];
    String acc_data2[];
    String acc_data3[];
    int images[];

    Context context;


    public CurAdapter(Context ctxt, String str1[], String str2[], String str3[], int img[]){

        context = ctxt;
        acc_data1 = str1;
        acc_data2 = str2;
        acc_data3 = str3;
        images = img;


    }

    @NonNull
    @Override
    public CurViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_added_new_cur_acc, parent, false);
        return new CurViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurViewHolder holder, int position) {
        holder.credName.setText(acc_data1[position]);
        holder.credSum.setText(acc_data2[position]);
        holder.credLim.setText(acc_data3[position]);
        holder.myImage.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return acc_data1.length;
    }

    public static class CurViewHolder  extends RecyclerView.ViewHolder{

        TextView credName;
        TextView credSum;
        TextView credLim;
        ImageView myImage;

        public CurViewHolder(@NonNull View itemView) {
            super(itemView);
            credName = itemView.findViewById(R.id.tv_cur_name);
            credSum = itemView.findViewById(R.id.tv_cur_sum);
            credLim = itemView.findViewById(R.id.tv_cur_exc);
            myImage = itemView.findViewById(R.id.cur_arrow);



        }
    }
}
