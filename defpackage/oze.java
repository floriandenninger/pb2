package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes4.dex */
class oze extends ozd {
    private final AudioTimestamp f = new AudioTimestamp();
    private long g;
    private long h;
    private long i;

    @Override // defpackage.ozd
    public final long d() {
        return this.i;
    }

    @Override // defpackage.ozd
    public final long e() {
        return this.f.nanoTime;
    }

    @Override // defpackage.ozd
    public void f(AudioTrack audioTrack, boolean z) {
        super.f(audioTrack, z);
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
    }

    @Override // defpackage.ozd
    public final boolean h() {
        boolean timestamp = this.a.getTimestamp(this.f);
        if (timestamp) {
            long j = this.f.framePosition;
            if (this.h > j) {
                this.g++;
            }
            this.h = j;
            this.i = j + (this.g << 32);
        }
        return timestamp;
    }
}
