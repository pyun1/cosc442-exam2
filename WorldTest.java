package game;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>WorldTest</code> contains tests for the class <code>{@link World}</code>.
 *
 * @author Paul Yun
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 5/17/18 8:32 PM
 */
public class WorldTest {

	/**
	 * Run the void add(Creature) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Creature pet = CreatureFactory.createCreature5();

		fixture.add(pet);

		// add additional test code here
	}


	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testAddAtEmptySpace_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = null;
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testAddAtEmptySpace_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testAddAtEmptySpace_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem2();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testAddAtEmptySpace_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem3();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testAddAtEmptySpace_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem4();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addAtEmptySpace(Item,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testAddAtEmptySpace_6()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.addAtEmptySpace(item, x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}


	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testCreature_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testCreature_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Creature result = fixture.creature(x, y, z);

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int depth() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testDepth_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		int result = fixture.depth();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testDig_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
	}

	/**
	 * Run the void dig(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testDig_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		fixture.dig(x, y, z);

		// add additional test code here
	}

	


	/**
	 * Run the int height() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testHeight_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		int result = fixture.height();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the void remove(Creature) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Creature other = CreatureFactory.createCreature4();

		fixture.remove(other);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem2();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testRemove_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem3();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testRemove_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem4();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the void remove(Item) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testRemove_6()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		Item item = ItemFactory.createItem();

		fixture.remove(item);

		// add additional test code here
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = -1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals('x', result.glyph());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals('x', result.glyph());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testTile_3()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = -1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals('x', result.glyph());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testTile_4()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals('x', result.glyph());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testTile_5()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = -1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals('x', result.glyph());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testTile_6()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals('x', result.glyph());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testTile_7()
		throws Exception {
		World fixture = WorldFactory.createWorld();
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Beyond the edge of the world.", result.details());
		assertEquals('x', result.glyph());
		assertEquals(false, result.isGround());
		assertEquals(false, result.isDiggable());
		assertEquals("BOUNDS", result.name());
		assertEquals("BOUNDS", result.toString());
		assertEquals(2, result.ordinal());
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		fixture.update();

		// add additional test code here
	}

	/**
	 * Run the int width() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testWidth_1()
		throws Exception {
		World fixture = WorldFactory.createWorld();

		int result = fixture.width();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorldTest.class);
	}
}