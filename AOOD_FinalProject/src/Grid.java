
public class Grid {
	Tile[][] g;
	public Grid(Tile[][] grid){
		g = grid;
	}
	
	public void createGrid(){
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				if (i % 2 == j % 2){
					Tile t = new Tile(false, 0);
					g[i][j] = (t);
				} else {
					Tile t = new Tile(false, 0);
					g[i][j] = (t);
				}
			}
		}
	}
}
