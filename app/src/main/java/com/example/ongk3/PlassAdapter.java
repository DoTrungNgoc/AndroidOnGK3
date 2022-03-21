package com.example.ongk3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlassAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Plass> list;

    public PlassAdapter(Context context, int idLayout, List<Plass> list) {
        this.context = context;
        this.idLayout = idLayout;
        this.list = list;
    }

    @Override
    public int getCount() {
        if (list!=null && !list.isEmpty())
            return list.size();
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout,parent,false);
        }
        Plass plass = list.get(position);
        TextView name = convertView.findViewById(R.id.textViewName);
        TextView cate = convertView.findViewById(R.id.textViewNameCate);
        TextView price = convertView.findViewById(R.id.textViewNamePrice);
        ImageView img = convertView.findViewById(R.id.imageViewItem);

        if (list!=null && !list.isEmpty()){
            name.setText(plass.getName());
            cate.setText(plass.getCategory());
            price.setText(plass.getPrice());
            img.setImageResource(plass.getImg());
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,ItemDetailActivity.class);
                intent.putExtra("plass",plass);
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}
