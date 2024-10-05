package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class awi {
    public final AudioTrack a;
    public final AudioTimestamp b = new AudioTimestamp();
    public long c;
    public long d;
    public long e;

    public awi(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.b.nanoTime / 1000;
    }
}
