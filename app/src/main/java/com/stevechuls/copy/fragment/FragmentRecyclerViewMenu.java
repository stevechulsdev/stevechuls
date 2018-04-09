package com.stevechuls.copy.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.stevechuls.copy.R;

import java.util.ArrayList;

/**
 * Created by entermate_ksc on 2018. 4. 9..
 */

public class FragmentRecyclerViewMenu extends Fragment {

    private OnItemSelectedListener listener;

    private FragmentRecyclerViewAdapter mFragmentRecyclerViewAdapter;

//    public static FragmentRecyclerViewMenu getInstance()
//    {
//        FragmentRecyclerViewMenu fragmentRecyclerViewMenu = new FragmentRecyclerViewMenu();
//        return fragmentRecyclerViewMenu;
//    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        ArrayList items = new ArrayList<>();
//        items.add(new FragmentItem().setDrawable(ContextCompat.getDrawable(getContext(), R.drawable.stevechuls)));

//        mFragmentRecyclerViewAdapter = new FragmentRecyclerViewAdapter();
//
//        mFragmentRecyclerViewAdapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.stevechuls), "ksc");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recyclerview, container, false);

//        rootView.setLayoutManager(new LinearLayoutManager(rootView.getContext()));
//        rootView.setAdapter(new FragmentRecyclerViewAdapter(getActivity()));
//        ImageView imageView = (ImageView) rootView.findViewById(R.id.image_view);
//        TextView textView = (TextView) rootView.findViewById(R.id.text_view);
//        imageView.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.stevechuls));
//        textView.setText("ksc");

//        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView mRecyclerView = (RecyclerView)view.findViewById(R.id.fragment_widget_recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(new FragmentRecyclerViewAdapter(getActivity(), mRecyclerView));
        mRecyclerView.setHasFixedSize(true);

        ImageView imageView = (ImageView) view.getRootView().findViewById(R.id.image_view);
        TextView textView = (TextView) view.getRootView().findViewById(R.id.text_view);

        mRecyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

//        mRecyclerView.setAdapter(mFragmentRecyclerViewAdapter);
    }


    public interface  OnItemSelectedListener
    {
        void onItemSelected(int position);
    }

}
