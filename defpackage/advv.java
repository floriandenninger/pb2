package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class advv implements amnv {
    public final /* synthetic */ aemv a;
    private final /* synthetic */ int b;

    public /* synthetic */ advv(aemv aemvVar, int i) {
        this.b = i;
        this.a = aemvVar;
    }

    @Override // defpackage.amnv
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            return this.a.e;
        }
        if (i == 1) {
            return Integer.valueOf(this.a.c.b());
        }
        if (i == 2) {
            return this.a.i();
        }
        if (i == 3) {
            aemv aemvVar = this.a;
            yjk.f();
            return aemvVar.c.n();
        }
        aemv aemvVar2 = this.a;
        yjk.f();
        return Integer.valueOf(aemvVar2.c.e());
    }
}
