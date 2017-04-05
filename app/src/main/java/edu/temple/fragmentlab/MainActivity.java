package edu.temple.fragmentlab;

import android.app.Activity;
import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class MainActivity extends Activity implements PaletteFragment.PaletteInterface {

    CanvasFragment canvasFragment;

    boolean hasCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragment(new PaletteFragment(), R.id.frag1);
        canvasFragment = new CanvasFragment();

        hasCanvas = (findViewById(R.id.frag2) != null);
        if (hasCanvas)
            addFragment(canvasFragment, R.id.frag2);
    }


    private void addFragment (Fragment fragment, int containerId){
        getFragmentManager()
                .beginTransaction()
                .replace(containerId, fragment)
                .commit();
    }

    @Override
    public void changeColor(int color) {
        if (hasCanvas)
            canvasFragment.changeColor(color);
        else
            setContentView(R.layout.fragment_canvas);
    }
}
