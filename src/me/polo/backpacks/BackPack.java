package me.polo.backpacks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

public class BackPack implements Listener {

    private Plugin plugin = Main.getPlugin(Main.class);
    Inventory inv = Bukkit.createInventory(null, 54, "Backpack");

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Action a = e.getAction();
        Player p = e.getPlayer();
        if (a.equals(Action.RIGHT_CLICK_BLOCK) || a.equals(Action.RIGHT_CLICK_AIR)) {
            if (p.getItemInHand().getType().equals(Material.BUNDLE)) {
                //DONT BUILD THE INVENTORY HERE OR IT BUILDS IT NEW EACH TIME
                p.openInventory(inv);
            }
        }
    }
}