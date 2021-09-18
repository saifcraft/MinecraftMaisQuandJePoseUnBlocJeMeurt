package fr.saifcraft.mcb;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {
    @EventHandler
    public void blockPlace(BlockPlaceEvent event){
        Block block = event.getBlock();
        Player player = event.getPlayer();
        Material material = block.getType();
        if (block.getState().isPlaced() && !block.getType().equals(Material.ENDER_PORTAL_FRAME) && !block.getType().equals(Material.LAVA_BUCKET)){
            event.setCancelled(true);
            player.setHealth(0);
        }
    }
}
