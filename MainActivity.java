package com.example.firstgamee;

import java.io.IOException;

import javax.microedition.khronos.opengles.GL10;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.entity.util.FPSLogger;
import org.anddev.andengine.opengl.texture.Texture;
import org.anddev.andengine.opengl.texture.TextureOptions;
import org.anddev.andengine.opengl.texture.region.TextureRegion;
import org.anddev.andengine.opengl.texture.region.TextureRegionFactory;
import org.anddev.andengine.ui.activity.BaseGameActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.util.Log;

public class MainActivity extends BaseGameActivity {

	
	final int CAMERA_WIDTH = 480;
	final int CAMERA_HEIGHT = 800;
	
	 private Texture mTexture;
	private TextureRegion mFaceTextureRegion;
	
	private Texture mOnScreenControlTexture;
	private TextureRegion mOnScreenControlBase;
	private TextureRegion mOnScreenControlKnob;
	
	@Override
	public Engine onLoadEngine() {
		final Camera camera = new Camera(0, 0, CAMERA_WIDTH,CAMERA_HEIGHT);
		final EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.PORTRAIT,new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), camera);
engineOptions.getTouchOptions().setRunOnUpdateThread(true);
		return new Engine(engineOptions);
	}

	@Override
	public void onLoadResources() {
	
	
	}

	@Override
	public Scene onLoadScene() {
		 this.mEngine.registerUpdateHandler(new FPSLogger());
	        @SuppressWarnings("deprecation")
			final Scene scene = new Scene(2);
	        scene.setBackground(new ColorBackground(0.23f,1,0));
	        return scene;
	    }
	

	@Override
	public void onLoadComplete() {
		// TODO Auto-generated method stub
		
	}

	
}
