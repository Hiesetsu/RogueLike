package game.roguelike.bestiary;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;
import game.roguelikegdx.level.Renderable;
import game.roguelikegdx.sprites.Atlas;

public class Entity extends Renderable
{

	public Entity(Type type) 
	{
		super(type);
	}
	public Entity(Type type, Color color)
	{
		super(type, color);
	}
}
