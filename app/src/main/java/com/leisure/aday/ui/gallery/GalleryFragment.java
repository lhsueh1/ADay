package com.leisure.aday.ui.gallery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.leisure.aday.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }


    public static class Contact {
        private String mName;
        private boolean mOnline;

        public Contact(String name, boolean online) {
            mName = name;
            mOnline = online;
        }

        public String getName() {
            return mName;
        }

        public boolean isOnline() {
            return mOnline;
        }

        private static int lastContactId = 0;

        public static ArrayList<Contact> createContactsList(int numContacts) {
            ArrayList<Contact> contacts = new ArrayList<Contact>();

            for (int i = 1; i <= numContacts; i++) {
                contacts.add(new Contact("Person " + ++lastContactId, i <= numContacts / 2));
            }

            return contacts;
        }





    }

    public abstract class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

        // Provide a direct reference to each of the views within a data item
        // Used to cache the views within the item layout for fast access
        public class ViewHolder extends RecyclerView.ViewHolder {
            // Your holder should contain a member variable
            // for any view that will be set as you render a row
            public TextView nameTextView;
            public Button messageButton;

            // We also create a constructor that accepts the entire item row
            // and does the view lookups to find each subview
            public ViewHolder(View itemView) {
                // Stores the itemView in a public final member variable that can be used
                // to access the context from any ViewHolder instance.
                super(itemView);

                nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
                messageButton = (Button) itemView.findViewById(R.id.message_button);
            }
        }

        // Store a member variable for the contacts
        private List<Contact> mContacts;

        // Pass in the contact array into the constructor
        public ContactsAdapter(List<Contact> contacts) {
            mContacts = contacts;
        }
        @Override
        public ContactsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            // Inflate the custom layout
            View contactView = inflater.inflate(R.layout.item, parent, false);

            // Return a new holder instance
            ViewHolder viewHolder = new ViewHolder(contactView);
            return viewHolder;
        }
//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
        // Involves populating data into the item through holder
        @Override
        public void onBindViewHolder(ContactsAdapter.ViewHolder holder, int position) {
            // Get the data model based on position
            Contact contact = mContacts.get(position);

            // Set item views based on your views and data model
            TextView textView = holder.nameTextView;
            textView.setText(contact.getName());
            Button button = holder.messageButton;
            button.setText(contact.isOnline() ? "Message" : "Offline");
            button.setEnabled(contact.isOnline());
        }

        // Returns the total count of items in the list
        @Override
        public int getItemCount() {
            return mContacts.size();
        }

    }









}