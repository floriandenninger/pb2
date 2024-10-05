package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahif implements ahfq {
    public float a;
    private final ahie b;
    private final ahfp c = new ahfp();
    private final float d;

    public ahif(ahie ahieVar, float f, float f2) {
        this.b = ahieVar;
        this.a = f;
        this.d = f2;
    }

    @Override // defpackage.ahfq
    public final void a(boolean z, long j) {
        this.c.b(z, j);
        float a = this.c.a();
        this.b.k((this.d * a) + ((1.0f - a) * this.a));
    }
}
