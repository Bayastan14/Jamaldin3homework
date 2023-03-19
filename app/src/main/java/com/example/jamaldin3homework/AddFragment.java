package com.example.jamaldin3homework;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class AddFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    view.findViewById(R.id.edit_text3).setOnClickListener(view1 -> {
        AddFragment addFragment = new AddFragment();
        EditText search = view.findViewById(R.id.edit_text);
        EditText search1 = view.findViewById(R.id.edit_text1);
        EditText search2 = view.findViewById(R.id.edit_text2);
        Bundle bundle = new Bundle();
        bundle.putString("key", search.getText().toString());
        addFragment.setArguments(bundle);

        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.second_container, addFragment)
                .commit();

    });

    if (getArguments()!=null){
        String text = getArguments().getString("key");
        Log.e("-------------",text);

        }


    }
}