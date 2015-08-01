package com.shift.shift_android.adapter;

import java.util.List;

import com.shift.shift_android.R;
import com.shift.shift_android.po.Post;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PostAdapter extends BaseAdapter {

	private Context ctx;
	private List<Post> posts;
	
	public PostAdapter(Context ctx,List<Post> posts) {
		// TODO Auto-generated constructor stub
		this.ctx = ctx;
		this.posts = posts;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return posts.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return posts.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		if(arg1 == null){
			arg1 = LayoutInflater.from(ctx).inflate(R.layout.ivpost_item, null);
		}
		ImageView ivIllorstrate = (ImageView) arg1.findViewById(R.id.ivIllorstrate);
		TextView tvAuthor = (TextView) arg1.findViewById(R.id.tvAuthor);
		TextView tvTitle = (TextView) arg1.findViewById(R.id.tvTitle);
		TextView tvContent = (TextView) arg1.findViewById(R.id.tvContent);
		ivIllorstrate.setImageResource(posts.get(arg0).getImg());
		tvAuthor.setText(posts.get(arg0).getAuthor());
		tvTitle.setText(posts.get(arg0).getTitle());
		tvContent.setText(posts.get(arg0).getContent());
		
		return arg1;
	}

}
