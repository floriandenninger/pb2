package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dsv extends vw {
    final /* synthetic */ dsx d;

    public dsv(dsx dsxVar) {
        this.d = dsxVar;
        q(false);
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.b.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        dte d = ((dqx) this.d.b.get(i)).d();
        if (d.j()) {
            return this.d.F.c;
        }
        dsj dsjVar = this.d.d;
        if (dsjVar != null) {
            return ((ajzx) dsjVar).b.c(i);
        }
        return d.a();
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        dsx dsxVar = this.d;
        dtf dtfVar = dsxVar.F;
        if (i == dtfVar.c) {
            return new dsr(new dkp(dsxVar.f), true);
        }
        dsj dsjVar = dsxVar.d;
        if (dsjVar != null) {
            return ((ajzx) dsjVar).b.f(viewGroup, i);
        }
        dqo dqoVar = (dqo) dtfVar.a.get(i);
        Context context = this.d.f.b;
        return new dsr(dqoVar.a(), false);
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        return ((dqx) this.d.b.get(i)).a;
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        int i2;
        int i3;
        boolean z = dkl.b(null) && !this.d.A.isEmpty();
        dqx dqxVar = (dqx) this.d.b.get(i);
        dte d = dqxVar.d();
        if (d.j()) {
            dkp dkpVar = (dkp) wvVar.a;
            dkpVar.H(this.d.j);
            int o = this.d.o(dqxVar);
            int n = this.d.n(dqxVar);
            int i4 = -1;
            if (!dqxVar.r(o, n)) {
                dsx dsxVar = this.d;
                int i5 = dsxVar.u;
                if (i5 != -1 && (i3 = dsxVar.v) != -1) {
                    int i6 = i3 - i5;
                    if (i > i3) {
                        dsxVar.v(i, i6 + i, dtb.a);
                    } else if (i < i5) {
                        dsxVar.v(i - i6, i, dtb.b);
                    }
                }
                dqxVar.i(this.d.f, o, n, new dlo());
            }
            int h = this.d.H.h();
            if (View.MeasureSpec.getMode(o) == 1073741824) {
                i2 = View.MeasureSpec.getSize(o);
            } else {
                i2 = h != 0 ? -1 : -2;
            }
            if (View.MeasureSpec.getMode(n) == 1073741824) {
                i4 = View.MeasureSpec.getSize(n);
            } else if (h != 0) {
                i4 = -2;
            }
            d.h();
            dkpVar.setLayoutParams(new dsw(i2, i4, o, n));
            dkpVar.G(dqxVar.b());
            dkpVar.post(new dsu(dkpVar));
            dqxVar.d().n();
            if (z) {
                dsx dsxVar2 = this.d;
                dkpVar.B = new dkn(dsxVar2.B, dsxVar2.C, i == b(), 1 == h);
            } else {
                dkpVar.F();
            }
            ajzp ajzpVar = this.d.I;
            if (ajzpVar != null) {
                Iterator it = ajzpVar.a.d.iterator();
                while (it.hasNext()) {
                    ajon ajonVar = (ajon) it.next();
                    if (ajonVar instanceof gmj) {
                        ((gmj) ajonVar).a.al();
                    }
                }
            }
        } else {
            dsj dsjVar = this.d.d;
            if (dsjVar != null) {
                ((ajzx) dsjVar).b.o((ajor) wvVar, i);
            } else {
                dsr dsrVar = (dsr) wvVar;
                dqn c = d.c();
                int i7 = dsr.v;
                dsrVar.u = null;
                View view = dsrVar.a;
                c.a();
            }
        }
        boolean z2 = doa.a;
    }

    @Override // defpackage.vw
    public final void p(wv wvVar) {
        if (wvVar instanceof dsr) {
            dsr dsrVar = (dsr) wvVar;
            int i = dsr.v;
            if (!dsrVar.t) {
                dqn dqnVar = dsrVar.u;
                return;
            }
            dkp dkpVar = (dkp) wvVar.a;
            dkpVar.K();
            dkpVar.G(null);
            dkpVar.H(null);
            dkpVar.F();
            return;
        }
        ((ajzx) this.d.d).b.p((ajor) wvVar);
    }
}
