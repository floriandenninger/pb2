package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afce extends afap {
    private static final afbz l = new afby(aeru.c);
    public final Handler b;
    public final List c;
    public final List d;
    public aerv e;
    public afbz f;
    aesa g;
    public boolean h;
    public afqu i;
    public afcb j;
    public final afhs k;
    private boolean m;
    private boolean n;

    public afce(afec afecVar, afhs afhsVar) {
        super(afecVar);
        this.b = new Handler(Looper.getMainLooper());
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = l;
        this.g = aesa.a;
        this.k = afhsVar;
    }

    private final void O(long j) {
        this.m = true;
        this.b.removeCallbacksAndMessages(null);
        afeb afebVar = (afeb) this.d.remove(0);
        afic aficVar = afic.ABR;
        this.f.A(j);
        aerv aervVar = this.e;
        String str = aervVar != null ? aervVar.d : null;
        String str2 = aervVar != null ? aervVar.b.c : null;
        afbz afbzVar = (afbz) afebVar.b.a();
        if (str != null) {
            this.j = new afcb(this.f, afbzVar, afebVar, false, str, str2);
        }
        this.f = (afbz) afebVar.b.a();
        aerv aervVar2 = new aerv(afebVar.b);
        aerv aervVar3 = this.e;
        aervVar2.f = aervVar3 != null ? aervVar3.b() : null;
        aerv aervVar4 = this.e;
        aervVar2.s(Integer.valueOf((aervVar4 != null ? aervVar4.k : 0) | 2));
        this.e = aervVar2;
        this.g = aervVar2.a;
        this.a.K(this.e);
        this.b.post(new afbx(this, 0));
    }

    public final void A() {
        while (!this.d.isEmpty()) {
            afeb afebVar = (afeb) this.d.get(0);
            if (!super.J(afebVar)) {
                break;
            }
            this.c.add(afebVar);
            this.d.remove(afebVar);
        }
        H(false);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void B(long j, aupb aupbVar) {
        this.n = false;
        super.B(j, aupbVar);
    }

    public final void E() {
        this.c.clear();
        this.d.clear();
        this.e = null;
        this.g = aesa.a;
        this.i = null;
        this.j = null;
        this.f = l;
        this.n = false;
    }

    @Override // defpackage.afap, defpackage.afec
    public final void F(boolean z) {
        E();
        super.F(z);
    }

    public final void H(boolean z) {
        if (this.m || !this.c.isEmpty() || this.d.isEmpty()) {
            return;
        }
        afeb afebVar = (afeb) this.d.get(0);
        if (z) {
            if (this.e != null) {
                if (aedn.h(afebVar.b, 4)) {
                    this.n = true;
                    return;
                } else {
                    O(this.e.b.d);
                    return;
                }
            }
            this.f.g(new afih("player.exception", g(), "nullStreamingData"));
            O(-1L);
            return;
        }
        if (afebVar.a != -1) {
            long g = g();
            if (afebVar.a <= g) {
                O(g);
            } else if (this.h || (I() && !G())) {
                this.h = false;
                this.b.postDelayed(new afbx(this, 1), afebVar.a - g);
            }
        }
    }

    @Override // defpackage.afap, defpackage.afec
    public final boolean J(afeb afebVar) {
        if (this.f == l) {
            return false;
        }
        afeb a = afebVar.a(new afcd(this, afebVar.b.a()));
        if (!this.d.isEmpty() || !super.J(a)) {
            this.d.add(a);
            H(false);
            return true;
        }
        this.c.add(a);
        return true;
    }

    @Override // defpackage.afap, defpackage.afec
    public final afqu K(aerv aervVar) {
        this.c.clear();
        this.d.clear();
        this.n = false;
        this.f = new afcd(this, aervVar.a());
        aerv aervVar2 = new aerv(aervVar);
        aervVar2.g = this.f;
        this.e = aervVar2;
        this.g = aervVar.a;
        this.m = true;
        this.h = false;
        return this.a.K(this.e);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void M() {
        E();
        super.M();
    }

    @Override // defpackage.afap, defpackage.afec
    public final void p(afky afkyVar) {
        aerv aervVar = this.e;
        if (aervVar != null) {
            aervVar.f = afkyVar;
        }
        super.p(afkyVar);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void q() {
        super.q();
        this.c.clear();
        this.d.clear();
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void s() {
        aerv aervVar = this.e;
        if (aervVar != null) {
            aervVar.f = null;
        }
        super.s();
    }

    public final void u(String str) {
        this.g.f("qpe", str);
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void w() {
        this.n = false;
        if (!this.c.isEmpty()) {
            super.w();
        } else {
            if (this.d.isEmpty()) {
                return;
            }
            O(g());
        }
    }

    @Override // defpackage.afap, defpackage.afcx
    public final void x() {
        if (!this.n || !this.c.isEmpty() || this.d.isEmpty()) {
            super.x();
        } else {
            this.n = false;
            O(g());
        }
    }
}
