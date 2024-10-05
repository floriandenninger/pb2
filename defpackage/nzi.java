package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nzi implements nzo {
    private static final amvf a;
    private static final amvf b;
    private amvf c = a;

    static {
        Float valueOf = Float.valueOf(1.777f);
        a = amvf.d(valueOf, valueOf);
        Float valueOf2 = Float.valueOf(1.25f);
        b = amvf.d(valueOf2, valueOf2);
    }

    @Override // defpackage.nzo
    public final int a() {
        return 0;
    }

    @Override // defpackage.nzo
    public final amvf b(float f) {
        amkq.E(f >= 0.0f);
        if (evr.bx(f, ((Float) this.c.g()).floatValue())) {
            return this.c;
        }
        if (evr.bz(f)) {
            amvf amvfVar = a;
            this.c = amvfVar;
            return amvfVar;
        }
        if (evr.by(f, 1.25f)) {
            amvf amvfVar2 = b;
            this.c = amvfVar2;
            return amvfVar2;
        }
        Float valueOf = Float.valueOf(f);
        amvf d = amvf.d(valueOf, valueOf);
        this.c = d;
        return d;
    }
}
