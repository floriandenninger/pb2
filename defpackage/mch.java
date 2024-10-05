package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mch extends ajsv {
    final /* synthetic */ mbn a;
    final /* synthetic */ ajwi b;
    final /* synthetic */ Cfor c;
    final /* synthetic */ String d;
    final /* synthetic */ fzb e;
    final /* synthetic */ acra f;

    public mch(mbn mbnVar, ajwi ajwiVar, Cfor cfor, String str, fzb fzbVar, acra acraVar) {
        this.a = mbnVar;
        this.b = ajwiVar;
        this.c = cfor;
        this.d = str;
        this.e = fzbVar;
        this.f = acraVar;
    }

    @Override // defpackage.ajsv, defpackage.ajww
    public final void c(aamd aamdVar, boolean z) {
        if (!z) {
            this.a.j();
            return;
        }
        fzm a = mcy.a(this.a, this.b, this.c);
        a.a = this.d;
        fzn a2 = a.a();
        if (!mcy.f(this.d)) {
            if (this.a.m()) {
                mcy.c(this.a.r(aamdVar), this.e, a2);
            }
        } else {
            if (!mcy.d(aamdVar)) {
                this.a.h();
                this.e.i();
            }
            if (this.a.n()) {
                return;
            }
            mcy.c(this.a.l(aamdVar, this.b, this.f), this.e, a2);
        }
    }
}
