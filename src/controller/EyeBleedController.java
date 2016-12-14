package controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class EyeBleedController
{
	private Random rand = new Random();
	private Color lastColor = new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
	private Color color;
public void start()
{
	for(int index = 1; index<=100; index++){
	try
	{
		int width = 1920;
		int height = 1080;
		BufferedImage eyeSore = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		for(int xpos =0; xpos<width;xpos++){
			for(int ypos =0; ypos<height;ypos++){
				int randRed = rand.nextInt(10)-5+lastColor.getRed()/2;
				int randGreen = rand.nextInt(10)-5+lastColor.getGreen()/2;
				int randBlue = rand.nextInt(10)-5+lastColor.getBlue()/2;
			color = new Color(rand.nextInt(randRed),rand.nextInt(randGreen),rand.nextInt(randBlue));
		eyeSore.setRGB(xpos, ypos, color.getRGB());
		lastColor = color;}}
		ImageIO.write(eyeSore, "PNG", new File("/Users/gkun9931/Desktop/Pictures/Cancer"+index+".png"));
		
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}
}}
}
