package com.shift.shift_android.activity;

import com.shift.shift_android.R;
import com.shift.shift_android.R.id;
import com.shift.shift_android.R.layout;
import com.shift.shift_android.R.menu;
import com.shift.shift_android.data.PostsList;
import com.shift.shift_android.po.Post;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;
public class PostActivity extends Activity {

	private Post curPost;
	private ImageView ivImg;
	private TextView tvPostTitle;
	private TextView tvPostAuthor;
	private TextView tvPostContent;
	private int num;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_Light_NoTitleBar_Fullscreen);

		setContentView(R.layout.activity_post);
		Intent intent = getIntent();
		num = intent.getIntExtra("num", 0);
		
		curPost = PostsList.getCurPost(num);
		ivImg = (ImageView) findViewById(R.id.ivImg);
		tvPostTitle = (TextView) findViewById(R.id.tvPostTitle);
		tvPostAuthor = (TextView) findViewById(R.id.tvPostAuthor);
		tvPostContent = (TextView) findViewById(R.id.tvPostContent);
		
		ivImg.setImageResource(curPost.getImg());
		tvPostTitle.setText(curPost.getTitle());
		tvPostAuthor.setText(curPost.getAuthor());
		tvPostContent.setText(curPost.getAllContent());
		setTitle(curPost.getTitle());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.post, menu);
		return true;
	}

}
