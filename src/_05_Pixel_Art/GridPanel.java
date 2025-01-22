package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private static final String file = "src/_05_Pixel_Art/saved.dat";
	private static final long serialVersionUID = 1L;
	private int windowWidth;
	private int windowHeight;
	private int pixelWidth;
	private int pixelHeight;
	private int rows;
	private int cols;

	// 1. Create a 2D array of pixels. Do not initialize it yet.
	Pixel[][] pixels;
	private Color color;

	public GridPanel(int w, int h, int r, int c) {
		this.windowWidth = w;
		this.windowHeight = h;
		this.rows = r;
		this.cols = c;

		this.pixelWidth = windowWidth / cols;
		this.pixelHeight = windowHeight / rows;

		color = Color.BLACK;

		setPreferredSize(new Dimension(windowWidth, windowHeight));

		// 2. Initialize the pixel array using the rows and cols variables.
		pixels = new Pixel[rows][cols];

		// pixels = load();
		// HERE HERER HESR EHRER HEH REH REHRREHEHRRE
		// 3. Iterate through the array and initialize each element to a new pixel.
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				pixels[row][col] = new Pixel(col * pixelWidth, row * pixelHeight);
			}
		}
	}

	public void setColor(Color c) {
		color = c;
	}

	public void clickPixel(int mouseX, int mouseY) {
		// 5. Use the mouseX and mouseY variables to change the color
		// of the pixel that was clicked. *HINT* Use the pixel's dimensions.
		int col = mouseX / pixelWidth;
		int row = mouseY / pixelHeight;

		if (col >= 0 && col < cols && row >= 0 && row < rows) {
			pixels[row][col].color = color;
		}
	}

	private static void save(Pixel data) {
		try (FileOutputStream fos = new FileOutputStream(new File(file));
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Pixel load() {
		try (FileInputStream fis = new FileInputStream(new File(file));
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			return (Pixel) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		// 4. Iterate through the array.
		// For every pixel in the list, fill in a rectangle using the pixel's color.
		// Then, use drawRect to add a grid pattern to your display.
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				Pixel pixel = pixels[row][col];
				g.setColor(pixel.color);
				g.fillRect(pixel.x, pixel.y, pixelWidth, pixelHeight);
				g.setColor(Color.BLACK);
				g.drawRect(pixel.x, pixel.y, pixelWidth, pixelHeight);
			}
		}

	}
}
