package com.stevechuls.copy.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stevechuls.copy.R;

import java.util.ArrayList;

/**
 * Created by entermate_ksc on 2018. 4. 9..
 */

public class FragmentRecyclerViewMenu extends Fragment {

    private OnItemSelectedListener listener;

    private FragmentRecyclerViewAdapter mFragmentRecyclerViewAdapter;

    public FragmentRecyclerViewMenu()
    {

    }

    public static FragmentRecyclerViewMenu getInstance()
    {
        FragmentRecyclerViewMenu fragmentRecyclerViewMenu = new FragmentRecyclerViewMenu();
        return fragmentRecyclerViewMenu;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ArrayList items = new ArrayList<>();
//        items.add(new FragmentItem().setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.stevechuls)));

        mFragmentRecyclerViewAdapter = new FragmentRecyclerViewAdapter();

        mFragmentRecyclerViewAdapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.stevechuls), "ksc");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        return inflater.inflate(R.layout.fragment_recyclerview, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView mRecyclerView = (RecyclerView)view.findViewById(R.id.fragment_widget_recyclerview);
        mRecyclerView.setAdapter(mFragmentRecyclerViewAdapter);
    }


    public interface  OnItemSelectedListener
    {
        void onItemSelected(int position);
    }

}
