package game;

import org.junit.*;
import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>FieldOfViewTest</code> contains tests for the class <code>{@link FieldOfView}</code>.
 *
 * @author Paul Yun
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 5/17/18 8:32 PM
 */
public class FieldOfViewTest {
	
	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testFieldOfView_1()
		throws Exception {
		World world = WorldFactory.createWorld();

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testFieldOfView_2()
		throws Exception {
		World world = WorldFactory.createWorld();

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testFieldOfView_3()
		throws Exception {
		World world = WorldFactory.createWorld();

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testFieldOfView_4()
		throws Exception {
		World world = WorldFactory.createWorld();

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testIsVisible_1()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testIsVisible_2()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testIsVisible_3()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int x = -1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testIsVisible_4()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int x = 1;
		int y = -1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testIsVisible_5()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testIsVisible_6()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testIsVisible_7()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_2()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_3()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_4()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_5()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_6()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_7()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_8()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_9()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:32 PM
	 */
	@Test
	public void testUpdate_10()
		throws Exception {
		FieldOfView fixture = FieldOfViewFactory.createFieldOfView();
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
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
		new org.junit.runner.JUnitCore().run(FieldOfViewTest.class);
	}
}