package game.roguelikegdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;

import game.roguelikegdx.level.Level;
import game.roguelikegdx.sprites.Atlas;

public class RogueLike extends ApplicationAdapter {
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	private ShaderProgram shader;
	
	SpriteBatch batch;
	Texture img;
	Camera camera;
	Level level;
	int margin = 5;
	int consoleMargin = 9;
	int infoMargin = 8;
	
	@Override
	public void create () 
	{
		Gdx.graphics.setDisplayMode(WIDTH, HEIGHT, false);
		Gdx.graphics.setTitle("Rogue Like");
		ShaderProgram.pedantic = false;
		//shader = new ShaderProgram(Gdx.files.internal("shaders/color.vsh"), Gdx.files.internal("shaders/color.fsh"));
		batch = new SpriteBatch();
		//batch.setShader(shader);
		img = new Texture("BG.png");
		Atlas.init();
		level = new Level();
		//MapUtils.makeRoom(3, 3, 6, 5, map);
		//camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
	}

	@Override
	public void render () 
	{
		update();
		batch.begin();
		batch.draw(img, 0, 0);
		level.render(batch);
		batch.end();
	}
	
	public void update()
	{
		level.update();
	}
}
