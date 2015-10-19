package game.roguelikegdx.level;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;
import game.roguelikegdx.sprites.Atlas;

public class Tile extends Renderable
{
	boolean isWall = false;
	public Tile(Type type)
	{
		super(type);
		if(type == Type.WALL_10)
			isWall = true;
	}
	public Tile(Type type, Color color)
	{
		super(type, color);
		if(type == Type.WALL_10)
			isWall = true;
	}
	public Tile(Type type, boolean isWall)
	{
		super(type);
		this.isWall = true;
	}
	
}
