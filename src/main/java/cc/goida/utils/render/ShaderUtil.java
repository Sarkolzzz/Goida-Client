package cc.goida.utils.render;

import java.awt.*;

public class ShaderUtil {
//    public String shader = """
//    #type vertex
//    #version 150
//    in vec4 in_Position;
//    in vec2 in_TextureCoord;
//    out vec2 pass_TextureCoord;
//
//    void main() {
//        gl_Position = in_Position;
//        pass_TextureCoord = in_TextureCoord;
//    }
//
//    #type fragment
//    #version 150
//    in vec2 pass_TextureCoord;
//    out vec4 out_Color;
//
//    uniform vec4 color1 = vec4(1.0, 0.0, 0.0, 1.0);
//    uniform vec4 color2 = vec4(0.0, 1.0, 0.0, 1.0);
//    uniform vec4 color3 = vec4(0.0, 0.0, 1.0, 1.0);
//    uniform vec4 color4 = vec4(1.0, 1.0, 0.0, 1.0);
//    uniform float radius = 0.3;
//
//    void main() {
//        vec2 uv = pass_TextureCoord * 2.0 - 1.0;
//        float distance = length(uv);
//        if (distance > 1.0 - radius) {
//            out_Color = vec4(0.0);
//            return;
//        }
//        vec4 color = mix(
//            mix(color1, color2, pass_TextureCoord.x),
//            mix(color3, color4, pass_TextureCoord.x),
//            pass_TextureCoord.y
//        );
//        out_Color = color;
//    }
//    """;

    //todo:
    public void drawRoundedRect(float x, float y, float width, float height, float radius,
                                Color color1, Color color2, Color color3, Color color4) {

    }
}