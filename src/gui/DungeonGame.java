package gui;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import entities.Red;
import entities.SmallPutty;
import map.Room;

public class DungeonGame extends Game
{
	private SpriteBatch _batch;
	public static final int TEXTURE_SIZE = 32;
	Screen _currentScreen;
	private BitmapFont _font;
	
	/*
	 * Run when the game is first started.
	 */
	public void create ()
	{
		_batch = new SpriteBatch();
		_font = new BitmapFont();
		Room._wallTexture = new Texture("wallTexture.png");
		Room._floorTexture = new Texture("floorTexture.png");
		BattleScreen._battleBackground = new Texture("battleBackground.png");
		Red._redRangerTexture = new Texture("redRangerTexture.png");
		SmallPutty._smallPuttyTexture = new Texture("puttyTexture.png");
		_currentScreen = new MainMenuScreen(this);
		setScreen(_currentScreen);
    }

    public void render ()
    {
    	super.render();
    }

    public void resize (int width, int height)
    {
    	_currentScreen.resize(width, height);
    }

    public void pause ()
    {
    	
    }

    public void resume ()
    {
    	
    }

    /*
     * Run when the game is closed
     */
    public void dispose ()
    {
    	_batch.dispose();
    	_font.dispose();
    }
    
    public void switchScreens(A_GameScreen screen)
    {
    	_currentScreen.pause();
    	_currentScreen = screen;
    	setScreen(_currentScreen);
    	_currentScreen.resume();
    }
    
    public Screen getCurrentScreen()
    {
    	return _currentScreen;
    }
    
    public SpriteBatch getBatch()
    {
    	return _batch;
    }
}
