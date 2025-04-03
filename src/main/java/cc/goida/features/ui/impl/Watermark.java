package cc.goida.features.ui.impl;

import cc.goida.features.ui.UIRenderer;
import net.minecraft.client.render.VertexFormats;

public class Watermark extends UIRenderer {
    @Override
    public void render() {
        buffer.vertex(4, 4, 6);
        buffer.begin(1, VertexFormats.POSITION_COLOR);

        super.render();
    }
}
