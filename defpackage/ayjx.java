package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjx implements Runnable {
    final /* synthetic */ aykx a;
    private final /* synthetic */ int b;

    public ayjx(aykx aykxVar, int i) {
        this.b = i;
        this.a = aykxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.G.a(2, "Entering SHUTDOWN state");
            this.a.q.a(ayae.SHUTDOWN);
            return;
        }
        if (i == 1) {
            this.a.e(true);
            return;
        }
        if (i == 2) {
            aykx aykxVar = this.a;
            if (aykxVar.B) {
                return;
            }
            aykxVar.B = true;
            aykxVar.g();
            return;
        }
        if (i == 3) {
            aykx aykxVar2 = this.a;
            aykxVar2.R = null;
            aykxVar2.j();
            return;
        }
        aykx aykxVar3 = this.a;
        aykxVar3.l(true);
        aykxVar3.y.a(null);
        aykxVar3.G.a(2, "Entering IDLE state");
        aykxVar3.q.a(ayae.IDLE);
        ayiy ayiyVar = aykxVar3.Q;
        Object[] objArr = {aykxVar3.x, aykxVar3.y};
        for (int i2 = 0; i2 < 2; i2++) {
            if (ayiyVar.a.contains(objArr[i2])) {
                aykxVar3.f();
                return;
            }
        }
    }
}
