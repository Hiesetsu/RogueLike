package game.roguelikegdx.level;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;
import game.roguelikegdx.sprites.Atlas;

public class Tile 
{
	private TextureRegion sprite;
	boolean isWall = false;
	public Tile(Type type)
	{
		sprite = Atlas.sprites[type.id];
		if(type == Type.WALL_10)
			isWall = true;
	}
	public Tile(Type type, boolean isWall)
	{
		sprite = Atlas.sprites[type.id];
		this.isWall = true;
	}
	
	public TextureRegion getTexture()
	{
		return sprite;
	}
}
