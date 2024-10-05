package defpackage;

import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeyh {
    public final aeyg a;
    public final aeyg b;

    public aeyh(bfg bfgVar, Looper looper, ayr ayrVar, bbx bbxVar, long j, byte[] bArr) {
        this.a = new aeyg(bfgVar, looper, ayrVar, bbxVar, j, null);
        this.b = new aeyg(bfgVar, looper, ayrVar, bbxVar, j, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(List list) {
        if (list.isEmpty()) {
            return 0L;
        }
        aeyg c = c((ovw) list.get(0));
        long g = c.a.g();
        boolean z = c.d;
        for (int i = 1; i < ((amvj) list).c; i++) {
            aeyg c2 = c((ovw) list.get(i));
            g = Math.min(g, c2.a.g());
            z &= c2.d;
        }
        if (z) {
            return Long.MIN_VALUE;
        }
        return Math.max(0L, g);
    }

    public final bcx b(ovw ovwVar, pms pmsVar) {
        aeyg aeygVar = ovwVar == ovw.TRACK_TYPE_VIDEO ? this.b : this.a;
        afki.a(pmsVar);
        if (!pmsVar.equals(aeygVar.b) || aeygVar.a.i() == null) {
            aeygVar.a.rp(pmsVar);
            aeygVar.b = pmsVar;
        }
        return aeygVar.a;
    }

    public final aeyg c(ovw ovwVar) {
        return ovwVar == ovw.TRACK_TYPE_VIDEO ? this.b : this.a;
    }
}
