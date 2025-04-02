package cc.goida.utils.client;

import org.lwjgl.glfw.GLFW;

import java.lang.reflect.Field;
import java.util.HashMap;

public class KeyUtil {
    private static HashMap<Integer, String> keyMap = new HashMap<>();

    static {
        try {
            Field[] fields = GLFW.class.getDeclaredFields();

            for (Field field : fields) {
                if (field.getName().startsWith("GLFW_KEY_")){
                    keyMap.put(field.getInt(null), field.getName().replace("GLFW_KEY_", ""));
                }
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getKey(int key) {
        return keyMap.getOrDefault(key, "Unknown");
    }
}
