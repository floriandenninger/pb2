package androidx.media.filterpacks.image;

import defpackage.ary;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ToRgbValuesFilter extends ary {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean toRgbValues(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);
}
