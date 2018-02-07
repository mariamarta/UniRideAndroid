package com.sjsu.se195.uniride.fragment;

/**
 * Created by timhdavis on 11/11/17.
 */

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyOrganizationsFragment extends OrganizationListFragment {

    // Lists every organization the user belongs in -- Under "My Organization tab"

    public MyOrganizationsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        //Points to the user-organization branch and retrieves all of the data that matches the current user's id
        return databaseReference.child("user-organizations")
                .child(getUid());
    }
}
