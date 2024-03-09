package dev.potato.mappictureexample.renderers;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public class CustomMapRenderer extends MapRenderer {
    private final String imageURL;

    public CustomMapRenderer(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public void render(MapView map, MapCanvas canvas, Player player) {
        /*
        MapView - The map itself
        MapCanvas - The visual canvas of the map; responsible for doing the drawing
        MapRenderer - The class that dictates what will be drawn onto the canvas
        MapPallet - A sort of utility class that contains the colors of the map and resizing methods
        */

        /*
        X-axis - Left to right (0 to 127)
        Y-axis - Top to bottom (0 to 127)
        */

        // Images on Maps
        /*
        try {
            URL url = new URL(imageURL);
            BufferedImage image = ImageIO.read(url);
            canvas.drawImage(0, 0, MapPalette.resizeImage(image));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        // Text on Maps
        /*
        canvas.drawText(5, 0, MinecraftFont.Font, "This is just a test! \nHere's a new line.");
        canvas.drawText(5, 50, MinecraftFont.Font, "This is in the center.");
        */

        // Color on Maps
        /*
        for (int i = 0; i < 128; i++) {
            for (int k = 0; k < 128; k++) {
                if (i % 2 == 0 && k % 2 == 0) {
                    canvas.setPixelColor(i, k, Color.RED);
                    continue;
                }
                canvas.setPixelColor(i, k, Color.BLUE);
            }
        }
        */
    }
}