package androidx.media.filterpacks.miscellaneous;

import defpackage.ary;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AverageIntensity extends ary {
    private static int mBinHeight = 2;
    private static int mBinWidth = 2;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private native void averageIntensity(ByteBuffer byteBuffer, IntBuffer intBuffer, int i, int i2, int i3, int i4);
}
