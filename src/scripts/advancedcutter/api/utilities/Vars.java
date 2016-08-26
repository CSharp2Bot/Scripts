package scripts.advancedcutter.api.utilities;

import java.awt.Rectangle;

import org.tribot.api2007.Skills;
import org.tribot.api2007.Skills.SKILLS;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;


public class Vars {

	public static String treeType;
	public static int accounts;
	public static int logsPerHour;
	public static int logsChoped;
	public static int xpGained;
	public static int xpPerHour;
	public static int startXp = Skills.getXP(SKILLS.WOODCUTTING);
	public static long runTime;
	public static long beforeStartTime = System.currentTimeMillis();

	public static boolean showPaint = true;
	public static boolean powerChop = false;
	public static boolean progressiveLevel = false;
	public static boolean start = false;
	
	public static RSArea chopArea;
	public static RSArea bankArea;
	public static RSTile chopAreaWalkTile;
	
	public static final Rectangle togglePaintRect = new Rectangle(100, 300, 80, 50);
	
}
