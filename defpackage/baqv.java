package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.NativeAndroidVideoTrackSource;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baqv extends MediaSource {
    public final NativeAndroidVideoTrackSource a;
    public final Object b;
    public final baod c;

    public baqv(long j) {
        super(j);
        this.b = new Object();
        this.c = new baqu(this);
        this.a = new NativeAndroidVideoTrackSource(j);
    }

    @Override // org.webrtc.MediaSource
    public final void b() {
        synchronized (this.b) {
        }
        super.b();
    }
}
