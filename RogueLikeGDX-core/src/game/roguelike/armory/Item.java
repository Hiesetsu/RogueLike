package game.roguelike.armory;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import game.roguelikegdx.data.Type;
import game.roguelikegdx.sprites.Atlas;

public class Item {

	private TextureRegion sprite;
	public Item(Type type)
	{
		sprite = Atlas.sprites[type.id];
	}
	
	public TextureRegion getTexture()
	{
		return sprite;
	}

}
