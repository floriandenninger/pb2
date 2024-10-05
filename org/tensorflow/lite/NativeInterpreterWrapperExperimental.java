package org.tensorflow.lite;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class NativeInterpreterWrapperExperimental extends NativeInterpreterWrapper {
    public NativeInterpreterWrapperExperimental(ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    private static native void resetVariableTensors(long j, long j2);
}
