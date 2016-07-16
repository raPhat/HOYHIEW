package th.co.hoyhiew.hoyhiewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by raPhat on 7/16/16 AD.
 */
public class FoodsAdapter extends ArrayAdapter<Food> {

    private Context mContext;
    private int mResource;
    private ArrayList<Food> mObjects;

    public FoodsAdapter(Context context, int resource, ArrayList<Food> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
        mObjects = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(mResource, parent, false);

        TextView foodName = (TextView) convertView.findViewById(R.id.name_text);

        foodName.setText(mObjects.get(position).getName());

        return convertView;
    }

}
