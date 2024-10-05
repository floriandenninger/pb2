package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tpn implements anfz {
    public final /* synthetic */ tpp a;
    public final /* synthetic */ tlg b;
    private final /* synthetic */ int c;

    public /* synthetic */ tpn(tpp tppVar, tlg tlgVar, int i) {
        this.c = i;
        this.a = tppVar;
        this.b = tlgVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.c == 0) {
            tpp tppVar = this.a;
            return anfq.i(tppVar.b(tppVar.c.f(this.b)), new tph(tppVar, (ttj) obj, 2), tppVar.d);
        }
        tpp tppVar2 = this.a;
        return anfq.i(tppVar2.b(tppVar2.c.e(this.b)), new tph(tppVar2, (ttj) obj, 0), tppVar2.d);
    }
}
