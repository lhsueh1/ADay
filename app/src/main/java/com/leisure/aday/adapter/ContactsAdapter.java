package com.leisure.aday.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leisure.aday.R;
import com.leisure.aday.ui.gallery.Contact;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {
    private LayoutInflater mInflater;
    private ArrayList<Contact> mContacts;
    public ContactsAdapter(Context context, ArrayList<Contact> contacts) {
        this.mInflater = LayoutInflater.from(context);
        this.mContacts = contacts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
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