package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dqh implements duh {
    final /* synthetic */ dpt a;

    public dqh(dpt dptVar) {
        this.a = dptVar;
    }

    @Override // defpackage.duh
    public final void a(int i, int i2, int i3, int i4, int i5) {
        dpi dpiVar;
        dpt dptVar = this.a;
        synchronized (dptVar) {
            dpiVar = dptVar.c;
        }
        if (dpiVar != null) {
            dptVar.j(dpiVar, i, i2, i3, i4, i5);
        }
    }
}
