package scripts.advancedcutter.Paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import org.tribot.api.Timing;
import org.tribot.api2007.Projection;
import org.tribot.api2007.Skills;
import org.tribot.api2007.Skills.SKILLS;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

import scripts.advancedcutter.Main;
import scripts.advancedcutter.api.utilities.Vars;
import scripts.advancedcutter.enums.treetypes.TreeTypes;

public class Paint {

	public static void handle(String status, Graphics g) {
		RSArea[] areas = new RSArea[] { Vars.chopArea, Vars.bankArea };
		if (areas.length > 0) {
			for (RSArea area : areas) {
				if (area != null)
					drawTile(area, (Graphics2D) g, false, Color.magenta);
			}
		}
		Vars.runTime = (System.currentTimeMillis() - Vars.beforeStartTime);
		Vars.xpGained = Skills.getXP(SKILLS.WOODCUTTING) - Vars.startXp;
		Vars.xpPerHour = (int) (Vars.xpGained * (3600000D / Vars.runTime));
		Vars.logsChoped = (int) (Vars.xpGained / xp());
		Vars.logsPerHour = (int) (Vars.logsChoped * (3600000D / Vars.runTime));
		if (Vars.showPaint){
			if (Vars.progressiveLevel) {
				g.drawString("Time running: " + Timing.msToString(Vars.runTime), 300, 300);
				g.drawString("Status: " + Main.status, 300, 315);
			} else {
				int level = Skills.getActualLevel(SKILLS.WOODCUTTING);
				drawRect(g, "Time Running: " + Timing.msToString(Vars.runTime), 25, 35, 20, 20, 230, 20);
				drawRect(g, "Xp Gained: " + Vars.xpGained, 25, 35 + 30, 20, 20 + 30, 230, 20);
				drawRect(g, "Xp Per Hour: " + Vars.xpPerHour, 25, 35 + 60, 20, 20 + 60, 230, 20);
				drawRect(g,
						"Current level: " + level + ", Time to: " + (level + 1) + ": "
								+ timeToLevel(SKILLS.WOODCUTTING, Vars.xpGained, Vars.runTime),
						25, 35 + 90, 20, 20 + 90, 230, 20);
				drawRect(g, Vars.treeType + " logs chopped: " + Vars.logsChoped, 25, 35 + 120, 20, 20 + 120, 230, 20);
				drawRect(g, Vars.treeType + " logs chopped / hour : " + Vars.logsPerHour, 25, 35 + 150, 20, 20 + 150, 230,
						20);
				drawRect(g, "Status: " + Main.status, 25, 35 + 180, 20, 20 + 180, 230, 20);
				drawRect(g, "Mission: " + Main.mission, 25, 35 + 210, 20, 20 + 210, 230, 20);

			}
		}
		drawRect(g, "hide/show paint", 110, 325, 100, 300, 120, 30);
	}

	private static void drawRect(Graphics g, String text, int textX, int textY, int rectX, int rectY, int width,
			int height) {
		Graphics2D g2 = (Graphics2D) g;
		float thickness = 6;
		g2.setColor(Color.white);
		Stroke oldStroke = g2.getStroke();
		g2.setStroke(new BasicStroke(thickness));
		g2.drawRect(rectX, rectY, width, height);
		g2.setStroke(oldStroke);
		g2.setColor(Color.green);
		g2.fillRect(rectX, rectY, width, height);
		g2.setColor(Color.black);
		g2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 11));
		g2.drawString(text, textX, textY);

	}

	public static String timeToLevel(SKILLS skill, int gain, long runTime) {
		if (gain != 0 && Skills.getActualLevel(skill) < 99) {
			return Timing.msToString((runTime * (Skills.getXPToNextLevel(skill)) / gain));
		}
		return "00:00:00";
	}

	private static double xp() {
		for (TreeTypes tree : TreeTypes.values()) {
			if (tree.getName().equals(Vars.treeType)) {
				return tree.getXp();
			}
		}
		return 0;
	}

	public static void drawTile(RSArea area, Graphics2D g, boolean fill, Color color) {
		if (area != null) {
			for (RSTile tile : area.getAllTiles()) {
				g.setColor(color);
				if (tile.isOnScreen()) {
					if (Projection.getTileBoundsPoly(tile, 0) != null) {
						if (fill) {
							g.fillPolygon(Projection.getTileBoundsPoly(tile, 0));
						} else {
							g.drawPolygon(Projection.getTileBoundsPoly(tile, 0));
						}
					}
				}
			}
		}
	}
}
