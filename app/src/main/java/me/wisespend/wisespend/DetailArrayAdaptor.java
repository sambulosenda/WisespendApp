package me.wisespend.wisespend;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import me.wisespend.wisespend.Data.Debtor;

/**
 * Created by ruichaozhang on 14-11-01.
 */
public class DetailArrayAdaptor extends ArrayAdapter<Debtor> {


    private Context context;
    private List<Debtor> objects;

    public DetailArrayAdaptor(Context context, int resource, List<Debtor> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        Debtor debtor = objects.get(position);

        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_list, null);

//        ImageView image = (ImageView) view.findViewById(R.id.ivFlowerImage);
//        image.setImageResource(flower.getImageResource());

        TextView tv = (TextView) view.findViewById(R.id.months_list);
        tv.setText(debtor.getName());

        return view;
    }
}

