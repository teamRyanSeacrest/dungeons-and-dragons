package gui;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import entities.BigPutty;
import entities.Black;
import entities.Blue;
import entities.Goldar;
import entities.IvanOoze;
import entities.Lipsyncher;
import entities.LordZed;
import entities.Pink;
import entities.Red;
import entities.Rita;
import entities.Rito;
import entities.SmallPutty;
import entities.Thrax;
import entities.White;
import entities.Yellow;
import map.Room;

public class DungeonGame extends Game
{
	private SpriteBatch _batch;
	public static final int TEXTURE_SIZE = 32;
	Screen _currentScreen;
	private BitmapFont _font;
	Music _currentMusic;
	
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
		// Load Ranger Textures
		Red._redRangerTexture = new Texture("redRangerTexture.png");
		Blue._blueRangerTexture = new Texture("blueRangerTexture.png");
		Black._blackRangerTexture = new Texture("blackRangerTexture.png");
		Pink._pinkRangerTexture = new Texture("pinkRangerTexture.png");
		White._whiteRangerTexture = new Texture("whiteRangerTexture.png");
		Yellow._yellowRangerTexture = new Texture("yellowRangerTexture.png");
		// Load villain Textures
		Goldar._goldarTexture = new Texture("goldarTexture.png");
		IvanOoze._ivanOozeTexture = new Texture("ivanOozeTexture.png");
		LordZed._lordZedTexture = new Texture("lordZeddTexture.png");
		Lipsyncher._lipsyncherTexture = new Texture("lipsyncherTexture.png");
		Rita._ritaTexture = new Texture("ritaTexture.png");
		Thrax._thraxTexture = new Texture("thraxTexture.png");
		Rito._ritoTexture = new Texture("ritoTexture.png");
		BigPutty._bigPuttyTexture = new Texture("bigPuttyTexture.png");
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
    	if (_currentMusic != null)
    	{
    		_currentMusic.dispose();
    	}
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
    
    public void playMusic(Music music, boolean loop)
    {
    	if (_currentMusic != null)
    	{
    		_currentMusic.stop();
    	}
    	
    	_currentMusic = music;
    	_currentMusic.setLooping(loop);
    	_currentMusic.play();
    }
}
