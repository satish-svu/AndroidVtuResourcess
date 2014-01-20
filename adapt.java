package com.example.vturesources;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class adapterclass extends BaseAdapter
{
	 private LayoutInflater mInflater;
	  Context c;
	  private ArrayList<String> AL_id_text = new ArrayList<String>();
	  
	  public adapterclass(Context c, ArrayList<String> AL_name_time)
	  {
		  mInflater = LayoutInflater.from(c);
		  this.AL_id_text = AL_name_time;
	  }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return AL_id_text.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return AL_id_text.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		 final ViewHolder holder;
		 if (convertView == null)
	        {
	            convertView = mInflater.inflate(R.layout.data_item, null);
	            holder = new ViewHolder();

	            holder.txt_maintext = (TextView) convertView
	                    .findViewById(R.id.txt1);
	          /*  holder.txt_mtext = (TextView) convertView
	                    .findViewById(R.id.txt_mtext);*/

	            convertView.setTag(holder);
	        } else
	        {
	            holder = (ViewHolder) convertView.getTag();
	        }

	        holder.txt_maintext.setText(AL_id_text.get(position));
	       // holder.txt_mtext.setText(AL_text.get(position));

	        return convertView;
	    }

		//return null;
	}
	  

class ViewHolder {
    TextView txt_maintext;
    
}
