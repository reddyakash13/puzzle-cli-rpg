package red.aka.rpg.domain;

public class Weapon {

	private String name;
	private String description;
	private Long maxDamage;
	private Boolean reloadable;
	private WeaponStatus currentStatus;

	public Weapon(String name, String description, Long maxDamage, Boolean reloadable, WeaponStatus currentStatus) {
		this.name = name;
		this.description = description;
		this.maxDamage = maxDamage;
		this.reloadable = reloadable;
		this.currentStatus = currentStatus;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Long getMaxDamage() {
		return maxDamage;
	}

	public Boolean getReloadable() {
		return reloadable;
	}

	public WeaponStatus getCurrentStatus() {
		return currentStatus;
	}
}
