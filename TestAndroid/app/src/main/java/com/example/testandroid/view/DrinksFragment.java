package com.example.testandroid.view;

import android.content.Context;
import android.content.SharedPreferences;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.testandroid.R;
import com.example.testandroid.controller.AdapterRecyclerMenu;
import com.example.testandroid.databinding.FragmentDrinksBinding;
import com.example.testandroid.model.MainMenu;
import java.util.ArrayList;
/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the

 * create an instance of this fragment.
 */
public class DrinksFragment extends Fragment {
    private FragmentDrinksBinding binding;
    //private DrinksFragmentBinding binding;

    private AdapterRecyclerMenu adapterNonCoffe, adapterCoffe, adapterFrappeCoffe, adapterFrappeJuice,
            adapterTea, adapterFrappeCream;
    private RecyclerView mItemList;
    private ArrayList<MainMenu> listNonCoffe = new ArrayList<>();
    private ArrayList<MainMenu> listCoffe = new ArrayList<>();
    private ArrayList<MainMenu> listFrappeCoffe = new ArrayList<>();
    private ArrayList<MainMenu> listFrappeJuice = new ArrayList<>();
    private ArrayList<MainMenu> listTea = new ArrayList<>();
    private ArrayList<MainMenu> listFrappeCream = new ArrayList<>();
    private Context mContext;
    private SharedPreferences userPref;
    private boolean isNonCoffe, isCoffe, isFrappeCoffe, isFrappeJuice, isTea, isFrappeCream = false;
    private boolean isNonCoffeLoad, isCoffeLoad, isFrappeCoffeLoad, isFrappeJuiceLoad, isTeaLoad, isFrappeCreamLoad = false;

