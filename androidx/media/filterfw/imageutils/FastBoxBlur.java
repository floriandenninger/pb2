package androidx.media.filterfw.imageutils;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FastBoxBlur {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean blur(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
