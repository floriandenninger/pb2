package androidx.media.filterfw.imageutils;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GrayValuesExtractor {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean toGrayValues(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
