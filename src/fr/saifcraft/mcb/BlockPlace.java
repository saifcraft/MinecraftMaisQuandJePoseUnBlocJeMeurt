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
        if (block.getType().equals(Material.TNT)){
            player.sendMessage("t'as posé une tnt");
        }
    }
}
