package defpackage;

import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
class ozd {
    protected AudioTrack a;
    public long b;
    public long c;
    public long d;
    public long e;
    private boolean f;
    private int g;
    private long h;
    private long i;
    private long j;

    public float a() {
        return 1.0f;
    }

    public final long b() {
        if (this.b != -1) {
            return Math.min(this.e, this.d + ((((SystemClock.elapsedRealtime() * 1000) - this.b) * this.g) / 1000000));
        }
        int playState = this.a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.a.getPlaybackHeadPosition() & 4294967295L;
        if (this.f) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.j = this.h;
                }
                playState = 2;
            }
            playbackHeadPosition += this.j;
        }
        if (pgz.a <= 26) {
            if (playbackHeadPosition == 0 && this.h > 0 && playState == 3) {
                if (this.c == -1) {
                    this.c = SystemClock.elapsedRealtime();
                }
                return this.h;
            }
            this.c = -1L;
        }
        if (this.h > playbackHeadPosition) {
            this.i++;
        }
        this.h = playbackHeadPosition;
        return playbackHeadPosition + (this.i << 32);
    }

    public final long c() {
        return (b() * 1000000) / this.g;
    }

    public long d() {
        throw new UnsupportedOperationException();
    }

    public long e() {
        throw new UnsupportedOperationException();
    }

    public void f(AudioTrack audioTrack, boolean z) {
        this.a = audioTrack;
        this.f = z;
        this.b = -1L;
        this.c = -1L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        if (audioTrack != null) {
            this.g = audioTrack.getSampleRate();
        }
    }

    public void g(PlaybackParams playbackParams) {
        throw new UnsupportedOperationException();
    }

    public boolean h() {
        return false;
    }
}
