package scripts.advancedcutter.enums.treetypes;

public enum TreeTypes {
	NORMAL("Tree", "Logs", 0, 25), OAK("Oak", "Oak logs", 1, 37.5), WILLOW("Willow", "Willow logs", 2, 67.5), YEW("Yew",
			"Yew logs", 3, 175);

	private String name;
	private String logs;
	private int index;
	private double xp;

	TreeTypes(String name, String logs, int index, double xp) {
		this.name = name;
		this.logs = logs;
		this.index = index;
		this.xp = xp;
	}

	public double getXp() {
		return this.xp;
	}

	public String getName() {
		return this.name;
	}

	public String getLogs() {
		return this.logs;
	}

	public int getIndex() {
		return this.index;
	}

}
