package com.stubborn.firebaseaddfetchdata;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter extends ArrayAdapter<DataClass> {


    Activity activity;
    List<DataClass> list;

    public Adapter(Activity activity, List<DataClass> list) {
        super(activity, R.layout.design_layout, list);
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = activity.getLayoutInflater();
        convertView = layoutInflater.inflate(R.layout.design_layout, null, true);

        TextView id = convertView.findViewById(R.id.id_id);
        TextView name = convertView.findViewById(R.id.id_name);
        TextView email = convertView.findViewById(R.id.id_email);
        TextView contact = convertView.findViewById(R.id.id_contacts);

        DataClass model = list.get(position);

        id.setText(model.getId());
        name.setText(model.getName());
        email.setText(model.getEmail());
        contact.setText(model.getContact());

        return convertView;
    }
}
