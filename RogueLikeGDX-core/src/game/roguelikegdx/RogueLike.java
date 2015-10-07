package game.roguelikegdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import game.roguelikegdx.level.Level;
import game.roguelikegdx.level.MapUtils;
import game.roguelikegdx.sprites.Atlas;

public class RogueLike extends ApplicationAdapter {
	public static final int WIDTH = 1024;
	public static final int HEIGHT = 768;
	
	SpriteBatch batch;
	Texture img;
	Camera camera;
	Level map;
	int margin = 5;
	int consoleMargin = 9;
	int infoMargin = 8;
	
	@Override
	public void create () 
	{
		Gdx.graphics.setDisplayMode(WIDTH, HEIGHT, false);
		Gdx.graphics.setTitle("Rogue Like");
		batch = new SpriteBatch();
		img = new Texture("BG.png");
		Atlas.init();
		map = new Level();
		//MapUtils.makeRoom(3, 3, 6, 5, map);
		//camera = new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
	}

	@Override
	public void render () 
	{
		batch.begin();
		batch.draw(img, 0, 0);
		map.render(batch);
		batch.end();
	}
}
