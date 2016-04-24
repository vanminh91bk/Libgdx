package com.vanminh.demogame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.vanminh.demogame.DemoGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		 cfg.title = "camera";
	      cfg.useGL30 = false;
	      cfg.width = 1280;
	      cfg.height = 720;

		new LwjglApplication(new DemoGame(), cfg);
	}
}
