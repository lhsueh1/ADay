package com.leisure.aday.ui.gallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.leisure.aday.R;

import java.util.ArrayList;

public abstract class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    private LayoutInflater mInflater;
    private ArrayList<Contact> mContacts;
    public ContactsAdapter(Context context, ArrayList<Contact> contacts) {
        this.mInflater = LayoutInflater.from(context);
        this.mContacts = contacts;
    }
    //@Override
    public ViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String name = mContacts.get(position).getName();
        holder.myTextView.setText(name);
    }
    @Override
    public int getItemCount(){
        return mContacts.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;
        ViewHolder(View itemView) {
            super(itemView);
            myTextView = itemView.findViewById(R.id.contact_name);
        }
        @Override
        public void onClick(View view){
        }
    }
    public String getItem(int id){
        return mContacts.get(id).getName();
    }

}