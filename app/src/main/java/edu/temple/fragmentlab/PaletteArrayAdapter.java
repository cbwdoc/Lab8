package edu.temple.fragmentlab;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Casey on 2/8/2017.
 */

public class PaletteArrayAdapter extends ArrayAdapter {

    Resources res = this.getContext().getResources();
    String[] colorLabels = res.getStringArray(R.array.color_labels_array);

    public PaletteArrayAdapter(Context context, int resource) {
        super(context, resource);
    }

    public PaletteArrayAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public PaletteArrayAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
    }

    public PaletteArrayAdapter(Context context, int resource, int textViewResourceId, Object[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public PaletteArrayAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
    }

    public PaletteArrayAdapter(Context context, int resource, int textViewResourceId, List objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        View view = super.getDropDownView(position, convertView, parent);
        TextView tv = (TextView) view;

        // Set the Text color
        tv.setBackgroundColor(Color.parseColor((String) this.getItem(position)));
        tv.setText(colorLabels[position]);
        if ((position > 1 && position < 4) || position == 8 || position > 9)
            tv.setTextColor(Color.parseColor("WHITE"));
        else
            tv.setTextColor(Color.parseColor("BLACK"));

        return view;
    }

}