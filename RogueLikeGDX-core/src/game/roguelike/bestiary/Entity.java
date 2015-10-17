package game.roguelike.bestiary;

import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;
import game.roguelikegdx.sprites.Atlas;

public class Entity {

	private TextureRegion sprite;
	public Entity(Type type)
	{
		sprite = Atlas.sprites[type.id];
	}
	
	public TextureRegion getTexture()
	{
		return sprite;
	}

}
