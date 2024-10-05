package androidx.media.filterpacks.image;

import defpackage.ary;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaskingFilter extends ary {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean applyMask(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);
}
