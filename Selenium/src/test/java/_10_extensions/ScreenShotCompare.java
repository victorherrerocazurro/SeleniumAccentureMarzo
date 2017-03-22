package _10_extensions;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.File;

import _10_extensions.ScreenShotCompare.Result;

public class ScreenShotCompare {

	public static void main(String[] args) {
		Result compareImage = CompareImage("src/test/resources/checkBox_before.png", "src/test/resources/checkBox_before_actual.png");
		
		System.out.println(compareImage);
	}
	
	public enum Result {
	       Matched, SizeMismatch, PixelMismatch
	};
	
	public static Result CompareImage(File baseFile, File actualFile) {
		return CompareImage(baseFile.getPath(), actualFile.getPath());
	}
	
	public static Result CompareImage(String baseFile, String actualFile) {
		
		
		Result compareResult = Result.PixelMismatch;
		Image baseImage = Toolkit.getDefaultToolkit().getImage(baseFile);
		Image actualImage = Toolkit.getDefaultToolkit().getImage(actualFile);
			       
		try {
			
			//Imagen, X origen, Y origen, ancho (-1 es todo el tamaño), alto (-1 es todo el tamaño), convertir colores RGB
			PixelGrabber baseImageGrab = new PixelGrabber(baseImage, 0, 0, -1, -1, false);
			PixelGrabber actualImageGrab = new PixelGrabber(actualImage,0, 0, -1, -1, false);
			int[] baseImageData = null;
			int[] actualImageData = null;
			
			if (baseImageGrab.grabPixels()) {
				int width = baseImageGrab.getWidth();
			    int height = baseImageGrab.getHeight();
			    baseImageData = new int[width * height];
			    baseImageData = (int[]) baseImageGrab.getPixels();
			}
			         
			if (actualImageGrab.grabPixels()) {
				int width = actualImageGrab.getWidth();
			    int height = actualImageGrab.getHeight();
			    actualImageData = new int[width * height];
			    actualImageData = (int[]) actualImageGrab.getPixels();
			}
			         
			if ((baseImageGrab.getHeight() != actualImageGrab.getHeight()) ||
			   (baseImageGrab.getWidth() != actualImageGrab.getWidth()))
			        		          
			    compareResult = Result.SizeMismatch;
			else if (java.util.Arrays.equals(baseImageData, actualImageData))
				compareResult = Result.Matched;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return compareResult;
	}
}
