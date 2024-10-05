package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aets implements Runnable {
    public final /* synthetic */ aett a;
    private final /* synthetic */ int b;

    public /* synthetic */ aets(aett aettVar, int i) {
        this.b = i;
        this.a = aettVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.b == 0) {
            aett aettVar = this.a;
            aettVar.f = null;
            aezf aezfVar = aettVar.c.n;
            if (aezfVar == null || !aezfVar.I || aezfVar.H) {
                return;
            }
            aezg aezgVar = aezfVar.c;
            if (!aezgVar.h && aezgVar.b == 2) {
                aezfVar.b.i("sbf", new aeqs("1"));
                if (!aezfVar.b().v) {
                    z = aezfVar.L.p().ad;
                } else {
                    z = aezfVar.L.p().ac;
                }
                if (z) {
                    aezfVar.b.g(new afih("android.stuck.bufferfull", ((Long) aettVar.b.get()).longValue()));
                    return;
                }
                return;
            }
            return;
        }
        aett aettVar2 = this.a;
        aezf aezfVar2 = aettVar2.c.n;
        int i = 0;
        if (aezfVar2 == null || aezfVar2.H || aezfVar2.c.h) {
            aettVar2.e = false;
            return;
        }
        int i2 = 1;
        if (!aezfVar2.I) {
            long longValue = ((Long) aettVar2.a.get()).longValue();
            long longValue2 = ((Long) aettVar2.b.get()).longValue();
            long j = (longValue == -1 || longValue2 == -1 || longValue < longValue2) ? -1L : longValue - longValue2;
            if (j != -1 && j >= aezfVar2.a().t() && !aezfVar2.I) {
                aezfVar2.I = true;
            }
        }
        aquz aquzVar = aezfVar2.a().c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        boolean z2 = aquzVar.bu && aezfVar2.b().v && !aezfVar2.f40J;
        if (!aezfVar2.I || z2) {
            aettVar2.d.postDelayed(new aets(aettVar2, i2), 1000L);
            return;
        }
        aettVar2.e = false;
        aettVar2.f = new aets(aettVar2, i);
        aettVar2.d.postDelayed(aettVar2.f, Math.max(aezfVar2.L.p().ae, 2000L));
    }
}
