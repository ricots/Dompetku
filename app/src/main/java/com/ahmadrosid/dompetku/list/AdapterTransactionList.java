package com.ahmadrosid.dompetku.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ahmadrosid.dompetku.R;
import com.ahmadrosid.dompetku.data.Transactions;

import java.util.List;

/**
 * Created by ocittwo on 1/26/17.
 *
 * @Author Ahmad Rosid
 * @Email ocittwo@gmail.com
 * @Github https://github.com/ar-android
 * @Web http://ahmadrosid.com
 */
public abstract class AdapterTransactionList extends RecyclerView.Adapter<TransactionItemHolder>{
    private List<Transactions> data;

    public AdapterTransactionList(List<Transactions> data) {
        this.data = data;
    }

    @Override public TransactionItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wallet_list, parent, false);
        return new TransactionItemHolder(view);
    }

    @Override public void onBindViewHolder(TransactionItemHolder holder, int position) {
        bindHolder(holder, data.get(position));
    }

    protected abstract void bindHolder(TransactionItemHolder holder, Transactions model);

    @Override public int getItemCount() {
        return data.size();
    }
}
