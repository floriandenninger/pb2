package org.webrtc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class MediaStreamTrack {
    private long a;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int d;

        MediaType(int i) {
            this.d = i;
        }

        static MediaType fromNativeIndex(int i) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown native media type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getNative() {
            return this.d;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum State {
        LIVE,
        ENDED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaStreamTrack(long j) {
        if (j == 0) {
            throw new IllegalArgumentException("nativeTrack may not be null");
        }
        this.a = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MediaStreamTrack c(long j) {
        if (j == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j);
        if (nativeGetKind.equals("audio")) {
            return new AudioTrack(j);
        }
        if (nativeGetKind.equals("video")) {
            return new VideoTrack(j);
        }
        return null;
    }

    private final void g() {
        if (this.a == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    private static native boolean nativeGetEnabled(long j);

    private static native String nativeGetId(long j);

    private static native String nativeGetKind(long j);

    private static native State nativeGetState(long j);

    private static native boolean nativeSetEnabled(long j, boolean z);

    public final long a() {
        g();
        return this.a;
    }

    public final String b() {
        g();
        return nativeGetId(this.a);
    }

    public void d() {
        g();
        JniCommon.nativeReleaseRef(this.a);
        this.a = 0L;
    }

    public final boolean e() {
        g();
        return nativeGetEnabled(this.a);
    }

    public final boolean f(boolean z) {
        g();
        return nativeSetEnabled(this.a, z);
    }
}
