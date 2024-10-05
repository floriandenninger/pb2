package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vwy implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ vwz b;

    public vwy(vwz vwzVar, int i) {
        this.b = vwzVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vwz vwzVar = this.b;
        if (vwzVar.n != null) {
            vwzVar.s(this.a);
        }
    }
}
