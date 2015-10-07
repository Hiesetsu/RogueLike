package game.roguelikegdx.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;

public class Atlas 
{
	private static Texture texture;
	static public TextureRegion[] sprites = new TextureRegion[Type.values().length];
	
	static public Atlas atlas;
	private static boolean initialized = false;
	
	public static int width = 8;
	public static int height = 16;
	
	private Atlas()
	{
		
	}
	
	public static void init()
	{
		if(!initialized)
		{
			texture = new Texture("atlas.png");
			for(Type sprite: Type.values())
			{
				loadSprite(sprite);
			}
		}
		initialized = true;
	}
	
	public boolean isInitialized()
	{
		return initialized;
	}
	
	private static void loadSprite(Type sprite)
	{
		if(texture != null)
			sprites[sprite.id] = 
				new TextureRegion(texture, 
						width*sprite.col, 
						height*sprite.row, 
						width, 
						height);
	}
	
}
