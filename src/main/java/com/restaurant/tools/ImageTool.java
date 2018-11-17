package com.restaurant.tools;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import org.springframework.stereotype.Controller;

@Controller
///修改此类，让验证码显示 abc--ABC+数字
public class ImageTool {

//存储图片里面的字符串
public String sRand="";

//填充颜色
public Color getRandColor(int fc,int bc){
	Random random = new Random();
	if(fc>255) fc=255;
	if(bc>255) bc=255;
	int r=fc+random.nextInt(bc-fc);
	int g=fc+random.nextInt(bc-fc);
	int b=fc+random.nextInt(bc-fc);
	return new Color(r,g,b);
}

//绘图
public BufferedImage creatImage(){
	
	int width=60, height=20;
	//带缓存的图片对象
	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	//可绘制的图形对象
	Graphics g = image.getGraphics();
	
	Random random = new Random();
	
	g.setColor(getRandColor(200,250));
	g.fillRect(0, 0, width, height);//调节图片大小
	
	g.setFont(new Font("Times New Roman",Font.PLAIN,18));
	for (int i=0;i<155;i++)
	{  //随机生成不同颜色的条纹
		g.setColor(getRandColor(160,200));
		int x = random.nextInt(width);
		int y = random.nextInt(height);
		int xl = random.nextInt(12);
		int yl = random.nextInt(12);
		g.drawLine(x,y,x+xl,y+yl);
	}
	
	sRand = "";		
	for (int i=0;i<4;i++){
		//随机生成图片中的字符串
		String rand=String.valueOf(random.nextInt(10));
		//随机生成字母
//		int index=random.nextInt(26)+65;
//		char ch=(char)index;
//		sRand+=ch;
	    sRand+=rand;
		g.setColor(new Color(20+random.nextInt(110),20+random.nextInt(110),20+random.nextInt(110)));
		g.drawString(rand,13*i+6,16);
	}

	g.dispose();
	return image;//返回图片
}
}