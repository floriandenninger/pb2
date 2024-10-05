package androidx.media.filterpacks.histogram;

import defpackage.ary;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ChromaHistogramFilter extends ary {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void extractChromaHistogram(ByteBuffer byteBuffer, FloatBuffer floatBuffer, int i, int i2);
}
