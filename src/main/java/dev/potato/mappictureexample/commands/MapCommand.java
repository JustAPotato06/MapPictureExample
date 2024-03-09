package dev.potato.mappictureexample.commands;

import dev.potato.mappictureexample.renderers.CustomMapRenderer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.MapMeta;
import org.bukkit.map.MapView;

import java.util.ArrayList;
import java.util.List;

public class MapCommand implements TabExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player p)) return true;

        ItemStack mapItem = new ItemStack(Material.FILLED_MAP);
        MapMeta mapMeta = (MapMeta) mapItem.getItemMeta();
        MapView mapView = Bukkit.createMap(p.getWorld());
        String imageURL = args.length > 0 ? args[0] : "https://cdn.vox-cdn.com/thumbor/tdEOBffgQIki4wT2_m6s1ZcN87U=/0x0:640x480/1200x800/filters:focal(269x189:371x291)/cdn.vox-cdn.com/uploads/chorus_image/image/63710320/ur-cute-potato.0.1539757238.0.png";
        CustomMapRenderer mapRenderer = new CustomMapRenderer(imageURL);

        mapView.getRenderers().clear();
        mapView.addRenderer(mapRenderer);

        mapMeta.setMapView(mapView);
        mapItem.setItemMeta(mapMeta);

        p.getInventory().addItem(mapItem);

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        List<String> completions = new ArrayList<>();

        if (args.length == 1) {
            completions.add("[picture url]");
        }

        return completions;
    }
}