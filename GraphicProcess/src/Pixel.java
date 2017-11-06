import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Pixel {
	BufferedImage image;
	int width;
	int height;
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
	public Pixel() {
		try {
			File input = new File("D:\\image\\wallpaper\\google-now-wallpaper-2.png");
			image = ImageIO.read(input);
			height = image.getHeight();
			width = image.getWidth();
			int count = 0;
			for(int i=0; i<height; i++) { 
				for( int j=0; j<width; j++){ 
					count++;
					Color c = new Color(image.getRGB(j, i));
					System.out.println("S.No: " + count + " Red: " + c.getRed() +
					" Green: " + c.getGreen() + " Blue: " + c.getBlue());
				}
			}
		} catch (Exception e) {}
	}
	static public void main(String args[]) throws Exception {
	Pixel obj = new Pixel();
	}
}
