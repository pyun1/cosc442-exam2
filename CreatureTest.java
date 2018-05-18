package game;

import java.awt.Color;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

// TODO: Auto-generated Javadoc
/**
 * The class <code>CreatureTest</code> contains tests for the class <code>{@link Creature}</code>.
 *
 * @author Paul Yun
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 5/17/18 8:31 PM
 */
public class CreatureTest {
	
	/**
	 * Run the Creature(World,char,Color,String,int,int,int) constructor test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World world = WorldFactory.createWorld();
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		int maxHp = 1;
		int attack = 1;
		int defense = 1;

		Creature result = new Creature(world, glyph, color, name, maxHp, attack, defense);

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.name());
		assertEquals(1, result.level());
		assertEquals("  level:1  attack:1  defense:1  hp:1", result.details());
		assertEquals(9, result.visionRadius());
		assertEquals(null, result.weapon());
		assertEquals(null, result.armor());
		assertEquals(null, result.causeOfDeath());
		assertEquals(1, result.maxHp());
		assertEquals(1000, result.maxFood());
		assertEquals(0, result.xp());
		assertEquals(1, result.defenseValue());
		assertEquals(5, result.maxMana());
		assertEquals(666, result.food());
		assertEquals(1, result.attackValue());
		assertEquals(5, result.mana());
		assertEquals(1, result.hp());
		assertEquals(false, result.isPlayer());
		assertEquals('', result.glyph());
	}

	/**
	 * Run the Item armor() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testArmor_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature6();

		Item result = fixture.armor();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testAttackValue_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();

		int result = fixture.attackValue();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testAttackValue_2()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature2();

		int result = fixture.attackValue();

		// add additional test code here
		assertEquals(Integer.MIN_VALUE, result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testCanEnter_3()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String causeOfDeath() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testCauseOfDeath_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature2();

		String result = fixture.causeOfDeath();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Color color() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature2();

		Color result = fixture.color();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=192,g=192,b=192]", result.toString());
		assertEquals(192, result.getGreen());
		assertEquals(192, result.getBlue());
		assertEquals(192, result.getRed());
		assertEquals(-4144960, result.getRGB());
		assertEquals(255, result.getAlpha());
		assertEquals(1, result.getTransparency());
	}


	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testDefenseValue_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature4();

		int result = fixture.defenseValue();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testDefenseValue_2()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature5();

		int result = fixture.defenseValue();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String details() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testDetails_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature3();

		String result = fixture.details();

		// add additional test code here
		assertEquals("  level:1  attack:7  defense:7  hp:7", result);
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testDoAction_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature3();
		String message = "";

		fixture.doAction(message);

		// add additional test code here
	}

	
	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testDoAction_5()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature7();
		Item item = ItemFactory.createItem2();
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testDoAction_6()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();
		Item item = ItemFactory.createItem3();
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testDoAction_7()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature2();
		Item item = ItemFactory.createItem4();
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
	}


	/**
	 * Run the List<Effect> effects() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testEffects_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature3();

		List<Effect> result = fixture.effects();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the int food() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testFood_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature4();

		int result = fixture.food();

		// add additional test code here
		assertEquals(666, result);
	}

	/**
	 * Run the char glyph() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();

		char result = fixture.glyph();

		// add additional test code here
		assertEquals(' ', result);
	}

	/**
	 * Run the int hp() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testHp_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature6();

		int result = fixture.hp();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Inventory inventory() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature2();

		Inventory result = fixture.inventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isFull());
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testIsPlayer_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature6();

		boolean result = fixture.isPlayer();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testIsPlayer_2()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature7();

		boolean result = fixture.isPlayer();

		// add additional test code here
		assertEquals(false, result);
	}

	
	/**
	 * Run the int level() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testLevel_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();

		int result = fixture.level();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int mana() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testMana_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature6();

		int result = fixture.mana();

		// add additional test code here
		assertEquals(5, result);
	}

	/**
	 * Run the int maxFood() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testMaxFood_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature3();

		int result = fixture.maxFood();

		// add additional test code here
		assertEquals(1000, result);
	}

	/**
	 * Run the int maxHp() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testMaxHp_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature4();

		int result = fixture.maxHp();

		// add additional test code here
		assertEquals(Integer.MAX_VALUE, result);
	}

	/**
	 * Run the int maxMana() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testMaxMana_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature4();

		int result = fixture.maxMana();

		// add additional test code here
		assertEquals(5, result);
	}

	/**
	 * Run the void modifyAttackValue(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyAttackValue_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature7();
		int value = 1;

		fixture.modifyAttackValue(value);

		// add additional test code here
	}

	/**
	 * Run the void modifyDefenseValue(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyDefenseValue_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature3();
		int value = 1;

		fixture.modifyDefenseValue(value);

		// add additional test code here
	}

	/**
	 * Run the void modifyDetectCreatures(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyDetectCreatures_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();
		int amount = 1;

		fixture.modifyDetectCreatures(amount);

		// add additional test code here
	}

	/**
	 * Run the void modifyFood(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyFood_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature5();
		int amount = 1;

		fixture.modifyFood(amount);

		// add additional test code here
	}

	/**
	 * Run the void modifyMana(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyMana_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature7();
		int amount = 1;

		fixture.modifyMana(amount);

		// add additional test code here
	}

	/**
	 * Run the void modifyMaxHp(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyMaxHp_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature5();
		int amount = 1;

		fixture.modifyMaxHp(amount);

		// add additional test code here
	}

	/**
	 * Run the void modifyMaxMana(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyMaxMana_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature5();
		int amount = 1;

		fixture.modifyMaxMana(amount);

		// add additional test code here
	}

	/**
	 * Run the void modifyRegenHpPer1000(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyRegenHpPer1000_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature2();
		int amount = 1;

		fixture.modifyRegenHpPer1000(amount);

		// add additional test code here
	}

	/**
	 * Run the void modifyRegenManaPer1000(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyRegenManaPer1000_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();
		int amount = 1;

		fixture.modifyRegenManaPer1000(amount);

		// add additional test code here
	}

	/**
	 * Run the void modifyVisionRadius(int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testModifyVisionRadius_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature6();
		int value = 1;

		fixture.modifyVisionRadius(value);

		// add additional test code here
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testMoveBy_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature3();
		int mx = 0;
		int my = 0;
		int mz = 1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature();

		String result = fixture.name();

		// add additional test code here
		assertEquals("", result);
	}


	/**
	 * Run the void setCreatureAi(CreatureAi) method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testSetCreatureAi_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature3();
		CreatureAi ai = CreatureAiFactory.createCreatureAi();

		fixture.setCreatureAi(ai);

		// add additional test code here
	}

	/**
	 * Run the int visionRadius() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testVisionRadius_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature7();

		int result = fixture.visionRadius();

		// add additional test code here
		assertEquals(9, result);
	}

	/**
	 * Run the Item weapon() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testWeapon_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature5();

		Item result = fixture.weapon();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int xp() method test.
	 *
	 * @throws Exception the exception
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	@Test
	public void testXp_1()
		throws Exception {
		Creature fixture = CreatureFactory.createCreature7();

		int result = fixture.xp();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 8:31 PM
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
	 * @generatedBy CodePro at 5/17/18 8:31 PM
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
	 * @generatedBy CodePro at 5/17/18 8:31 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureTest.class);
	}
}