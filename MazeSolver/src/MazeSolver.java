import java.util.LinkedList;

public class MazeSolver {

	static int[][] maze = {
			{1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1},
			{1, 1, 1, 2, 0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0},
			{0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1}
	};
	//0 = wall
	//1 = path
	//2 = destination
	
	static LinkedList<Position> path = new LinkedList<Position>();
	
	public static void main(String[] args) {
		//Starting Position
		Position p = new Position(4, 8);
		
		//Make sure Starting Position is inside maze.
		if (!isValid(p.y, p.x)) {
			System.out.println("Can't outside of maze!");
			return;
		}
		
		//Make sure Starting Position is not a wall.
		if(maze[p.y][p.x] == 0) {
			System.out.println("You can't start on a wall!");
			return;
		}
		
		path.push(p);
		while(true) {
			int y = path.peek().y;
			int x = path.peek().x;
			
			maze[y][x] = 0;
			
			//down
			if(isValid(y+1, x)) {
				if (maze[y+1][x] == 2) {
					System.out.println("Moved Down. You won!");
					return;
				} else if (maze[y+1][x] == 1) {
					System.out.println("Moved Down.");
					path.push(new Position(y+1, x));
					continue;
				}
			}
			
			//left
			if(isValid(y, x-1)) {
				if (maze[y][x-1] == 2) {
					System.out.println("Moved Left. You won!");
					return;
				} else if (maze[y][x-1] == 1) {
					System.out.println("Moved Left.");
					path.push(new Position(y, x-1));
					continue;
				}	
			}
			
			//up
			if (isValid(y-1, x)) {
				if (maze[y-1][x] == 2) {
					System.out.println("Moved Up. You won!");
					return;
				} else if (maze[y-1][x] == 1) {
					System.out.println("Moved Up.");
					path.push(new Position(y-1, x));
					continue;
				}
			}

			//right
			if(isValid(y, x+1)) {
				if (maze[y][x+1] == 2) {
					System.out.println("Moved Right. You won!");
					return;
				} else if (maze[y][x+1] == 1) {
					System.out.println("Moved Right.");
					path.push(new Position(y, x+1));
					continue;
				}	
			}
			
			path.pop();
			System.out.println("Moved Back");
			if(path.size() <= 0) {
				System.out.println("No Path!");
				return;
			}
		}
	}
	
	public static boolean isValid(int y, int x) {
		if(y < 0 || 
			y >= maze.length ||
			x < 0 || 
			x >= maze[y].length
				) {
			return false;
		}
		return true;
	}
}
