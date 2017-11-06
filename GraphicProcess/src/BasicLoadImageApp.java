import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class BasicLoadImageApp extends Component{
	static BufferedImage img;
	@Override
	public void paint(Graphics g) {
		g.drawImage(img,0,0, null);
	}
	public static void main(String[] args) throws IOException{
		
		File f = null;
		//read img
		try {
			f = new File("D:\\image\\wallpaper\\google-now-wallpaper-2.png");
			img = ImageIO.read(f);
		} catch (IOException e) {
			System.out.println(e);
		}
		int width = img.getWidth();
		int height = img .getHeight();
		try {
			f = new File("D:\\Out.png");
			ImageIO.write(img, "png", f);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		JFrame frame = new JFrame("Load Image");
		frame.addWindowListener(new WindowAdapter() {
			@Override 
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		System.out.println(width +"x"+height);
		frame.add(new BasicLoadImageApp());
		frame.setSize(400,500);
		frame.setVisible(true);
	
	}
}