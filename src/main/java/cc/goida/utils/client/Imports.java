package cc.goida.utils.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.util.math.MatrixStack;

public interface Imports {
    MinecraftClient mc = MinecraftClient.getInstance();
    Tessellator tessellator = Tessellator.getInstance();
    BufferBuilder buffer = tessellator.getBuffer();
    MatrixStack matrixStack = new MatrixStack();
}
