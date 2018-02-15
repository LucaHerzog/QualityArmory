package me.zombie_striker.qg.guns;

import me.zombie_striker.qg.Main;
import me.zombie_striker.qg.MaterialStorage;
import me.zombie_striker.qg.ammo.AmmoType;
import me.zombie_striker.qg.guns.utils.WeaponSounds;
import me.zombie_striker.qg.guns.utils.WeaponType;

import org.bukkit.inventory.ItemStack;

public class FNFal extends DefaultGun {

	public FNFal(int d,ItemStack[] ing, float damage, double cost) {
		super("FN-FAL", MaterialStorage.getMS(Main.guntype, 9), WeaponType.RIFLE,false, AmmoType.getAmmo("556"), 0.2,2, 51, damage,true,d,WeaponSounds.GUN_MEDIUM,cost,ing);
	}
}