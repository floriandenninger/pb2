package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hq {
    public final List a;
    public long b;
    public int c;
    public CharSequence d;
    public long e;
    public Bundle f;
    private int g;
    private long h;
    private long i;
    private float j;
    private long k;

    public hq() {
        this.a = new ArrayList();
        this.e = -1L;
    }

    public final PlaybackStateCompat a() {
        return new PlaybackStateCompat(this.g, this.h, this.i, this.j, this.b, this.c, this.d, this.k, this.a, this.e, this.f);
    }

    public final void b(int i, long j, float f, long j2) {
        this.g = i;
        this.h = j;
        this.k = j2;
        this.j = f;
    }

    public final void c(int i, long j, float f) {
        b(i, j, f, SystemClock.elapsedRealtime());
    }

    public hq(PlaybackStateCompat playbackStateCompat) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = -1L;
        this.g = playbackStateCompat.a;
        this.h = playbackStateCompat.b;
        this.j = playbackStateCompat.d;
        this.k = playbackStateCompat.h;
        this.i = playbackStateCompat.c;
        this.b = playbackStateCompat.e;
        this.c = playbackStateCompat.f;
        this.d = playbackStateCompat.g;
        List list = playbackStateCompat.i;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.e = playbackStateCompat.j;
        this.f = playbackStateCompat.k;
    }
}
