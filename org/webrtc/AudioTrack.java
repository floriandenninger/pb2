package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j) {
        super(j);
    }

    private static native void nativeSetVolume(long j, double d);
}