    public DrinksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_drinks, container, false);
        return binding.getRoot();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    private void clickListener() {
        binding.layoutNonCoffe.setOnClickListener(v -> {
            if (isNonCoffe) {
                isNonCoffe = false;
                binding.recyclerNonCoffe.setVisibility(View.GONE);
            } else {
                isNonCoffe = true;

                if (isNonCoffeLoad) {
                    binding.recyclerNonCoffe.setVisibility(View.VISIBLE);
                } else {
                    isNonCoffeLoad = true;
                    loadNonCoffe();
                }
            }
        });

        binding.layoutCoffe.setOnClickListener(v -> {
            if (isCoffe) {
                isCoffe = false;
                binding.recyclerCoffe.setVisibility(View.GONE);
            } else {
                isCoffe = true;

                if (isCoffeLoad) {
                    binding.recyclerCoffe.setVisibility(View.VISIBLE);
                } else {
                    isCoffeLoad = true;
                    loadCoffe();
                }
            }
        });

        binding.layoutFrappeCoffe.setOnClickListener(v -> {
            if (isFrappeCoffe) {
                isFrappeCoffe = false;
                binding.recyclerFrappeCoffe.setVisibility(View.GONE);
            } else {
                isFrappeCoffe = true;

                if (isFrappeCoffeLoad) {
                    binding.recyclerFrappeCoffe.setVisibility(View.VISIBLE);
                } else {
                    isFrappeCoffeLoad = true;
                    loadFrappeCoffe();
                }
            }
        });

        binding.layoutFrappeJuice.setOnClickListener(v -> {
            if (isFrappeJuice) {
                isFrappeJuice = false;
                binding.recyclerFrappeJuice.setVisibility(View.GONE);
            } else {
                isFrappeJuice = true;

                if (isFrappeJuiceLoad) {
                    binding.recyclerFrappeJuice.setVisibility(View.VISIBLE);
                } else {
                    isFrappeJuiceLoad = true;
                    loadFrappeJuice();
                }
            }
        });

        binding.layoutTea.setOnClickListener(v -> {
            if (isTea) {
                isTea = false;
                binding.recyclerTea.setVisibility(View.GONE);
            } else {
                isTea = true;

                if (isTeaLoad) {
                    binding.recyclerTea.setVisibility(View.VISIBLE);
                } else {
                    isTeaLoad = true;
                    loadTea();
                }
            }
        });

        binding.layoutFrappeCream.setOnClickListener(v -> {
            if (isFrappeCream) {
                isFrappeCream = false;
                binding.recyclerFrappeCream.setVisibility(View.GONE);
            } else {
                isFrappeCream = true;

                if (isFrappeCreamLoad) {
                    binding.recyclerFrappeCream.setVisibility(View.VISIBLE);
                } else {
                    isFrappeCreamLoad = true;
                    loadFrappeCream();
                }
            }
        });
    }
    private void loadCoffe(){
        binding.progressBarCoffe.setVisibility(View.VISIBLE);

    }
    private void loadNonCoffe(){
        binding.progressBarNonCoffe.setVisibility(View.VISIBLE);
    }
    private void loadTea(){
        binding.progressBarTea.setVisibility(View.VISIBLE);
    }
    private void loadFrappeCream(){
        binding.progressBarFrappeCream.setVisibility(View.VISIBLE);
    }
    private void loadFrappeCoffe(){
        binding.progressBarFrappeCoffe.setVisibility(View.VISIBLE);
    }
    private void loadFrappeJuice(){
        binding.progressBarFrappeJuice.setVisibility(View.VISIBLE);
    }
    private void recyclerInit() {
        adapterNonCoffe = new AdapterRecyclerMenu(listNonCoffe);
        adapterCoffe = new AdapterRecyclerMenu(listCoffe);
        adapterFrappeCoffe = new AdapterRecyclerMenu(listFrappeCoffe);
        adapterFrappeJuice = new AdapterRecyclerMenu(listFrappeJuice);
        adapterTea = new AdapterRecyclerMenu(listTea);
        adapterFrappeCream = new AdapterRecyclerMenu(listFrappeCream);

        binding.recyclerNonCoffe.setHasFixedSize(true);
        binding.recyclerCoffe.setHasFixedSize(true);
        binding.recyclerFrappeCoffe.setHasFixedSize(true);
        binding.recyclerFrappeJuice.setHasFixedSize(true);
        binding.recyclerTea.setHasFixedSize(true);
        binding.recyclerFrappeCream.setHasFixedSize(true);

        binding.recyclerNonCoffe.setLayoutManager(new GridLayoutManager(mContext, 2));
        binding.recyclerCoffe.setLayoutManager(new GridLayoutManager(mContext, 2));
        binding.recyclerFrappeCoffe.setLayoutManager(new GridLayoutManager(mContext, 2));
        binding.recyclerFrappeJuice.setLayoutManager(new GridLayoutManager(mContext, 2));
        binding.recyclerTea.setLayoutManager(new GridLayoutManager(mContext, 2));
        binding.recyclerFrappeCream.setLayoutManager(new GridLayoutManager(mContext, 2));

        binding.recyclerNonCoffe.setAdapter(adapterNonCoffe);
        binding.recyclerCoffe.setAdapter(adapterCoffe);
        binding.recyclerFrappeCoffe.setAdapter(adapterFrappeCoffe);
        binding.recyclerFrappeJuice.setAdapter(adapterFrappeJuice);
        binding.recyclerTea.setAdapter(adapterTea);
        binding.recyclerFrappeCream.setAdapter(adapterFrappeCream);

        binding.nestedScrollView.setNestedScrollingEnabled(false);
        binding.recyclerCoffe.setNestedScrollingEnabled(false);
        binding.recyclerNonCoffe.setNestedScrollingEnabled(false);
        binding.recyclerFrappeCoffe.setNestedScrollingEnabled(false);
        binding.recyclerFrappeJuice.setNestedScrollingEnabled(false);
        binding.recyclerTea.setNestedScrollingEnabled(false);
        binding.recyclerFrappeCream.setNestedScrollingEnabled(false);
    }

}
