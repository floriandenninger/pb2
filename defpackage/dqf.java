package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dqf extends dlq {

    @dnt(a = 13)
    dqr a;

    @dnt(a = 3)
    boolean b;

    @dnt(a = 13)
    dqi c;

    @dnt(a = 13)
    dpt d;

    @dnt(a = 13)
    drm e;

    @dnt(a = 13)
    dsz f;

    @dnt(a = 13)
    wg g;

    @dnt(a = 13)
    doz h;

    @Override // defpackage.dlq
    public final void a(dlp dlpVar) {
        Object[] objArr = dlpVar.b;
        int i = dlpVar.a;
        if (i == Integer.MIN_VALUE) {
            this.b = ((Boolean) objArr[0]).booleanValue();
        } else {
            if (i != 0) {
                return;
            }
            baql baqlVar = new baql();
            baqlVar.a = this.c;
            dqk.d(baqlVar, (dqi) objArr[0]);
            this.c = (dqi) baqlVar.a;
        }
    }
}
