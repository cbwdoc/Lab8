package edu.temple.fragmentlab;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    View canvas;

    public CanvasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_canvas, container, false);
        canvas = (View) layout.findViewById(R.id.fragment_canvas);
        return layout;
    }

    public void changeColor(int color){
        canvas.setBackgroundColor(color);
    }

}
