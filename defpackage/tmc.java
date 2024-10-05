package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class tmc implements anhh {
    final /* synthetic */ tkn a;
    final /* synthetic */ String b;
    final /* synthetic */ tmd c;

    public tmc(tmd tmdVar, tkn tknVar, String str) {
        this.c = tmdVar;
        this.a = tknVar;
        this.b = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.a.c.h() && this.c.g.h()) {
            ((ttu) this.c.g.c()).h(this.b);
        }
    }
}
