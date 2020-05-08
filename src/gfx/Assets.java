package gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 0;
	
	public static BufferedImage rock, lavaRock, tree, snowTile1, snowTile2, snowTile3, snowTile4, snowTile5;
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	
	//UI
	public static BufferedImage[] button_play, button_settings, button_exit, share, facebook, google;
	public static BufferedImage background, settings;
	
	public static void innit() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Player.png"));
		
		//UI
		background = ImageLoader.loadImage("/GUI/background.jpg");
		settings = ImageLoader.loadImage("/GUI/settings.png");
		
		button_play = new BufferedImage[2];
		button_play[0] = ImageLoader.loadImage("/GUI/button_play0.png");
		button_play[1] = ImageLoader.loadImage("/GUI/button_play1.png");
		
		button_settings = new BufferedImage[2];
		button_settings[0] = ImageLoader.loadImage("/GUI/button_settings0.png");
		button_settings[1] = ImageLoader.loadImage("/GUI/button_settings1.png");
		
		button_exit = new BufferedImage[2];
		button_exit[0] = ImageLoader.loadImage("/GUI/button_exit0.png");
		button_exit[1] = ImageLoader.loadImage("/GUI/button_exit1.png");
		
		share = new BufferedImage[2];
		share[0] = ImageLoader.loadImage("/GUI/share0.png");
		share[1] = ImageLoader.loadImage("/GUI/share1.png");
		
		facebook = new BufferedImage[2];
		facebook[0] = ImageLoader.loadImage("/GUI/facebook0.png");
		facebook[1] = ImageLoader.loadImage("/GUI/facebook1.png");
		
		google = new BufferedImage[2];
		google[0] = ImageLoader.loadImage("/GUI/google0.png");
		google[1] = ImageLoader.loadImage("/GUI/google1.png");
		
		player_down = new BufferedImage[4];
		player_down[0] = sheet.crop(0, 0, 100, 150);
		player_down[1] = sheet.crop(100, 0, 100, 150);
		player_down[2] = sheet.crop(200, 0, 100, 150);
		player_down[3] = sheet.crop(300, 0, 100, 150);
		
		player_up = new BufferedImage[4];
		player_up[0] = sheet.crop(0, 150, 100, 150);
		player_up[1] = sheet.crop(100, 150, 100, 150);
		player_up[2] = sheet.crop(200, 150, 100, 150);
		player_up[3] = sheet.crop(300, 150, 100, 150);

		player_left = new BufferedImage[4];
		player_left[0] = sheet.crop(0, 300, 100, 150);
		player_left[1] = sheet.crop(100, 300, 100, 150);
		player_left[2] = sheet.crop(200, 300, 100, 150);
		player_left[3] = sheet.crop(300, 300, 100, 150);
		
		player_right = new BufferedImage[4];
		player_right[0] = sheet.crop(0, 450, 100, 150);
		player_right[1] = sheet.crop(100, 450, 100, 150);
		player_right[2] = sheet.crop(200, 450, 100, 150);
		player_right[3] = sheet.crop(300, 450, 100, 150);
		
		rock = ImageLoader.loadImage("/textures/Rock1.png");
		lavaRock = ImageLoader.loadImage("/textures/LavaRock.png");
		tree = ImageLoader.loadImage("/textures/tree.png");
		snowTile1 = ImageLoader.loadImage("/textures/SnowTile1.png");
		snowTile2 = ImageLoader.loadImage("/textures/SnowTile2.png");
		snowTile3 = ImageLoader.loadImage("/textures/SnowTile3.png");
		snowTile4 = ImageLoader.loadImage("/textures/SnowTile4.png");
		snowTile5 = ImageLoader.loadImage("/textures/SnowTile5.png");
	}

}
