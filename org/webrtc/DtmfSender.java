package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DtmfSender {
    public long a;

    public DtmfSender(long j) {
        this.a = j;
    }

    private static native boolean nativeCanInsertDtmf(long j);

    private static native int nativeDuration(long j);

    private static native boolean nativeInsertDtmf(long j, String str, int i, int i2);

    private static native int nativeInterToneGap(long j);

    private static native String nativeTones(long j);
}
