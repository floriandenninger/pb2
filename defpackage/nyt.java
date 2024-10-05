package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nyt implements nzo {
    private static final amvf a;
    private amvf b = a;

    static {
        Float valueOf = Float.valueOf(1.777f);
        a = amvf.d(valueOf, valueOf);
    }

    @Override // defpackage.nzo
    public final int a() {
        return 0;
    }

    @Override // defpackage.nzo
    public final amvf b(float f) {
        amkq.E(f >= 0.0f);
        if (f == ((Float) this.b.g()).floatValue()) {
            return this.b;
        }
        if (f >= 1.777f) {
            return a;
        }
        amvf d = amvf.d(Float.valueOf(f), Float.valueOf(1.777f));
        this.b = d;
        return d;
    }
}
