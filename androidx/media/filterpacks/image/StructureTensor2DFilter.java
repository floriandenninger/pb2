package androidx.media.filterpacks.image;

import defpackage.ary;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StructureTensor2DFilter extends ary {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean constructStructureTensor(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);
}
