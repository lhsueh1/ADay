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
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
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

        super.onCreate(savedInstanceState);


        // Lookup the recyclerview in activity layout
        RecyclerView rvContacts = root.findViewById(R.id.r1);

        // Initialize contacts
        ArrayList<Contact> contacts;
        contacts = Contact.createContactsList(20);
        // Create adapter passing in the sample user data
        ContactsAdapter adapter;
        adapter = new ContactsAdapter(getActivity(), contacts);
        // Attach the adapter to the recyclerview to populate items
        rvContacts.setAdapter(adapter);
        // Set layout manager to position the items
        rvContacts.setLayoutManager(new LinearLayoutManager(getContext());



        return root;
    }










    /*public class ContactsAdapter1 extends RecyclerView.Adapter<ContactsAdapter1.ViewHolder> {

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
        public ContactsAdapter1(List<Contact> contacts) {
            mContacts = contacts;
        }
        @Override
        public ContactsAdapter1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            // Inflate the custom layout
            View contactView = inflater.inflate(R.layout.item, parent, false);

            // Return a new holder instance
            ViewHolder viewHolder = new ViewHolder(contactView);
            return viewHolder;
        }

        // Involves populating data into the item through holder
        @Override
        public void onBindViewHolder(ContactsAdapter1.ViewHolder holder, int position) {
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

    }*/

    /*public class UserListActivity extends AppCompatActivity {

        ArrayList<Contact> contacts;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // ...
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_gallery);

            // Lookup the recyclerview in activity layout
            RecyclerView rvContacts = (RecyclerView) findViewById(R.id.r1);

            // Initialize contacts
            contacts = Contact.createContactsList(20);
            // Create adapter passing in the sample user data
            ContactsAdapter adapter = new ContactsAdapter(contacts);
            // Attach the adapter to the recyclerview to populate items
            rvContacts.setAdapter(adapter);
            // Set layout manager to position the items
            rvContacts.setLayoutManager(new LinearLayoutManager(this));
            // That's all!
        }
    }*/









}


