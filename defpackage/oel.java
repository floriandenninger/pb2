package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oel implements obs, obq, oev {
    public final obr a;
    public obo c;
    public int d;
    public int e;
    public obk f;
    public final SparseArray b = new SparseArray();
    private final aeb g = new aeb();

    public oel(obr obrVar) {
        this.a = obrVar;
    }

    public static boolean r(float f) {
        return f > 0.0f;
    }

    private static obk u(obp obpVar) {
        if (obpVar instanceof obk) {
            return (obk) obpVar;
        }
        return new obk(obpVar);
    }

    @Override // defpackage.oev
    public final Rect a() {
        return c().t();
    }

    public final int b() {
        return this.a.b;
    }

    public final obp c() {
        obk obkVar = this.f;
        return obkVar != null ? obkVar : d(this.a.b);
    }

    public final obp d(int i) {
        return (obp) this.b.get(i);
    }

    @Override // defpackage.obs
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.obs
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.obs
    public final boolean g() {
        throw null;
    }

    public final void h(obo oboVar) {
        oboVar.getClass();
        this.g.add(oboVar);
    }

    public final void i() {
        obp c = c();
        int i = 0;
        while (true) {
            aeb aebVar = this.g;
            if (i >= aebVar.b) {
                return;
            }
            ((obo) aebVar.b(i)).pa(c);
            i++;
        }
    }

    public final void j(int i, obp obpVar) {
        obk u = u(obpVar);
        this.b.put(i, u);
        u.K(this.c);
    }

    public final void k(obo oboVar) {
        this.g.remove(oboVar);
    }

    public final void l(obp obpVar) {
        obk obkVar = this.f;
        int i = obk.b;
        if (obpVar == null && obkVar == null) {
            return;
        }
        if (obkVar != null && obpVar == obk.b(obkVar.a)) {
            return;
        }
        if (obpVar != null) {
            obk u = u(obpVar);
            this.f = u;
            u.z(this.d, this.e);
            this.f.K(this.c);
        } else {
            this.f = null;
        }
        i();
    }

    public final boolean m() {
        return this.d > this.e;
    }

    public final boolean n() {
        return r(c().l());
    }

    @Override // defpackage.obq
    public final void o(int i) {
        i();
    }

    public final boolean p() {
        return r(c().m());
    }

    public final boolean q() {
        return r(c().q());
    }

    public final boolean s() {
        return this.a.c();
    }

    public final boolean t() {
        return this.a.d();
    }
}
