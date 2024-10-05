package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ajss extends ajuf implements View.OnClickListener, ajvp, ajwx {

    /* renamed from: J, reason: collision with root package name */
    private final ajnw f62J;
    private final ayqx K;
    private final List L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private ajce Q;
    private ajce R;
    private final List a;
    private final Map b;
    private final ajvd c;
    private final ajxa d;
    private final ajwk e;
    public final ajoc f;
    public final ajoo g;
    public final List h;
    public final ypa i;
    public final aaea j;
    public final ajsq k;
    public ajng l;
    public ajng m;
    public boolean n;
    public String o;
    public Runnable p;
    public final Object q;
    public boolean r;
    public ajwo s;
    public ajsn t;

    public ajss(ajxe ajxeVar, ajoo ajooVar, ajvq ajvqVar, aasm aasmVar, ypa ypaVar, ajvd ajvdVar, zaw zawVar, acra acraVar, ajxa ajxaVar, ajwk ajwkVar, aaea aaeaVar, aypn aypnVar, Queue queue) {
        super(ajxe.a(ajxeVar), aasmVar, ypaVar, ypa.c(), zawVar, acraVar, queue);
        this.o = "";
        this.q = new Object();
        this.g = ajooVar;
        ypaVar.getClass();
        this.i = ypaVar;
        ajvdVar.getClass();
        this.c = ajvdVar;
        ajxaVar.getClass();
        this.d = ajxaVar;
        ajwkVar.getClass();
        this.e = ajwkVar;
        this.j = aaeaVar;
        ajoc ajocVar = new ajoc();
        this.f = ajocVar;
        this.h = new ArrayList();
        this.a = new ArrayList();
        this.L = new ArrayList();
        this.b = new HashMap();
        ajsq ajsqVar = new ajsq(this, ajvqVar);
        this.k = ajsqVar;
        this.P = true;
        this.r = true;
        this.t = null;
        if (ajxeVar instanceof ajsr) {
            ajsr ajsrVar = (ajsr) ajxeVar;
            n(ajsrVar.a, ajsrVar.b);
            ajsqVar.c(ajsrVar.c);
            this.R = ajsrVar.d;
        }
        this.K = aypnVar.s(new ayrw() { // from class: ajsp
            @Override // defpackage.ayrw
            public final boolean a(Object obj) {
                return TextUtils.equals(((zbo) obj).d(), ajss.this.o);
            }
        }).X(new ayrs() { // from class: ajso
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                ajss ajssVar = ajss.this;
                zbo zboVar = (zbo) obj;
                apxf b = zboVar.b();
                int a = zboVar.a();
                synchronized (ajssVar.q) {
                    asuj asujVar = ajssVar.j.a().m;
                    if (asujVar == null) {
                        asujVar = asuj.a;
                    }
                    asiu asiuVar = asujVar.c;
                    if (asiuVar == null) {
                        asiuVar = asiu.a;
                    }
                    if (asiuVar.k && b != null && a != 0) {
                        ajssVar.t = new ajsn(ajssVar, a);
                        ajssVar.r = false;
                    } else {
                        ajssVar.t = null;
                        ajssVar.r = true;
                    }
                }
                ajssVar.lz(zboVar.c(), zboVar.b());
            }
        });
        ajooVar.h(ajocVar);
        ajnw ajnwVar = new ajnw(acraVar);
        this.f62J = ajnwVar;
        ajooVar.rU(ajnwVar);
        ajooVar.rU(new ajnw(acraVar));
        ajooVar.rU(new ajwy(this));
        ajooVar.g(ajsqVar);
        ajsqVar.d(this.G, null);
    }

    private final void al() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((ajvc) it.next()).j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(Object obj, ajxe ajxeVar) {
        ajvc a = this.c.a(obj, ajxeVar, this);
        if (a != 0) {
            this.h.add(a);
            this.a.add(obj);
            this.f.n(o(), a.lC());
            String lx = a instanceof ajus ? ((ajus) a).lx() : null;
            if (!TextUtils.isEmpty(lx)) {
                this.b.put(lx, a);
            }
            if (a instanceof ajtz) {
                ajtz ajtzVar = (ajtz) a;
                if (ak(ajtzVar)) {
                    K(ajtzVar);
                }
            }
        }
    }

    private final void n(List list, List list2) {
        ajng ajngVar;
        if (!this.n && (ajngVar = this.l) != null && this.f.i(ajngVar) == -1) {
            this.f.o(this.l);
        }
        Iterator it = list.iterator();
        Iterator it2 = list2 != null ? list2.iterator() : null;
        while (it.hasNext()) {
            m(it.next(), (it2 == null || !it2.hasNext()) ? null : (ajxe) it2.next());
        }
        this.k.b(null);
        ajng ajngVar2 = this.m;
        if (ajngVar2 != null && this.f.i(ajngVar2) == -1) {
            this.f.m(this.m);
        }
        this.n = true;
    }

    public final void A() {
        C(true);
    }

    @Override // defpackage.ajtz
    public final void B() {
        super.B();
        this.Q = null;
        ajsq ajsqVar = this.k;
        ajvo ajvoVar = ajsqVar.b;
        if (ajvoVar != null) {
            ajsqVar.c(ajvoVar.a);
        }
        ajvq ajvqVar = ajsqVar.a;
        if (ajvqVar != null) {
            ajvqVar.clear();
        }
        ajsqVar.b = null;
    }

    public final void C(boolean z) {
        this.n = false;
        if (z) {
            r0 = this.l != null ? 1 : 0;
            if (this.O) {
                r0++;
            }
        }
        ajoc ajocVar = this.f;
        if (r0 > 0) {
            int h = ajocVar.h() - 1;
            yjk.f();
            if (!ajocVar.a.isEmpty() && r0 <= h && h < ajocVar.a.size()) {
                int g = ((ajob) ajocVar.a.get(h)).g();
                int i = ((ajob) ajocVar.a.get(r0)).b;
                while (h >= r0) {
                    ajocVar.p(h);
                    h--;
                }
                ajocVar.s();
                int i2 = g - i;
                if (i2 > 0) {
                    ajocVar.z(i, i2);
                }
            }
        } else {
            ajocVar.t();
        }
        this.p = null;
        ajng ajngVar = this.m;
        if (ajngVar != null) {
            this.f.m(ajngVar);
        }
        al();
        this.h.clear();
        this.a.clear();
        this.b.clear();
        this.o = "";
        K(null);
        B();
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((ajww) it.next()).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        ajce W = W(ajcd.NEXT);
        if (this.Q != W) {
            lF(ajcd.NEXT);
            this.Q = W;
        }
    }

    public final void E() {
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((ajww) it.next()).e();
        }
    }

    public void F(Configuration configuration) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(aamd aamdVar, ajcd ajcdVar) {
        super.lB(aamdVar, ajcdVar);
        if (aamdVar == null) {
            return;
        }
        if (ajcdVar == ajcd.RELOAD) {
            V(aamdVar);
        } else {
            x(aamdVar);
        }
    }

    protected abstract void H(Bundle bundle);

    @Override // defpackage.ajwx
    public final void I() {
        this.g.h(this.f);
    }

    public final void J() {
        ajvp ajvpVar;
        ajvo ajvoVar = this.k.b;
        if (ajvoVar == null || !(ajvoVar.a instanceof ajtv) || (ajvpVar = ajvoVar.d) == null) {
            return;
        }
        ajvpVar.ln();
    }

    protected final void K(ajtz ajtzVar) {
        ajtz ajtzVar2 = this.I;
        if (ajtzVar2 != null) {
            ajtzVar2.E = null;
        }
        this.I = ajtzVar;
        ajtz ajtzVar3 = this.I;
        if (ajtzVar3 != null) {
            ajtzVar3.E = this.H;
        }
        this.k.d(this.G, ajtzVar != null ? ajtzVar.Y() : null);
        ajtz ajtzVar4 = this.I;
        if ((ajtzVar4 instanceof ajud) && ajtzVar4.ai(ajcd.NEXT)) {
            ((ajud) ajtzVar4).K(false);
        }
    }

    public final void L(ajng ajngVar) {
        ajng ajngVar2 = this.l;
        if (ajngVar2 == ajngVar) {
            return;
        }
        if (ajngVar2 != null) {
            this.f.q(ajngVar2);
        }
        this.l = ajngVar;
        if (ajngVar == null || !this.n) {
            return;
        }
        this.f.o(ajngVar);
    }

    @Override // defpackage.ajwx
    public final void M(aamd aamdVar) {
        O(aamdVar, null, null);
    }

    public final void N(aamd aamdVar, Bundle bundle) {
        O(aamdVar, null, bundle);
    }

    public final void O(aamd aamdVar, acsm acsmVar, Bundle bundle) {
        T(aamdVar, acsmVar, bundle);
        c();
    }

    public final void P(boolean z) {
        this.P = z;
        S();
    }

    public final void Q() {
        ajsq ajsqVar = this.k;
        if (ajsqVar.a == null) {
            return;
        }
        if (ajsqVar.b == null) {
            ajsqVar.b = ajsqVar.a(ajtw.a());
            ajsqVar.a.q(ajsqVar.b);
        }
        ajss ajssVar = ajsqVar.c;
        ajssVar.f.n(ajssVar.o(), ajsqVar.a);
    }

    protected abstract void R(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void S() {
        if (lp()) {
            this.e.c(1);
        } else {
            this.e.c(3);
        }
    }

    public final boolean T(aamd aamdVar, acsm acsmVar, Bundle bundle) {
        this.f62J.b = acsmVar;
        boolean z = this.n;
        if (z) {
            this.g.h(ajnl.a);
        }
        h();
        x(aamdVar);
        if (z) {
            this.g.h(this.f);
        }
        H(bundle);
        return z;
    }

    @Override // defpackage.ajtz
    protected final ajsn U() {
        ajsn ajsnVar;
        synchronized (this.q) {
            ajsnVar = this.t;
        }
        return ajsnVar;
    }

    public void V(aamd aamdVar) {
        throw null;
    }

    @Override // defpackage.ajwx
    public void c() {
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((ajww) it.next()).a();
        }
        boolean z = this.M;
        if (!z || this.N) {
            this.M = true;
            if (!z) {
                i();
            }
            if (this.h.isEmpty() && ai(ajcd.RELOAD)) {
                lF(ajcd.RELOAD);
                this.N = false;
            }
            if (this.N) {
                lo();
                this.N = false;
            }
        }
    }

    protected void f(auov auovVar) {
    }

    public void h() {
        throw null;
    }

    protected abstract void i();

    @Override // defpackage.ajtz, defpackage.zfk
    public void j() {
        super.j();
        this.p = null;
        al();
        this.k.e();
        azqb.f((AtomicReference) this.K);
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((ajww) it.next()).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean k(ajtw ajtwVar) {
        atfr atfrVar = this.j.a().f;
        if (atfrVar == null) {
            atfrVar = atfr.a;
        }
        return (atfrVar.i && ajtwVar.c() && !ajtwVar.d()) ? false : true;
    }

    public void l() {
        this.N = true;
    }

    @Override // defpackage.ajth
    public final void ll(aulm aulmVar, zfi zfiVar, ajug ajugVar, apxf apxfVar) {
        h();
        this.k.b(ahbj.o(aulmVar));
        super.ad(ahbj.o(aulmVar), apxfVar, zfiVar, new ajto(this, ajugVar), ajts.a());
    }

    @Override // defpackage.ajtz
    protected final void lm(cnq cnqVar, ajce ajceVar) {
        super.lm(cnqVar, ajceVar);
        this.R = ajceVar;
    }

    @Override // defpackage.ajvp
    public final void ln() {
        ajce ajceVar = this.R;
        if (ajceVar != null) {
            lt(ajceVar);
            this.R = null;
        }
    }

    @Override // defpackage.ajxa
    public void lo() {
        if (ai(ajcd.RELOAD)) {
            af();
        } else if (this.d.lp()) {
            this.d.lo();
        } else {
            this.e.c(1);
        }
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return (this.P && ai(ajcd.RELOAD)) || this.d.lp();
    }

    @Override // defpackage.ajtz
    protected final boolean lq() {
        boolean z;
        synchronized (this.q) {
            z = this.r;
        }
        return z;
    }

    @Override // defpackage.ajwo
    public final /* synthetic */ void lr(String str) {
        v(str, 0, null);
    }

    @Override // defpackage.ajth
    public final void lz(aulm aulmVar, apxf apxfVar) {
        h();
        this.k.b(ahbj.o(aulmVar));
        ac(ahbj.o(aulmVar), apxfVar);
    }

    @Override // defpackage.ajtz
    protected final /* bridge */ /* synthetic */ Object nn(aulp aulpVar) {
        if (aulpVar == null || !aulpVar.pY(auov.b)) {
            return null;
        }
        return new aamd((auov) aulpVar.pX(auov.b));
    }

    public final int o() {
        int i = this.f.i(this.k.a);
        return i != -1 ? i : this.f.i(this.m);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lF(ajcd.NEXT);
    }

    public Bundle p() {
        throw null;
    }

    @Override // defpackage.ajtz, defpackage.ajvz
    public ajxe ph() {
        ArrayList arrayList = new ArrayList(this.h.size());
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            arrayList.add(((ajvc) it.next()).ph());
        }
        ajxe ph = super.ph();
        List list = this.a;
        ajvo ajvoVar = this.k.b;
        return new ajsr(ph, list, arrayList, ajvoVar != null ? ajvoVar.a : null, this.R);
    }

    public abstract View q();

    @Override // defpackage.ajwx
    public final ajng r() {
        return this.f;
    }

    @Override // defpackage.ajwx
    public final ajvc s(String str) {
        return (ajvc) this.b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(Object obj) {
        this.O = true;
        w(obj);
    }

    @Override // defpackage.ajwx
    public final void u(ajol ajolVar) {
        this.g.rU(ajolVar);
    }

    @Override // defpackage.ajwo
    public final boolean v(String str, int i, Runnable runnable) {
        ajvc s = s(str);
        if (s == null || s.lC() == null || s.lC().isEmpty()) {
            ajwo ajwoVar = this.s;
            return ajwoVar != null && ajwoVar.v(str, i, runnable);
        }
        int j = this.f.j(s.lC());
        if (j < 0) {
            return false;
        }
        this.p = runnable;
        R(j, i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(Object obj) {
        m(obj, null);
    }

    public final void x(aamd aamdVar) {
        if (aamdVar == null) {
            return;
        }
        boolean z = !this.n;
        if (aamdVar.b == null) {
            aamdVar.b = (amru) ((ayqj) aypy.T(aamdVar.a.e).Y(zcz.q).p(nuw.c).aD(zcz.h)).X();
        }
        super.lu(aamdVar.b);
        S();
        if (z) {
            this.O = false;
            f(aamdVar.a);
        }
        n(aamdVar.a(), null);
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            ((ajww) it.next()).c(aamdVar, z);
        }
        this.o = aamdVar.a.l;
    }

    @Override // defpackage.ajwx
    public final void y(ajww ajwwVar) {
        this.L.add(ajwwVar);
    }

    @Override // defpackage.ajwx
    public final void z(ammy ammyVar) {
        this.g.h(new ajnp(this.f, ammyVar));
    }
}
