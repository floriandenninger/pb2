package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wbj implements afwx {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ wbk c;

    public wbj(wbk wbkVar, Runnable runnable, Runnable runnable2) {
        this.c = wbkVar;
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zaw zawVar = this.c.b;
        zawVar.d(zawVar.b(cnqVar));
        this.a.run();
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        this.c.a((arku) obj, 3, this.b, this.a);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
