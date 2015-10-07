package game.roguelikegdx.level;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import game.roguelike.armory.Item;
import game.roguelike.bestiary.Entity;
import game.roguelikegdx.RogueLike;
import game.roguelikegdx.data.Type;

public class Level 
{
	public static final int width = 75;
	public static final int height = 30;
	private Tile[][] map= new Tile[75][30];
	private Entity[][] creatures = new Entity[75][30];
	private Item[][] loot = new Item[75][30];
	public static final int t_width = 8;
	public static final int t_height = 16;
	
	
	public Level()
	{
		MapUtils.makeRoom(0, 0, 11, 6, this);
		MapUtils.makeRoom(11, 3, 6, 1, this);
		MapUtils.makeRoom(17, 2, 9, 5, this);
		MapUtils.makeRoom(20, 7, 1, 5, this);
		MapUtils.makeRoom(12, 12, 16, 8, this);
		MapUtils.placePlayer(5, 3, this);
		MapUtils.alignWalls(this, map);
	}
	
	public void render(SpriteBatch batch)
	{
		int i = 0;
		int j = 0;
		for(Tile[] t:map)
		{
			i++;
			j=0;
			//System.out.println("I:"+i);
			for(Tile elem: t)
			{
				j++;
				if(elem != null)
					batch.draw(elem.getTexture(), i*t_width-3, (RogueLike.HEIGHT-30*t_height-5)+(30-j)*t_height);
				//System.out.println("J:"+j);
			}
		}
		i = 0;
		for(Entity[] t:creatures)
		{
			i++;
			j=0;
			//System.out.println("I:"+i);
			for(Entity elem: t)
			{
				j++;
				if(elem != null)
					batch.draw(elem.getTexture(), i*t_width-3, (RogueLike.HEIGHT-30*t_height-5)+(30-j)*t_height);
				//System.out.println("J:"+j);
			}
		}
		i = 0;
		for(Item[] t:loot)
		{
			i++;
			j=0;
			//System.out.println("I:"+i);
			for(Item elem: t)
			{
				j++;
				if(elem != null)
					batch.draw(elem.getTexture(), i*t_width-3, (RogueLike.HEIGHT-30*t_height-5)+(30-j)*t_height);
				//System.out.println("J:"+j);
			}
		}
		i = 0;
	}
	
	public void addTile(int x, int y, Type type)
	{
		map[x][y] = new Tile(type);
	}
	public void addTile(int x, int y, Type type, boolean isWall)
	{
		map[x][y] = new Tile(type, isWall);
	}
	public void delTile(int x, int y)
	{
		map[x][y] = null;
	}
	
	public void addEntity(int x, int y, Type type)
	{
		creatures[x][y] = new Entity(type);
	}
	
	public void addItem(int x, int y, Type type)
	{
		loot[x][y] = new Item(type);
	}
}
