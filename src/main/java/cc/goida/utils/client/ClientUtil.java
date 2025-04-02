package cc.goida.utils.client;

import net.minecraft.network.MessageType;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.Objects;
import java.util.UUID;

public class ClientUtil implements Imports {
    public void print(String message){
        if (mc.player == null) return;
        Text msg = new LiteralText(Formatting.AQUA + "[" + Formatting.WHITE + "goida" + Formatting.AQUA + "] " + Formatting.WHITE + message);
        MessageType messageType = MessageType.CHAT;
        mc.inGameHud.addChatMessage(messageType, msg, UUID.randomUUID());
    }

    public boolean isConnected(String ip){
        return mc.player != null && mc.world != null && Objects.requireNonNull(mc.getServer()).getServerIp().equals(ip);
    }
}
