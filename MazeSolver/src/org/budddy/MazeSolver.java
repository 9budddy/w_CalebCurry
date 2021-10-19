package org.budddy;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class MazeSolver {

	//0 = wall
	//1 = path
	//2 = destination
		
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Maze> mazes = readMazes();
						
		//Go Through Each Maze
		for(Maze z : mazes) {
			//Starting Position Valid?
			if(isValidStart(z)) {
				//Start to Solve Maze
				if(solveMaze(z)) {
					System.out.println("You Won!");
				} else {
					System.out.println("No Path!");
				}
			} else {
				System.out.println("You can't start outside the maze or on a wall!");
			}
		}
	}
	
	private static ArrayList<Maze> readMazes() throws FileNotFoundException {
		ArrayList<Maze> mazes = new ArrayList<Maze>();

		//Fill List from file.
		Scanner scan = new Scanner(new File("Mazes/mazes.txt"));			
		while(scan.hasNext()) {

			Maze m = new Maze();
			
			int rows = Integer.parseInt(scan.nextLine());
			m.maze = new int[rows][];
			
			//loop through rows
			for(int i = 0; i < rows; i++) {
				String line = scan.nextLine();
				m.maze[i] = Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).toArray();
			}
			
			m.start = new Position(Integer.parseInt(scan.nextLine()), Integer.parseInt(scan.nextLine()));
			
			scan.nextLine(); //Toss dash
			
			mazes.add(m);

		}
		scan.close();
		
		return mazes;
	}

	private static boolean isValidStart(Maze m) {
		
		Position p = m.start;
		
		//Make sure Starting Position is inside maze or on a wall.
		if (!isValid(p.y, p.x, m) || m.maze[p.y][p.x] == 0) {
			return false;
		}
		return true;
	}

	private static boolean solveMaze(Maze m) {
		
		Position p = m.start;
		
		m.path.push(p);
		while(true) {
			int y = m.path.peek().y;
			int x = m.path.peek().x;
			
			m.maze[y][x] = 0;
			
			//down
			if(isValid(y+1, x, m)) {
				if (m.maze[y+1][x] == 2) {
					System.out.println("Moved Down.");
					return true;
				} else if (m.maze[y+1][x] == 1) {
					System.out.println("Moved Down.");
					m.path.push(new Position(y+1, x));
					continue;
				}
			}
			
			//left
			if(isValid(y, x-1, m)) {
				if (m.maze[y][x-1] == 2) {
					System.out.println("Moved Left.");
					return true;
				} else if (m.maze[y][x-1] == 1) {
					System.out.println("Moved Left.");
					m.path.push(new Position(y, x-1));
					continue;
				}	
			}
			
			//up
			if (isValid(y-1, x, m)) {
				if (m.maze[y-1][x] == 2) {
					System.out.println("Moved Up.");
					return true;
				} else if (m.maze[y-1][x] == 1) {
					System.out.println("Moved Up.");
					m.path.push(new Position(y-1, x));
					continue;
				}
			}

			//right
			if(isValid(y, x+1, m)) {
				if (m.maze[y][x+1] == 2) {
					System.out.println("Moved Right.");
					return true;
				} else if (m.maze[y][x+1] == 1) {
					System.out.println("Moved Right.");
					m.path.push(new Position(y, x+1));
					continue;
				}	
			}
			
			m.path.pop();
			System.out.println("Moved Back");
			if(m.path.size() <= 0) {
				return false;
			}
		}
	}

	public static boolean isValid(int y, int x, Maze m) {
		if(y < 0 || 
			y >= m.maze.length ||
			x < 0 || 
			x >= m.maze[y].length
				) {
			return false;
		}
		return true;
	}
}
