package com.net168.linearlistviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;


public class MainActivity extends Activity {

	private ListView mListView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listview);
        mListView.setAdapter(new TestAdapter());
        findViewById(R.id.btn).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mListView.setVisibility(mListView.getVisibility() ^ (View.GONE + View.VISIBLE));
//		    	 或者如下写法
//		    	if (mListView.getVisibility() == View.VISIBLE)
//		    		mListView.setVisibility(View.GONE);
//		    	else
//		    		mListView.setVisibility(View.VISIBLE);
			}
		});
    }

}
