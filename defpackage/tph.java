package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tph implements anfz {
    public final /* synthetic */ tpp a;
    public final /* synthetic */ ttj b;
    private final /* synthetic */ int c;

    public /* synthetic */ tph(tpp tppVar, ttj ttjVar, int i) {
        this.c = i;
        this.a = tppVar;
        this.b = ttjVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.c;
        if (i == 0) {
            return this.a.h(this.b, (ttj) obj, 1100);
        }
        if (i == 1) {
            return this.a.h(this.b, (ttj) obj, 1104);
        }
        if (i == 2) {
            return this.a.h(this.b, (ttj) obj, 1102);
        }
        return this.a.h(this.b, (ttj) obj, 1101);
    }
}
