package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aggw implements agjt {
    final /* synthetic */ aghc a;

    public aggw(aghc aghcVar) {
        this.a = aghcVar;
    }

    @Override // defpackage.agjt
    public final void a(agnp agnpVar) {
        String f = agnpVar.f();
        aone createBuilder = atqv.a.createBuilder();
        createBuilder.copyOnWrite();
        atqv atqvVar = (atqv) createBuilder.instance;
        f.getClass();
        atqvVar.b |= 1;
        atqvVar.d = f;
        createBuilder.copyOnWrite();
        atqv atqvVar2 = (atqv) createBuilder.instance;
        atqvVar2.h = 11;
        atqvVar2.b |= 16;
        ((agmu) this.a.c.get()).c((atqv) createBuilder.build());
    }
}
