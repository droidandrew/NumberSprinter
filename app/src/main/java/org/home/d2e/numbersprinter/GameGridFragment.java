package org.home.d2e.numbersprinter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import org.home.d2e.numbersprinter.Core.Person;
import org.home.d2e.numbersprinter.adapter.MyFieldAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GameGridFragment extends Fragment {
    private final String TAG = "TAG_GameGridFragment ";
    private GridView gvGameField;
    private List<Integer> gameFields;
    private int gameField;

    public GameGridFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment_game_grid, container, false);
    }




    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG, "onAttach");
        gameFields = new ArrayList<>();
        for (int i = 1; i <26 ; i++) {
            gameFields.add(i);
        }
        Collections.shuffle(gameFields);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "onViewCreated");

        gvGameField= (GridView) view.findViewById(R.id.gvGameField);
        gvGameField.setAdapter(new MyFieldAdapter(view.getContext(),gameFields));
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");

    }




}
