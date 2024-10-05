package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pgl implements pcm {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ pgm c;

    public pgl(pgm pgmVar, long j, long j2) {
        this.c = pgmVar;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.pcm
    public final long b(long j) {
        return this.b + this.c.b[pgz.s(this.c.a, (j * this.a) / 1000000, true)];
    }

    @Override // defpackage.pcm
    public final boolean c() {
        return true;
    }
}
