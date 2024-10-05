package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CandidatePairChangeEvent {
    public final IceCandidate a;
    public final IceCandidate b;
    public final int c;
    public final String d;
    public final int e;

    CandidatePairChangeEvent(IceCandidate iceCandidate, IceCandidate iceCandidate2, int i, String str, int i2) {
        this.a = iceCandidate;
        this.b = iceCandidate2;
        this.c = i;
        this.d = str;
        this.e = i2;
    }
}
