package com.stevechuls.copy;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by entermate_ksc on 2018. 4. 6..
 */

public class FragmentMenu extends Fragment {

    private ListAdapter mListAdapter;
    private OnItemSelectedListener listener;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mListAdapter = new ListAdapter();
        for(int i=0; i<15; i++)
        {
            mListAdapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.stevechuls), "ksc_" + i);
        }
    }

    // Layout을 inflater하여 View 작업을 하는 곳
   @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//       View view = inflater.inflate(R.layout.fragment_main, container, false);

        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        ListView mListView = (ListView)view.findViewById(R.id.fragment_list_view);

//        if(mListAdapter == null)
//        {
//            for(int i=0; i<15; i++)
//            {
//                mListAdapter.addItem(ContextCompat.getDrawable(getContext(), R.drawable.stevechuls), "ksc_" + i);
//            }
//        }

        mListView.setAdapter(mListAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                listener.onItemSelected(position);
            }
        });
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof OnItemSelectedListener)
        {
            this.listener = (OnItemSelectedListener) context;
        }
        else
        {
            throw new ClassCastException(context.toString() + "must implement FragmentMenu.OnItemSelectedListener");
        }
    }

    public interface  OnItemSelectedListener
    {
        void onItemSelected(int position);
    }
}
