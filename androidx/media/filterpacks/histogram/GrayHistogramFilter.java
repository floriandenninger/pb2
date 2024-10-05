package androidx.media.filterpacks.histogram;

import defpackage.ary;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GrayHistogramFilter extends ary {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractHistogram(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer);
}
