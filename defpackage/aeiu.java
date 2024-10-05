package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeiu extends ozz {
    public final MediaFormat m;
    public final pcm n;
    private final long o;
    private boolean p;

    public aeiu(pfq pfqVar, pfs pfsVar, ozv ozvVar, MediaFormat mediaFormat, pcm pcmVar, long j) {
        super(pfqVar, pfsVar, 1, ozvVar, 0L, 0L, -1, true, -1);
        this.m = mediaFormat;
        this.n = pcmVar;
        this.o = j;
    }

    @Override // defpackage.ozk
    public final long a() {
        return this.o;
    }

    @Override // defpackage.ozz
    public final MediaFormat e() {
        return this.m;
    }

    @Override // defpackage.ozz
    public final pbg h() {
        return null;
    }

    @Override // defpackage.pgc
    public final void i() {
        this.p = true;
    }

    @Override // defpackage.pgc
    public final void k() {
    }

    @Override // defpackage.pgc
    public final boolean l() {
        return this.p;
    }
}
