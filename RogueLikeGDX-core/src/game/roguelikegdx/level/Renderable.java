package game.roguelikegdx.level;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;
import game.roguelikegdx.sprites.Atlas;

public class Renderable 
{
	private TextureRegion sprite;
	private Type type;
	private Color color = new Color(1,1,1,1);
	public Renderable(Type type)
	{
		sprite = Atlas.sprites[type.id];
		this.type = type;
	}
	
	public Renderable(Type type, Color color)
	{
		sprite = Atlas.sprites[type.id];
		this.type = type;
		this.color = color;
	}
	
	public TextureRegion getTexture()
	{
		return sprite;
	}
	public Type getType()
	{
		return type;
	}
	public Color getColor()
	{
		return color;
	}
	public void setColor(Color c)
	{
		color = c;
	}
}
