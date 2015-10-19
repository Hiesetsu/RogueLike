package game.roguelikegdx.level;

import com.badlogic.gdx.graphics.Color;

import game.roguelikegdx.RogueLike;
import game.roguelikegdx.data.Type;

public class MapUtils 
{
	
	public final static int NORTH = 2;
	public final static  int EAST = 4;
	public final static int SOUTH = 8;
	public final static int WEST = 16;
	
	private MapUtils(){}
	
	public static void makeRoom(int x, int y, int width, int height, Level map)
	{
		for(int i = x; i<x+width; i++)
		{
			for(int j = y; j<y+height; j++)
			{
				if(i==x || i==x+width-1 || j==y || j==y+height-1)
				{
					map.addTile(i, j, Type.WALL_10);
				}
				else
					map.addEntity(i, j, Type.FLOOR);
			}
		}
	}
	
	public static void alignWalls(Level level, Tile[][] map)
	{
		//Neighbors
		int n = 0;
		for(int i = 0; i< Level.width-1; i++)
		{
			for(int j = 0; j< Level.height-1; j++)
			{
					if(map[i][j] !=null && map[i][j].isWall)
					{
					if(i != 0)
					{
						if(map[i-1][j]!=null && map[i-1][j].isWall)
							n+=WEST;
					}
					if(i != Level.width-1)
					{
						if(map[i+1][j]!=null && map[i+1][j].isWall)
							n+=EAST;
					}
					
					if(j != 0)
					{
						if(map[i][j-1]!=null && map[i][j-1].isWall)
							n+=NORTH;
					}
					if(j != Level.height-1)
					{
						if(map[i][j+1]!=null && map[i][j+1].isWall)
							n+=SOUTH;
					}
					switch(n)
					{
						case 6:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_0, true);
							break;
						case 10:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_1, true);			
							break;
						case 12:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_2, true);
							break;
						case 14:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_3, true);
							break;
						case 18:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_4, true);
							break;
						case 20:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_5, true);
							break;
						case 22:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_6, true);
							break;
						case 24:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_7, true);
							break;
						case 26:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_8, true);
							break;
						case 28:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_9, true);
							break;
						case 30:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_10, true);
							break;
						default:
							level.delTile(i, j);
							level.addTile(i, j, Type.WALL_10, true);
							System.out.println(n);
							break;
					}
					n = 0;
				}
			}
		}
	}
	
	public static void placePlayer(int x, int y, Level level)
	{
		level.addEntity(x, y, Type.PLAYER, Color.GOLD);
	}
}
