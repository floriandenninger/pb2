package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjc implements ayqk {
    final /* synthetic */ zjd a;

    public zjc(zjd zjdVar) {
        this.a = zjdVar;
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.ayqk, defpackage.aypt
    public final void sc(Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.ayqk, defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        zjd zjdVar = this.a;
        zjdVar.a.set(ayqxVar);
        if (zjdVar.isCancelled()) {
            zjdVar.c();
        }
    }
}
