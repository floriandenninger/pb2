package org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class VideoTrack extends MediaStreamTrack {
    public final IdentityHashMap a;

    public VideoTrack(long j) {
        super(j);
        this.a = new IdentityHashMap();
    }

    public static native void nativeAddSink(long j, long j2);

    public static native void nativeFreeSink(long j);

    public static native void nativeRemoveSink(long j, long j2);

    public static native long nativeWrapSink(VideoSink videoSink);

    @Override // org.webrtc.MediaStreamTrack
    public final void d() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            nativeRemoveSink(a(), longValue);
            nativeFreeSink(longValue);
        }
        this.a.clear();
        super.d();
    }
}
