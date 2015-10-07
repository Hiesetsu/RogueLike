package game.roguelikegdx.data;

public enum Type 
{
	/*ENTITIES*/
	PLAYER(4, 0, 0), 
	RAT(1, 0, 3), BAT(0, 0, 4), 
	
	WEAPON_M(2, 0, 1), WEAPON_R(3, 0, 2),
	
	FLOOR(10, 0, 5), DOWN_STAIR(5, 0, 6), UP_STAIR(6, 0, 7), 
	DOOR_CLOSED_OLD(7, 0, 8), DOOR_CLOSED_DIAG(8, 0, 9), DOOR_CLOSED_VERT(9, 0, 10), 
	
	/*U, R*/WALL_0(0, 1, 11), /*U, D*/WALL_1(1, 1, 12), /*D, R*/WALL_2(2, 1, 13), /*U, D, R*/WALL_3(3, 1, 14), 
	/*U, L*/WALL_4(4, 1, 15), /*L, R*/WALL_5(5, 1, 16), /*U, L, R*/WALL_6(6, 1, 17), /*L, D*/WALL_7(7, 1, 18), 
	/*U, L, D*/WALL_8(8, 1, 19), /*L, R, D*/WALL_9(9, 1, 20), /*All*/WALL_10(10, 1, 21);
	
	public final int col;
	public final int row;
	public final int id;
	
	Type(int left, int top, int id)
	{
		this.col = left;
		this.row = top;
		this.id = id;
	}

}
