package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nzp implements nzo {
    private static final amvf a;
    private static final amvf b;
    private final boolean c;
    private amvf d = a;

    static {
        Float valueOf = Float.valueOf(1.777f);
        a = amvf.d(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.333f);
        b = amvf.d(valueOf2, valueOf2);
    }

    public nzp(aadw aadwVar) {
        asvu asvuVar = aadwVar.b().e;
        this.c = (asvuVar == null ? asvu.a : asvuVar).co;
    }

    @Override // defpackage.nzo
    public final int a() {
        return 0;
    }

    @Override // defpackage.nzo
    public final amvf b(float f) {
        amkq.E(f >= 0.0f);
        if (f == ((Float) this.d.g()).floatValue()) {
            return this.d;
        }
        if (f >= 1.777f) {
            this.d = a;
        } else if (f >= 1.333f) {
            Float valueOf = Float.valueOf(f);
            this.d = amvf.d(valueOf, valueOf);
        } else {
            this.d = this.c ? amvf.d(Float.valueOf(f), Float.valueOf(1.333f)) : b;
        }
        return this.d;
    }
}
