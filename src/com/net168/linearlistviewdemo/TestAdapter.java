package com.net168.linearlistviewdemo;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TestAdapter extends BaseAdapter {

	@Override
	public int getCount() {
		return 50;
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = new TextView(parent.getContext());
		}
		((TextView)convertView).setText("item " + position);
		return convertView;
	}

}
