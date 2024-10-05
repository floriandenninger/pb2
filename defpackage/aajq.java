package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aajq implements Callable {
    public final /* synthetic */ aajv a;
    public final /* synthetic */ String b;
    public final /* synthetic */ aypy c;
    private final /* synthetic */ int d;

    public /* synthetic */ aajq(aajv aajvVar, String str, aypy aypyVar, int i) {
        this.d = i;
        this.a = aajvVar;
        this.b = str;
        this.c = aypyVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.d == 0) {
            return this.c.ag(this.a.f(this.b).x(zcz.n).j(amlr.a).P());
        }
        aajv aajvVar = this.a;
        String str = this.b;
        aypy aypyVar = this.c;
        ayps x = wbs.L(aajvVar.c.e(str)).x(new fjx(str, 14));
        aakx a = aakz.a();
        a.c(str);
        return aypyVar.ag(x.j(a.a()).P());
    }
}
