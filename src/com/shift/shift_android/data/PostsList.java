package com.shift.shift_android.data;

import java.util.ArrayList;
import java.util.List;

import com.shift.shift_android.R;
import com.shift.shift_android.po.Post;

public class PostsList {
	public static List<Post> posts=new ArrayList<Post>();
	
	static {
		// TODO Auto-generated constructor stub
		PostsList.addPost(new Post("我和总裁同居的日子","白洁",0,"哈哈哈哈啊哈哈哈啊哈哈哈哈哈哈哈啊哈",R.drawable.pic1));
		PostsList.addPost(new Post("月子","宋丹丹",1,"马上就出月子2了",R.drawable.pic2));		
		PostsList.addPost(new Post("西游记之当我们走到女儿国","陈三藏",2,"女儿国国王貌美如花",R.drawable.pic3));
		PostsList.addPost(new Post("明哲奇遇记","肖尧",3,"有一天，明哲走在路上然后看见了哈哈哈啊哈哈哈哈哈哈哈哈啊哈哈哈啊哈哈哈哈哈啊哈哈哈哈尔滨啤酒哈哈哈哈哈啊哈哈哈哈然后他就喝了哈哈哈哈哈哈",R.drawable.pic4));
		PostsList.addPost(new Post("有一天","啥？",4,"我发现自怜资格都已没有，只剩下哈哈哈哈哈哈哈哈哈。",R.drawable.pic6));
		PostsList.addPost(new Post("倾国之美，爱恨北印","Gchang郭大喵",5,"Incredible India!离开天堂一样的克什米尔,我们在印度的最后一个月，进入了大部分中国背包客熟悉的北印度：  从北部山区南下，路过达赖喇嘛住的达兰萨拉、锡克教圣地阿姆利则。然后以帝都德里为中心，向西走拉贾斯坦四色城，围观土邦王公们奢华的城堡。然后一路向东，先参观闻名遐迩的泰姬陵、性爱神庙；再去恒河圣地泛舟，看信徒们在漂着尸体的河里沐浴、超帅的婆罗门祭司在河边夜祭焚尸；到佛陀证悟的菩提树朝圣；最后去加尔各答看看英国殖民时期的印度旧都，到特蕾莎嬷嬷的“垂死之家”做义工。",R.drawable.pic5));
		
	}
	public static List<Post> addPost(Post post){
		posts.add(post);
		return posts;	
	}
	public static Post getCurPost(int i ){
		return posts.get(i);
	}
	public static List<Post> getAllPosts(){
		return posts;
	}

}
