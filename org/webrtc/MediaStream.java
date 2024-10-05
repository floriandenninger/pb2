package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaStream {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public long d;

    public MediaStream(long j) {
        this.d = j;
    }

    private static void e(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) it.next();
            if (mediaStreamTrack.a() == j) {
                mediaStreamTrack.d();
                it.remove();
                return;
            }
        }
        Logging.b("MediaStream", "Couldn't not find track");
    }

    public static native boolean nativeAddAudioTrackToNativeStream(long j, long j2);

    public static native boolean nativeAddVideoTrackToNativeStream(long j, long j2);

    private static native String nativeGetId(long j);

    private static native boolean nativeRemoveAudioTrack(long j, long j2);

    private static native boolean nativeRemoveVideoTrack(long j, long j2);

    public final long a() {
        c();
        return this.d;
    }

    void addNativeAudioTrack(long j) {
        this.a.add(new AudioTrack(j));
    }

    void addNativeVideoTrack(long j) {
        this.b.add(new VideoTrack(j));
    }

    public final String b() {
        c();
        return nativeGetId(this.d);
    }

    public final void c() {
        if (this.d == 0) {
            throw new IllegalStateException("MediaStream has been disposed.");
        }
    }

    public final void d(VideoTrack videoTrack) {
        c();
        this.b.remove(videoTrack);
        this.c.remove(videoTrack);
        nativeRemoveVideoTrack(this.d, videoTrack.a());
    }

    public void dispose() {
        c();
        while (!this.a.isEmpty()) {
            AudioTrack audioTrack = (AudioTrack) this.a.get(0);
            c();
            this.a.remove(audioTrack);
            nativeRemoveAudioTrack(this.d, audioTrack.a());
            audioTrack.d();
        }
        while (!this.b.isEmpty()) {
            VideoTrack videoTrack = (VideoTrack) this.b.get(0);
            d(videoTrack);
            videoTrack.d();
        }
        while (!this.c.isEmpty()) {
            d((VideoTrack) this.c.get(0));
        }
        JniCommon.nativeReleaseRef(this.d);
        this.d = 0L;
    }

    void removeAudioTrack(long j) {
        e(this.a, j);
    }

    void removeVideoTrack(long j) {
        e(this.b, j);
    }

    public final String toString() {
        String b = b();
        int size = this.a.size();
        int size2 = this.b.size();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 30);
        sb.append("[");
        sb.append(b);
        sb.append(":A=");
        sb.append(size);
        sb.append(":V=");
        sb.append(size2);
        sb.append("]");
        return sb.toString();
    }
}
