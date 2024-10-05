package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajox extends vw implements ajoo, ajnf {
    public final HashSet d;
    public aaea e;
    public ajng f;
    private final ajos g;
    private final ajmw h;
    private final ViewGroup.LayoutParams i;

    public ajox(hkk hkkVar, hki hkiVar, azrw azrwVar, hrv hrvVar) {
        this(hkkVar);
        ajpd ajpdVar = new ajpd();
        ajpdVar.add(new hiv());
        ajoc ajocVar = new ajoc();
        ajocVar.m(ajpdVar);
        ajocVar.m(hkiVar);
        autm autmVar = hrvVar.a.a().z;
        if ((autmVar == null ? autm.a : autmVar).w) {
            ajocVar.m((ajng) azrwVar.get());
        }
        h(ajocVar);
    }

    @Override // defpackage.vw
    public final int b() {
        return this.f.a();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        int c = this.g.c(getItem(i));
        if (c != -1) {
            return c;
        }
        return -1;
    }

    @Override // defpackage.yoq
    public final void d(int i, int i2) {
        m(i, i2);
    }

    @Override // defpackage.yoq
    public final void e(int i, int i2) {
        for (int i3 = 0; i3 <= 0; i3++) {
            oe(i + i3, i2 + i3);
        }
    }

    @Override // defpackage.ajoo
    public final void g(ajon ajonVar) {
        this.d.add(ajonVar);
    }

    @Override // defpackage.ajoo
    public final Object getItem(int i) {
        return this.f.c(i);
    }

    @Override // defpackage.ajoo
    public final void h(ajng ajngVar) {
        ajng ajngVar2 = this.f;
        if (ajngVar == ajngVar2) {
            return;
        }
        ajngVar.getClass();
        ajngVar2.pf(this);
        this.f = ajngVar;
        ajngVar.lX(this);
        mw();
    }

    @Override // defpackage.ajoo
    public final void i(ajon ajonVar) {
        this.d.remove(ajonVar);
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        return this.f.b(i);
    }

    @Override // defpackage.ajnf
    public final void pc() {
        mw();
    }

    @Override // defpackage.yoq
    public final void pd(int i, int i2) {
        og(i, i2);
    }

    @Override // defpackage.yoq
    public final void pe(int i, int i2) {
        l(i, i2);
    }

    @Override // defpackage.ajoo
    public final void rU(ajol ajolVar) {
        this.h.b(ajolVar);
    }

    @Override // defpackage.vw
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final ajor f(ViewGroup viewGroup, int i) {
        ajom e;
        if (i == -1) {
            e = new ajnm(viewGroup.getContext());
        } else {
            e = this.g.e(i, viewGroup);
        }
        View a = e.a();
        ahbw.x(a, e, i);
        if (a.getLayoutParams() == null) {
            a.setLayoutParams(new ViewGroup.LayoutParams(this.i));
        }
        return new ajor(e);
    }

    @Override // defpackage.vw
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void o(ajor ajorVar, int i) {
        ajom ajomVar = ajorVar.t;
        View a = ajomVar.a();
        ajok p = a != null ? ahbw.p(a) : null;
        if (p == null) {
            p = new ajok();
            ahbw.v(a, p);
        }
        p.h();
        p.f("position", Integer.valueOf(i));
        this.h.a(p, this.f, i);
        this.f.mL(p, i);
        Object item = getItem(i);
        if (ajomVar instanceof ajpc) {
            ajpc ajpcVar = (ajpc) ajomVar;
            ajpcVar.w = this.e;
            ajpcVar.oB(p, item);
        } else {
            ajomVar.oB(p, item);
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((ajon) it.next()).o(ajomVar, item);
        }
    }

    @Override // defpackage.vw
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void p(ajor ajorVar) {
        ahbw.t(ajorVar.a, this.g);
    }

    @Deprecated
    public ajox(ajos ajosVar) {
        this(ajosVar, new ViewGroup.LayoutParams(-1, -2));
    }

    private ajox(ajos ajosVar, ViewGroup.LayoutParams layoutParams) {
        ajosVar.getClass();
        this.g = ajosVar;
        this.i = new ViewGroup.LayoutParams(layoutParams);
        this.h = new ajmw();
        this.f = ajnl.a;
        this.d = new HashSet();
    }

    public ajox(aoae aoaeVar, ajos ajosVar, byte[] bArr) {
        this(ajosVar);
        g(new ajow(aoaeVar, 0, null));
    }

    public ajox(aoae aoaeVar, ajos ajosVar, ViewGroup.LayoutParams layoutParams, byte[] bArr) {
        this(ajosVar, layoutParams);
        g(new ajow(aoaeVar, 2, null));
    }
}
