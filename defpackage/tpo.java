package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tpo implements anfz {
    public final /* synthetic */ tpp a;
    public final /* synthetic */ tlg b;
    public final /* synthetic */ tlh c;
    private final /* synthetic */ int d;

    public /* synthetic */ tpo(tpp tppVar, tlg tlgVar, tlh tlhVar, int i) {
        this.d = i;
        this.a = tppVar;
        this.b = tlgVar;
        this.c = tlhVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.d == 0) {
            tpp tppVar = this.a;
            return anfq.i(tppVar.b(tppVar.c.g(this.b, this.c)), new tph(tppVar, (ttj) obj, 3), tppVar.d);
        }
        tpp tppVar2 = this.a;
        return anfq.h(tppVar2.c.g(this.b, this.c), new lod((Boolean) obj, 6), tppVar2.d);
    }
}
