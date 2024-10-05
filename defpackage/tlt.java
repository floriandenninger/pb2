package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tlt implements anfz {
    public final /* synthetic */ tmd a;
    private final /* synthetic */ int b;

    public /* synthetic */ tlt(tmd tmdVar, int i) {
        this.b = i;
        this.a = tmdVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a.g();
        }
        if (i == 1) {
            tqd tqdVar = this.a.d;
            int i2 = tsx.a;
            return anfq.i(tqdVar.c(), new tpu(tqdVar, 9), tqdVar.n);
        }
        tmd tmdVar = this.a;
        return anfq.h(tmdVar.i((tkv) obj, null, 2), rtp.m, tmdVar.f);
    }
}
