package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tog implements anfz {
    public final /* synthetic */ tov a;
    public final /* synthetic */ tld b;
    private final /* synthetic */ int c;

    public /* synthetic */ tog(tov tovVar, tld tldVar, int i) {
        this.c = i;
        this.a = tovVar;
        this.b = tldVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.c;
        if (i == 0) {
            tov tovVar = this.a;
            tld tldVar = this.b;
            if (((tkv) obj) == null) {
                return anaf.O(null);
            }
            String str = tldVar.c;
            String str2 = tldVar.d;
            int i2 = tsx.a;
            tovVar.b.g(1049);
            return anfq.h(tovVar.d.i(tldVar), new toc(tovVar, 1), tovVar.h);
        }
        if (i != 1) {
            tov tovVar2 = this.a;
            tld tldVar2 = this.b;
            tkv tkvVar = (tkv) obj;
            if (tkvVar == null) {
                return anaf.O(null);
            }
            return tovVar2.n(tldVar2, tkvVar);
        }
        tov tovVar3 = this.a;
        tld tldVar3 = this.b;
        tkv tkvVar2 = (tkv) obj;
        String str3 = tldVar3.c;
        int i3 = tsx.a;
        tov.u(1018, tovVar3.b, tkvVar2);
        return amkq.n(tovVar3.l(tkvVar2, 0, tkvVar2.n.size()), new tod(tovVar3, tldVar3, tkvVar2, 6), tovVar3.h);
    }
}
