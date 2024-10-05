package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xvp implements akbl {
    final /* synthetic */ xvt a;

    public xvp(xvt xvtVar) {
        this.a = xvtVar;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.a.o.getViewTreeObserver().removeOnScrollChangedListener(this.a.y);
        this.a.z = true;
    }
}
