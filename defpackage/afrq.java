package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afrq implements yok {
    yok a;
    final /* synthetic */ afrr b;
    private final boolean c;
    private final boolean d;

    public afrq(afrr afrrVar) {
        this.b = afrrVar;
        boolean z = afrrVar.c;
        boolean z2 = !z;
        this.c = z2;
        this.d = z;
        if (!z || !afrrVar.d) {
            this.a = afrrVar.a.a();
            afrrVar.b.a();
            boolean z3 = false;
            if (z && !this.a.hasNext()) {
                z3 = true;
            }
            afrrVar.d = z3;
            if (!z2) {
                this.a.getClass();
                throw null;
            }
            throw null;
        }
        afrrVar.b.a();
    }

    @Override // defpackage.yok
    public final void a() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        throw null;
    }
}
