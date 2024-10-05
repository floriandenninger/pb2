package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xop implements ajde {
    final /* synthetic */ xpa a;
    final /* synthetic */ audq b;
    final /* synthetic */ audo c;
    final /* synthetic */ acra d;
    final /* synthetic */ xos e;

    public xop(xos xosVar, xpa xpaVar, audq audqVar, audo audoVar, acra acraVar) {
        this.e = xosVar;
        this.a = xpaVar;
        this.b = audqVar;
        this.c = audoVar;
        this.d = acraVar;
    }

    @Override // defpackage.ajde
    public final void a() {
        apyv apyvVar;
        apyx apyxVar = this.a.a().c;
        if (apyxVar == null) {
            apyxVar = apyx.a;
        }
        if (apyxVar.b == 62285947) {
            apyvVar = (apyv) apyxVar.c;
        } else {
            apyvVar = apyv.a;
        }
        this.e.c.k(apyvVar.i, this.b.k, apyk.COMMENT_POLL_STATUS_VOTE_AND_COMMENT);
    }

    @Override // defpackage.ajde
    public final void b() {
        this.e.a(this.a, this.b, this.c, apyk.COMMENT_POLL_STATUS_VOTE_AND_COMMENT, this.d);
    }

    @Override // defpackage.ajde
    public final void c(boolean z) {
    }
}
