package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acfz implements akbl {
    final /* synthetic */ acgf a;

    public acfz(acgf acgfVar) {
        this.a = acgfVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        if (i != 4) {
            acgf acgfVar = this.a;
            if (acgfVar.ax.m()) {
                ynm.n(acgfVar, acgfVar.aw.a.b(new aard(13), angq.a), zxq.n, zxq.o);
            } else {
                acgfVar.am.edit().putBoolean("PREF_HAS_SEEN_ORIENTATION_TOOLTIP", true).apply();
            }
        }
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
    }
}
