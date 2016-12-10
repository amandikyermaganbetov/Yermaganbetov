package by.oop.amans;

public class Birds {
	private String name;
	private boolean canFly;
	public Birds(String name,boolean canFly){
		this.name=name;
		this.canFly=canFly;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	
}
