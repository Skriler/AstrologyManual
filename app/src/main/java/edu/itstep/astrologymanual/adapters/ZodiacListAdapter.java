package edu.itstep.astrologymanual.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import edu.itstep.astrologymanual.R;

public class ZodiacListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;

    ArrayList<String> titles;
    ArrayList<Integer> images;

    public ZodiacListAdapter(Context context, ArrayList<String> titles, ArrayList<Integer> images) {
        this.context = context;
        this.titles = titles;
        this.images = images;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.custom_grid_item, null);

        ImageView imgItem = convertView.findViewById(R.id.imgItem);
        TextView tvItemTitle = convertView.findViewById(R.id.tvItemTitle);

        imgItem.setImageResource(images.get(position));
        tvItemTitle.setText(titles.get(position));

        return convertView;
    }
}
