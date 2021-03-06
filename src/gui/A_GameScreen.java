package gui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/*
 * The game is separated into different "screens". An example would be the screen for character select
 * or the screen for playing the game. Each screen has many similarities such as needing to render
 * and process input, however the logic and variables needed for that section of the game may differ.
 */
public abstract class A_GameScreen implements Screen
{
	protected InputHandler _inputHandler;
	protected InputMultiplexer _multiplexer;
	protected OrthographicCamera _camera;
	protected DungeonGame _game;
	protected Stage _stage;
	protected Skin _skin;
	protected Viewport _uiViewport;
	
	public A_GameScreen(DungeonGame game)
	{
		_game = game;
		_camera = new OrthographicCamera(30, 30 * (800 / 600));
		_camera.position.set(0,0,0);
		_camera.zoom = 30;
		_camera.update();
		
		_uiViewport = new StretchViewport(800, 600);
		
		_inputHandler = new InputHandler(this);
		_multiplexer = new InputMultiplexer();
		_stage = new Stage();
		_stage.setViewport(_uiViewport);
		Gdx.input.setInputProcessor(_multiplexer);
		_multiplexer.addProcessor(_stage);
		_multiplexer.addProcessor(_inputHandler);
		
		_skin = new Skin(Gdx.files.internal("uiskin.json"));
	}

	public void render(float delta)
	{
		_camera.update();
    	_game.getBatch().setProjectionMatrix(_camera.combined);
    	_inputHandler.update();
    	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	public void resize(int width, int height)
	{
		_camera.viewportWidth = 30f;
        _camera.viewportHeight = 30f * (width / height);
        _camera.update();
        
        _stage.getViewport().update(width, height, true);
	}
	
	public void dispose()
	{
		_stage.dispose();
		_skin.dispose();
	}

	public void hide()
	{
		
	}

	public void pause()
	{
		
	}

	public void resume()
	{
		_inputHandler = new InputHandler(this);
		_multiplexer = new InputMultiplexer();
		Gdx.input.setInputProcessor(_multiplexer);
		_multiplexer.addProcessor(_stage);
		_multiplexer.addProcessor(_inputHandler);
	}

	public void show()
	{
		
	}
	
	public OrthographicCamera getCamera()
    {
    	return _camera;
    }
	
	public void click(int mouseX, int mouseY)
	{
		
	}
}
