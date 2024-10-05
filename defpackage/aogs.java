package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogs {
    private static final amxj a = amxj.l("com/google/mediapipe/glutil/ShaderUtil");

    public static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        ((amxh) ((amxh) a.f()).i("com/google/mediapipe/glutil/ShaderUtil", "loadShader", 47, "ShaderUtil.java")).t("Could not compile shader %d: %s", i, GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static FloatBuffer b(float... fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    public static void c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String hexString = Integer.toHexString(glGetError);
        StringBuilder sb = new StringBuilder(str.length() + 14 + String.valueOf(hexString).length());
        sb.append(str);
        sb.append(": GL error: 0x");
        sb.append(hexString);
        throw new RuntimeException(sb.toString());
    }

    public static int d(String str, Map map) {
        int a2;
        int a3 = a(35633, "uniform mat4 texture_transform;\nattribute vec4 position;\nattribute mediump vec4 texture_coordinate;\nvarying mediump vec2 sample_coordinate;\n\nvoid main() {\n  gl_Position = position;\n  sample_coordinate = (texture_transform * texture_coordinate).xy;\n}");
        if (a3 == 0 || (a2 = a(35632, str)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            ((amxh) ((amxh) a.f()).i("com/google/mediapipe/glutil/ShaderUtil", "createProgram", 78, "ShaderUtil.java")).q("Could not create program");
            glCreateProgram = 0;
        }
        GLES20.glAttachShader(glCreateProgram, a3);
        GLES20.glAttachShader(glCreateProgram, a2);
        for (Map.Entry entry : map.entrySet()) {
            GLES20.glBindAttribLocation(glCreateProgram, ((Integer) entry.getValue()).intValue(), (String) entry.getKey());
        }
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        ((amxh) ((amxh) a.f()).i("com/google/mediapipe/glutil/ShaderUtil", "createProgram", 93, "ShaderUtil.java")).s("Could not link program: %s", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }
}
