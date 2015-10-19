package game.roguelike.armory;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;
import game.roguelikegdx.level.Renderable;
import game.roguelikegdx.sprites.Atlas;

public class Item extends Renderable
{
	public Item(Type type) 
	{
		super(type);
	}
	public Item(Type type, Color color)
	{
		super(type, color);
	}
}
