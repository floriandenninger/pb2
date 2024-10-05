package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abzk implements afwx {
    private final Handler a;
    private final abxz b;

    public abzk(Handler handler, abxz abxzVar) {
        this.a = handler;
        this.b = abxzVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        abvt.b().n(7, 1, cnqVar);
        abxz abxzVar = this.b;
        if (abxzVar != null) {
            this.a.post(new abzj(abxzVar, 1));
        }
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        arvu arvuVar = (arvu) obj;
        if ((arvuVar.b & 4) != 0) {
            arvx arvxVar = arvuVar.d;
            if (arvxVar == null) {
                arvxVar = arvx.a;
            }
            int dx = amkq.dx(arvxVar.c);
            if (dx == 0 || dx == 1) {
                abvt.b().m(6);
                abxz abxzVar = this.b;
                if (abxzVar != null) {
                    this.a.post(new abzj(abxzVar, 0));
                    return;
                }
                return;
            }
        }
        abvt.b().n(7, 1, null);
        abxz abxzVar2 = this.b;
        if (abxzVar2 != null) {
            this.a.post(new abzj(abxzVar2, 1));
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
