package fr.saifcraft.mcb;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerTuto implements Listener {
    @EventHandler
    public void OnPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage("[ §1mcb §4by saifcraft §f] \n" +
                "§ebonjour voici le plugin Minecraft mais quand je pose un bloc je meurs \n" +
                "§eles exceptions sont :\n" +
                "- §eposer les yeux de l'end\n" +
                "- §eles bateaux\n" +
                "- §eles tables de craft\n" +
                "- §eet les fours\n" +
                "§4 si vous rencontrez des bugs veuillez me contacter sur discord \n" +
                "                 (saif-craft#0001)");
    }
}
