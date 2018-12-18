package com.example.testandroid.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.example.testandroid.R;
import com.example.testandroid.controller.AdapterRecyclerMenu;
import com.example.testandroid.databinding.FragmentFoodBinding;
import com.example.testandroid.model.MainMenu;

import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    private FragmentFoodBinding binding;
    private AdapterRecyclerMenu adapterRecyclerMenu;
    private ArrayList<MainMenu> modelMenus = new ArrayList<>();
    private Context mContext;
    private SharedPreferences userPref;
    public FoodFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_food, container, false);
        return binding.getRoot();
    }
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }
    private void recyclerInit() {
       // adapterRecyclerMenu = new AdapterRecyclerMenu(MainMenu);
        binding.recyclerFood.setHasFixedSize(true);
        binding.recyclerFood.setLayoutManager(new GridLayoutManager(mContext, 2));
        binding.recyclerFood.setAdapter(adapterRecyclerMenu);
    }
}
