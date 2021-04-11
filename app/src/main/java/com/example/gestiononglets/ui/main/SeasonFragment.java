package com.example.gestiononglets.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.gestiononglets.R;

public class SeasonFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    // Ils sont distincts pour chaque SeasonFragment instancié
    private int image;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_IMAGE = "image_page";

    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static SeasonFragment newInstance(int image) {
        SeasonFragment fragment = new SeasonFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_IMAGE, image);
        fragment.setArguments(args);
        return fragment;
    }

    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        image = getArguments().getInt(ARG_SECTION_IMAGE, 0);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(image);

        return view;
    }
}
