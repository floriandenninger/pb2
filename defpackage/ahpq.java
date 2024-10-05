package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahpq implements acra {
    private static final String e = "ahpq";
    public final acra a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public Object d;
    private final Executor f;
    private final ammy g;

    public ahpq(acra acraVar, Executor executor, ammy ammyVar, Object obj) {
        this.a = acraVar;
        this.f = executor;
        this.g = ammyVar;
        this.d = obj;
    }

    private final void L(Runnable runnable) {
        if (yjk.h()) {
            this.b.add(runnable);
        } else {
            this.f.execute(new ahpi(this, runnable, 1));
        }
    }

    private final void M(Runnable runnable) {
        if (yjk.h()) {
            this.c.add(runnable);
        } else {
            this.f.execute(new ahpi(this, runnable, 0));
        }
    }

    public final void A() {
        this.b.clear();
        this.c.clear();
        this.a.y();
    }

    @Override // defpackage.acra
    public final void B(InteractionLoggingScreen interactionLoggingScreen) {
        this.a.B(interactionLoggingScreen);
    }

    public final void C() {
        if (yjk.h()) {
            E();
        } else {
            Log.e(e, "Tried to perform interaction logging outside of application's main thread");
            this.f.execute(new ahpl(this, 1));
        }
    }

    public final void E() {
        if (this.g.a(this.d)) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.b.clear();
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            this.c.clear();
        }
    }

    @Override // defpackage.acra
    public final InteractionLoggingScreen G(acsc acscVar, acrs acrsVar, apxf apxfVar) {
        return this.a.G(acscVar, acrsVar, apxfVar);
    }

    @Override // defpackage.acra
    public final void H(final aooy aooyVar, final aomf aomfVar, final View view) {
        M(new Runnable() { // from class: ahpg
            @Override // java.lang.Runnable
            public final void run() {
                ahpq ahpqVar = ahpq.this;
                ahpqVar.a.H(aooyVar, aomfVar, view);
            }
        });
        C();
    }

    @Override // defpackage.acsm
    public final void I(final int i, final acsa acsaVar, final asht ashtVar) {
        M(new Runnable() { // from class: ahph
            @Override // java.lang.Runnable
            public final void run() {
                ahpq ahpqVar = ahpq.this;
                ahpqVar.a.I(i, acsaVar, ashtVar);
            }
        });
        C();
    }

    @Override // defpackage.acra
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void D(acsa acsaVar) {
        L(new ahpm(this, acsaVar, 1));
        C();
    }

    @Override // defpackage.acra
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void F(acsa acsaVar, acsa acsaVar2) {
        L(new ahpn(this, acsaVar, acsaVar2, 1));
        C();
    }

    @Override // defpackage.acra
    public final acqy a() {
        return null;
    }

    @Override // defpackage.acra
    public final acra b(acrz acrzVar) {
        return this.a.b(acrzVar);
    }

    @Override // defpackage.acra, defpackage.acrq
    public final InteractionLoggingScreen c() {
        return this.a.c();
    }

    @Override // defpackage.acra
    public final InteractionLoggingScreen d(acsc acscVar, apxf apxfVar, asht ashtVar) {
        return this.a.d(acscVar, apxfVar, ashtVar);
    }

    @Override // defpackage.acra
    public final InteractionLoggingScreen e(acsc acscVar, acrs acrsVar, apxf apxfVar, asht ashtVar, asht ashtVar2) {
        return this.a.e(acscVar, acrsVar, apxfVar, ashtVar, ashtVar2);
    }

    @Override // defpackage.acsl
    public final /* bridge */ /* synthetic */ acsm f(acsa acsaVar) {
        D(acsaVar);
        return this;
    }

    @Override // defpackage.acsl
    public final /* bridge */ /* synthetic */ acsm g(acsa acsaVar, acsa acsaVar2) {
        F(acsaVar, acsaVar2);
        return this;
    }

    @Override // defpackage.acra, defpackage.acsl
    public final apxf h(apxf apxfVar) {
        return this.a.h(apxfVar);
    }

    @Override // defpackage.acra
    public final awav i(Object obj, acsc acscVar) {
        return this.a.i(obj, acscVar);
    }

    @Override // defpackage.acra
    public final awav j(Object obj, acsc acscVar, int i) {
        return this.a.j(obj, acscVar, i);
    }

    @Override // defpackage.acra
    public final String k() {
        return this.a.k();
    }

    @Override // defpackage.acra
    public final void l(Object obj, acsc acscVar, int i) {
    }

    @Override // defpackage.acra
    public final void m(final List list) {
        L(new Runnable() { // from class: ahpk
            @Override // java.lang.Runnable
            public final void run() {
                ahpq ahpqVar = ahpq.this;
                ahpqVar.a.m(list);
            }
        });
        C();
    }

    @Override // defpackage.acra
    public final void n(acsa acsaVar) {
        L(new ahpm(this, acsaVar, 0));
        C();
    }

    @Override // defpackage.acra
    public final void o(acsa acsaVar, acsa acsaVar2) {
        L(new ahpn(this, acsaVar, acsaVar2, 0));
        C();
    }

    @Override // defpackage.acra
    public final void p(acrs acrsVar) {
        this.a.p(acrsVar);
    }

    @Override // defpackage.acra
    public final void q(acsa acsaVar, asht ashtVar) {
        M(new ahpo(this, acsaVar, ashtVar, 1));
        C();
    }

    @Override // defpackage.acra
    public final void r(String str) {
        this.a.r(str);
    }

    @Override // defpackage.acra
    public final void s(acsa acsaVar, String str) {
        this.a.s(acsaVar, str);
    }

    @Override // defpackage.acra, defpackage.acsl
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.acra, defpackage.acsm
    public final void u(acsa acsaVar, asht ashtVar) {
        M(new ahpo(this, acsaVar, ashtVar, 0));
        C();
    }

    @Override // defpackage.acra
    public final void v(final aooy aooyVar, final aomf aomfVar, final asht ashtVar) {
        M(new Runnable() { // from class: ahpp
            @Override // java.lang.Runnable
            public final void run() {
                ahpq ahpqVar = ahpq.this;
                ahpqVar.a.v(aooyVar, aomfVar, ashtVar);
            }
        });
        C();
    }

    @Override // defpackage.acra
    public final void w(acsa acsaVar, asht ashtVar) {
        M(new ahpo(this, acsaVar, ashtVar, 2));
        C();
    }

    @Override // defpackage.acra
    public final void x(final String str, final acsa acsaVar, final asht ashtVar) {
        M(new Runnable() { // from class: ahpj
            @Override // java.lang.Runnable
            public final void run() {
                ahpq ahpqVar = ahpq.this;
                ahpqVar.a.x(str, acsaVar, ashtVar);
            }
        });
        C();
    }

    @Override // defpackage.acra
    public final void y() {
        if (yjk.h()) {
            A();
        } else {
            this.f.execute(new ahpl(this, 0));
        }
    }

    @Override // defpackage.acra
    public final void z(acrs acrsVar, InteractionLoggingScreen interactionLoggingScreen) {
        this.a.z(acrsVar, interactionLoggingScreen);
    }
}
