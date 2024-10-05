package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aapq implements aasa {
    private final ypa a;

    public aapq(ypa ypaVar) {
        ypaVar.getClass();
        this.a = ypaVar;
    }

    @Override // defpackage.aasa
    public final void c(arnd arndVar) {
        if (arndVar.d.isEmpty()) {
            return;
        }
        askp[] askpVarArr = null;
        for (arne arneVar : arndVar.d) {
            int dC = amkq.dC(arneVar.b);
            if (dC == 0) {
                dC = 1;
            }
            int i = dC - 1;
            if (i == 1) {
                HashMap hashMap = new HashMap();
                for (askp askpVar : arneVar.c) {
                    hashMap.put(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
                }
                this.a.d(new aapk(hashMap));
            } else if (i == 2) {
                this.a.d(new aapm((askp[]) arneVar.c.toArray(new askp[0])));
            } else if (i == 6) {
                askpVarArr = (askp[]) arneVar.c.toArray(new askp[0]);
            } else if (i == 7) {
                this.a.d(new aapr((askp[]) arneVar.c.toArray(new askp[0])));
            } else if (i == 8) {
                this.a.d(new aapp(arneVar.c));
            }
        }
        this.a.d(new aapl(askpVarArr));
    }

    @Override // defpackage.aasa
    public final /* synthetic */ void d(aaru aaruVar, arnd arndVar) {
        whu.U(this, arndVar);
    }

    @Override // defpackage.aasa
    public final /* synthetic */ boolean f(aaru aaruVar) {
        return true;
    }
}
