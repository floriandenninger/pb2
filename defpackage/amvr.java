package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvr extends amsr {
    static final amvr a = new amvr(new amvc());
    public final transient amvc b;
    private final transient int c;
    private transient amsx d;

    public amvr(amvc amvcVar) {
        this.b = amvcVar;
        long j = 0;
        for (int i = 0; i < amvcVar.c; i++) {
            j += amvcVar.c(i);
        }
        this.c = anaf.ag(j);
    }

    @Override // defpackage.amuw
    public final int a(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.amrl
    public final boolean l() {
        throw null;
    }

    @Override // defpackage.amsr, defpackage.amuw
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final amsx i() {
        amsx amsxVar = this.d;
        if (amsxVar != null) {
            return amsxVar;
        }
        amvp amvpVar = new amvp(this);
        this.d = amvpVar;
        return amvpVar;
    }

    @Override // defpackage.amsr
    public final amux p(int i) {
        return this.b.m(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amuw
    public final int size() {
        return this.c;
    }

    @Override // defpackage.amsr, defpackage.amrl
    Object writeReplace() {
        return new amvq(this);
    }
}
