package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bkn implements bkm {
    private final int a;
    private final int b;
    private final pth c;

    public bkn(bkj bkjVar, pms pmsVar) {
        pth pthVar = bkjVar.a;
        this.c = pthVar;
        pthVar.G(12);
        int l = pthVar.l();
        if ("audio/raw".equals(pmsVar.n)) {
            int j = pts.j(pmsVar.C, pmsVar.A);
            if (l == 0 || l % j != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(j);
                sb.append(", stsz sample size: ");
                sb.append(l);
                Log.w("AtomParsers", sb.toString());
                l = j;
            }
        }
        this.a = l == 0 ? -1 : l;
        this.b = pthVar.l();
    }

    @Override // defpackage.bkm
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bkm
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bkm
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.l() : i;
    }
}
