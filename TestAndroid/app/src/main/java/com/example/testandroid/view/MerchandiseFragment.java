package com.example.testandroid.view;


import android.content.Context;
import android.content.SharedPreferences;
import android.databinding.BindingAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import com.example.testandroid.R;
import com.example.testandroid.controller.AdapterRecyclerMenu;
import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 */
public class MerchandiseFragment extends Fragment {

    private AdapterRecyclerMenu adapterRecyclerMenu;

    private ArrayList<Menu> modelMenus = new ArrayList<>();
    private Context mContext;
    private SharedPreferences userPref;
    public MerchandiseFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_merchandise, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }


}
