package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dsy implements Runnable {
    final /* synthetic */ dsz a;

    public dsy(dsz dszVar) {
        this.a = dszVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dti dtiVar = this.a.a;
        if (dtiVar == null || !dtiVar.b) {
            return;
        }
        dtiVar.l(false);
    }
}
