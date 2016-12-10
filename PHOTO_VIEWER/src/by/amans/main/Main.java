package by.amans.main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {
	private static MainWindow window;
	private static BufferedImage image;
	
	public static void main(String[] args) {
		setWindow(window = new MainWindow(640,480));
	}
	
	
	
	
	static void setImage(URL url){
		try {
			image= ImageIO.read(url);
		} catch (IOException e) {
		}
	}
	static void setImage(File file){
		try {
			image=ImageIO.read(file);
		} catch (IOException e) {
		}
		
	}
	public static void saveImage(File file,String format){
		try {
			ImageIO.write(image,format,file);
		} catch (IOException e) {
		}
	}
	
	
	public static MainWindow getWindow() {
		return window;
	}
	public static void setWindow(MainWindow window) {
		Main.window = window;
	}
	public static BufferedImage getImage() {
		return image;
	}
	public static void setImage(BufferedImage image) {
		Main.image = image;
	}
	

}
