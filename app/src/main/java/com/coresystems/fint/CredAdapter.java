package com.coresystems.fint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CredAdapter extends RecyclerView.Adapter<CredAdapter.CredViewHolder> {

    String acc_data1[];
    String acc_data2[];
    String acc_data3[];

    Context context;


    public CredAdapter(Context ctxt, String str1[], String str2[], String str3[]){

        context = ctxt;
        acc_data1 = str1;
        acc_data2 = str2;
        acc_data3 = str3;


    }

    @NonNull
    @Override
    public CredViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_added_new_cred_acc, parent, false);
        return new CredViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CredViewHolder holder, int position) {
        holder.credName.setText(acc_data1[position]);
        holder.credSum.setText(acc_data2[position]);
        holder.credLim.setText(acc_data3[position]);

    }

    @Override
    public int getItemCount() {
        return acc_data1.length;
    }

    public static class CredViewHolder  extends RecyclerView.ViewHolder{

        TextView credName;
        TextView credSum;
        TextView credLim;

        public CredViewHolder(@NonNull View itemView) {
            super(itemView);
            credName = itemView.findViewById(R.id.tv_cred_name);
            credSum = itemView.findViewById(R.id.tv_cred_sum);
            credLim = itemView.findViewById(R.id.tv_cred_lim);



        }
    }
}
