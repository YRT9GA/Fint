package com.coresystems.fint;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CashAdapter extends RecyclerView.Adapter<CashAdapter.CashViewHolder> {

    String acc_data1[];
    String acc_data2[];

    Context context;


    public CashAdapter(Context ctxt, String str1[], String str2[]){

        context = ctxt;
        acc_data1 = str1;
        acc_data2 = str2;


    }

    @NonNull
    @Override
    public CashViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_added_new_cash_acc, parent, false);
        return new CashViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CashViewHolder holder, int position) {
        holder.cashName.setText(acc_data1[position]);
        holder.cashSum.setText(acc_data2[position]);

    }

    @Override
    public int getItemCount() {
        return acc_data1.length;
    }

    public static class CashViewHolder  extends RecyclerView.ViewHolder{

        TextView cashName;
        TextView cashSum;

        public CashViewHolder(@NonNull View itemView) {
            super(itemView);
            cashName = itemView.findViewById(R.id.tv_cash_name);
            cashSum = itemView.findViewById(R.id.tv_cash_sum);



        }
    }
}
