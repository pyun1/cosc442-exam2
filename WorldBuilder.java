package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class WorldBuilder.
 */
public class WorldBuilder {
	
	/** The width. */
	private int width;
	
	/** The height. */
	private int height;
	
	/** The depth. */
	private int depth;
	
	/** The tiles. */
	private Tile[][][] tiles;
	
	/** The regions. */
	private int[][][] regions;
	
	/** The next region. */
	private int nextRegion;

	/**
	 * Instantiates a new world builder.
	 *
	 * @param width the width
	 * @param height the height
	 * @param depth the depth
	 */
	public WorldBuilder(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.tiles = new Tile[width][height][depth];
		this.regions = new int[width][height][depth];
		this.nextRegion = 1;
	}

	/**
	 * Builds the.
	 *
	 * @return the world
	 */
	public World build() {
		return new World(tiles);
	}

	/**
	 * Randomize tiles.
	 *
	 * @return the world builder
	 */
	private WorldBuilder randomizeTiles() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				for (int z = 0; z < depth; z++) {
					tiles[x][y][z] = Math.random() < 0.5 ? Tile.FLOOR : Tile.WALL;
				}
			}
		}
		return this;
	}

	/**
	 * Smooth.
	 *
	 * @param times the times
	 * @return the world builder
	 */
	private WorldBuilder smooth(int times) {
		Tile[][][] tiles2 = new Tile[width][height][depth];
		iterateTiles(times, tiles2);
		return this;
	}

	/**
	 * Iterate tiles.
	 *
	 * @param times the times
	 * @param tiles2 the tiles 2
	 */
	private void iterateTiles(int times, Tile[][][] tiles2) {
		for (int time = 0; time < times; time++) {

			iterateTiles2(tiles2);
			tiles = tiles2;
		}
	}

	/**
	 * Iterate tiles 2.
	 *
	 * @param tiles2 the tiles 2
	 */
	private void iterateTiles2(Tile[][][] tiles2) {
		for (int x = 0; x < width; x++) {
			iterateTiles3(tiles2, x);
		}
	}

	/**
	 * Iterate tiles 3.
	 *
	 * @param tiles2 the tiles 2
	 * @param x the x
	 */
	private void iterateTiles3(Tile[][][] tiles2, int x) {
		for (int y = 0; y < height; y++) {
			iterateTiles4(tiles2, x, y);
		}
	}

	/**
	 * Iterate tiles 4.
	 *
	 * @param tiles2 the tiles 2
	 * @param x the x
	 * @param y the y
	 */
	private void iterateTiles4(Tile[][][] tiles2, int x, int y) {
		for (int z = 0; z < depth; z++) {
			iterateTiles5(tiles2, x, y, z);
		}
	}

	/**
	 * Iterate tiles 5.
	 *
	 * @param tiles2 the tiles 2
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 */
	private void iterateTiles5(Tile[][][] tiles2, int x, int y, int z) {
		int floors = 0;
		int rocks = 0;

		for (int ox = -1; ox < 2; ox++) {
			for (int oy = -1; oy < 2; oy++) {
				boolean b = x + ox < 0 || x + ox >= width || y + oy < 0
						|| y + oy >= height;
				if (b)
					continue;

				boolean c = tiles[x + ox][y + oy][z] == Tile.FLOOR;
				if (c)
					floors++;
				else
					rocks++;
			}
		}
		tiles2[x][y][z] = floors >= rocks ? Tile.FLOOR : Tile.WALL;
	}
	
	/**
	 * Creates the regions.
	 *
	 * @return the world builder
	 */
	private WorldBuilder createRegions(){
		regions = new int[width][height][depth];
		
		for (int z = 0; z < depth; z++){
			createWallRegions(z);
		}
		return this;
	}

	/**
	 * Creates the wall regions.
	 *
	 * @param z the z
	 */
	private void createWallRegions(int z) {
		for (int x = 0; x < width; x++){
			for (int y = 0; y < height; y++){
				checkTileWallRegion(z, x, y);
			}
		}
	}

	/**
	 * Check tile wall region.
	 *
	 * @param z the z
	 * @param x the x
	 * @param y the y
	 */
	private void checkTileWallRegion(int z, int x, int y) {
		if (tiles[x][y][z] != Tile.WALL && regions[x][y][z] == 0){
			int size = fillRegion(nextRegion++, x, y, z);
			
			if (size < 25)
				removeRegion(nextRegion - 1, z);
		}
	}
	
	/**
	 * Removes the region.
	 *
	 * @param region the region
	 * @param z the z
	 */
	private void removeRegion(int region, int z){
		for (int x = 0; x < width; x++){
			for (int y = 0; y < height; y++){
				if (regions[x][y][z] == region){
					regions[x][y][z] = 0;
					tiles[x][y][z] = Tile.WALL;
				}
			}
		}
	}
	
	/**
	 * Fill region.
	 *
	 * @param region the region
	 * @param x the x
	 * @param y the y
	 * @param z the z
	 * @return the int
	 */
	private int fillRegion(int region, int x, int y, int z) {
		int size = 1;
		ArrayList<Point> open = new ArrayList<Point>();
		open.add(new Point(x,y,z));
		regions[x][y][z] = region;
		
		while (!open.isEmpty()){
			size = fillRegionNeighbor(region, size, open);
		}
		return size;
	}

	/**
	 * Fill region neighbor.
	 *
	 * @param region the region
	 * @param size the size
	 * @param open the open
	 * @return the int
	 */
	private int fillRegionNeighbor(int region, int size, ArrayList<Point> open) {
		Point p = open.remove(0);

		for (Point neighbor : p.neighbors8()){
			boolean b = neighbor.x < 0 || neighbor.y < 0 || neighbor.x >= width || neighbor.y >= height;
			if (b)
				continue;
			
			boolean c = regions[neighbor.x][neighbor.y][neighbor.z] > 0
					|| tiles[neighbor.x][neighbor.y][neighbor.z] == Tile.WALL;
			if (c)
				continue;

			size++;
			regions[neighbor.x][neighbor.y][neighbor.z] = region;
			open.add(neighbor);
		}
		return size;
	}
	
	/**
	 * Connect regions.
	 *
	 * @return the world builder
	 */
	public WorldBuilder connectRegions(){
		for (int z = 0; z < depth-1; z++){
			connectRegionsDown(z);
		}
		return this;
	}
	
	/**
	 * Connect regions down.
	 *
	 * @param z the z
	 */
	private void connectRegionsDown(int z){
		List<Integer> connected = new ArrayList<Integer>();
		
		for (int x = 0; x < width; x++){
			for (int y = 0; y < height; y++){
				int r = regions[x][y][z] * 1000 + regions[x][y][z+1];
				if (tiles[x][y][z] == Tile.FLOOR
						&& tiles[x][y][z+1] == Tile.FLOOR
						&& !connected.contains(r)){
					connected.add(r);
					connectRegionsDown(z, regions[x][y][z], regions[x][y][z+1]);
				}
			}
		}
	}
	
	/**
	 * Connect regions down.
	 *
	 * @param z the z
	 * @param r1 the r 1
	 * @param r2 the r 2
	 */
	private void connectRegionsDown(int z, int r1, int r2){
		List<Point> candidates = findRegionOverlaps(z, r1, r2);
		
		int stairs = 0;
		do{
			Point p = candidates.remove(0);
			tiles[p.x][p.y][z] = Tile.STAIRS_DOWN;
			tiles[p.x][p.y][z+1] = Tile.STAIRS_UP;
			stairs++;
		}
		while (candidates.size() / stairs > 250);
	}

	/**
	 * Find region overlaps.
	 *
	 * @param z the z
	 * @param r1 the r 1
	 * @param r2 the r 2
	 * @return the list
	 */
	public List<Point> findRegionOverlaps(int z, int r1, int r2) {
		ArrayList<Point> candidates = new ArrayList<Point>();
		
		iterateRegionOverlaps(z, r1, r2, candidates);
		
		Collections.shuffle(candidates);
		return candidates;
	}

	/**
	 * Iterate region overlaps.
	 *
	 * @param z the z
	 * @param r1 the r 1
	 * @param r2 the r 2
	 * @param candidates the candidates
	 */
	private void iterateRegionOverlaps(int z, int r1, int r2, ArrayList<Point> candidates) {
		for (int x = 0; x < width; x++){
			for (int y = 0; y < height; y++){
				addCandidatePoints(z, r1, r2, candidates, x, y);
			}
		}
	}

	/**
	 * Adds the candidate points.
	 *
	 * @param z the z
	 * @param r1 the r 1
	 * @param r2 the r 2
	 * @param candidates the candidates
	 * @param x the x
	 * @param y the y
	 */
	private void addCandidatePoints(int z, int r1, int r2, ArrayList<Point> candidates, int x, int y) {
		if (tiles[x][y][z] == Tile.FLOOR
				&& tiles[x][y][z+1] == Tile.FLOOR
				&& regions[x][y][z] == r1 
				&& regions[x][y][z+1] == r2){
			candidates.add(new Point(x,y,z));
		}
	}
	
	/**
	 * Adds the exit stairs.
	 *
	 * @return the world builder
	 */
	private WorldBuilder addExitStairs() {
		int x = -1;
		int y = -1;
		
		do {
			x = (int)(Math.random() * width);
			y = (int)(Math.random() * height);
		}
		while (tiles[x][y][0] != Tile.FLOOR);
		
		tiles[x][y][0] = Tile.STAIRS_UP;
		return this;
	}

	/**
	 * Make caves.
	 *
	 * @return the world builder
	 */
	public WorldBuilder makeCaves() {
		return randomizeTiles()
				.smooth(8)
				.createRegions()
				.connectRegions()
				.addExitStairs();
	}
}