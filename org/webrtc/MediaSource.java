package org.webrtc;

import defpackage.bapd;
import defpackage.bapp;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaSource {
    private final bapp a;
    private long b;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum State {
        INITIALIZING,
        LIVE,
        ENDED,
        MUTED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaSource(long j) {
        this.a = new bapp(new bapd(j, 0));
        this.b = j;
    }

    private final void c() {
        if (this.b == 0) {
            throw new IllegalStateException("MediaSource has been disposed.");
        }
    }

    private static native State nativeGetState(long j);

    public final long a() {
        c();
        return this.b;
    }

    public void b() {
        c();
        this.a.release();
        this.b = 0L;
    }
}
