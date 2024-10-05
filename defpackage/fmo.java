package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fmo implements azrw {
    final /* synthetic */ fmt a;

    public fmo(fmt fmtVar) {
        this.a = fmtVar;
    }

    @Override // defpackage.azrw
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer get() {
        int i;
        fmt fmtVar = this.a;
        if (!fmtVar.d.d(fmtVar.r).h()) {
            i = this.a.h;
        } else {
            i = this.a.c.p;
        }
        return Integer.valueOf(i);
    }
}
