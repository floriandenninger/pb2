package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsa {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ dsx d;

    public dsa(dsx dsxVar, int i, int i2, int i3) {
        this.d = dsxVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean a(int i) {
        dsx dsxVar = this.d;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        synchronized (dsxVar) {
            if (i4 != dsxVar.b.size()) {
                return false;
            }
            dqx dqxVar = (dqx) dsxVar.b.get(i);
            if (!dqxVar.d().k()) {
                int o = dsxVar.o(dqxVar);
                int n = dsxVar.n(dqxVar);
                if ((i < i2 && !dqxVar.d().i()) || i > i3) {
                    if (did.t()) {
                        dsx.x(dqxVar);
                    } else {
                        dsxVar.g.post(new dsb(dqxVar, 0));
                    }
                } else if (!dqxVar.r(o, n)) {
                    dqxVar.g(dsxVar.f, o, n);
                    return true;
                }
            }
            return true;
        }
    }
}
