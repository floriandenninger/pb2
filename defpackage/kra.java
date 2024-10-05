package defpackage;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kra implements wnk, krl {
    public final krm a;
    public final xls b;
    CountDownTimer c;
    public long d;
    public boolean e;
    private final zaz f;
    private final wno g;
    private final wyt h;
    private final wyn i;
    private final fgq j;
    private final acra k;
    private xeo l;
    private xgh m;
    private xev n;
    private wto o;

    public kra(krm krmVar, zaz zazVar, xls xlsVar, wno wnoVar, wyt wytVar, wyn wynVar, fgq fgqVar, acra acraVar) {
        krmVar.getClass();
        this.a = krmVar;
        zazVar.getClass();
        this.f = zazVar;
        xlsVar.getClass();
        this.b = xlsVar;
        wnoVar.getClass();
        this.g = wnoVar;
        wytVar.getClass();
        this.h = wytVar;
        wynVar.getClass();
        this.i = wynVar;
        fgqVar.getClass();
        this.j = fgqVar;
        acraVar.getClass();
        this.k = acraVar;
        f();
    }

    private final void f() {
        b();
        this.d = 0L;
        this.a.setVisibility(8);
        this.a.d();
        this.o = null;
        this.f.j(false);
    }

    private final void g() {
        this.l = null;
        this.n = null;
        this.m = null;
    }

    private final void h(int i) {
        xev xevVar = this.n;
        if (xevVar != null) {
            this.g.f(this.l, this.m, xevVar, i);
            this.g.v(this.n);
        }
        xgh xghVar = this.m;
        if (xghVar != null) {
            this.g.m(this.l, xghVar);
            this.g.q(this.l, this.m);
        }
        g();
    }

    public final void a(xce xceVar) {
        if (this.o != null) {
            h(xev.a(xceVar));
            this.o.d(xceVar);
        }
        f();
    }

    public final void b() {
        CountDownTimer countDownTimer = this.c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.c = null;
        }
    }

    @Override // defpackage.wnk
    public final void c() {
        h(4);
        f();
    }

    public final void d() {
        this.c = new kqz(this, this.d).start();
    }

    @Override // defpackage.wnk
    public final boolean e(wto wtoVar) {
        if (wtoVar.a().i() == null) {
            return false;
        }
        aoyx i = wtoVar.a().i();
        this.l = xeo.a(wtoVar.c(), wtoVar.b());
        xgh b = this.h.b();
        this.m = b;
        this.n = this.i.f(b, i);
        this.g.p(this.l, this.m);
        this.g.g(this.l, this.m, this.n);
        f();
        this.o = wtoVar;
        int bU = amkq.bU(i.f);
        if (bU == 0 || bU != 2 || !this.j.g().k()) {
            aulq aulqVar = i.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ElementRendererOuterClass.elementRenderer)) {
                this.e = i.g;
                this.d = TimeUnit.SECONDS.toMillis(i.d);
                d();
                if ((i.b & 64) != 0) {
                    krm krmVar = this.a;
                    aoyy aoyyVar = i.h;
                    if (aoyyVar == null) {
                        aoyyVar = aoyy.a;
                    }
                    krmVar.k = aoyyVar;
                }
                aulq aulqVar2 = i.e;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aqrf aqrfVar = (aqrf) aulqVar2.pX(ElementRendererOuterClass.elementRenderer);
                ammv ammvVar = this.n.i;
                this.f.j(true);
                ajok ajokVar = new ajok();
                ajokVar.g(new HashMap());
                ajokVar.a(this.k);
                if (ammvVar.h()) {
                    aone createBuilder = asht.a.createBuilder();
                    ashd ashdVar = (ashd) ammvVar.c();
                    createBuilder.copyOnWrite();
                    asht ashtVar = (asht) createBuilder.instance;
                    ashtVar.t = ashdVar;
                    ashtVar.c |= 1024;
                    ajokVar.c = (asht) createBuilder.build();
                }
                krm krmVar2 = this.a;
                if (krmVar2.f == null) {
                    krmVar2.f = (ViewGroup) LayoutInflater.from(krmVar2.getContext()).inflate(R.layout.ad_endcap_elements_overlay, krmVar2);
                    krmVar2.g = (ViewGroup) krmVar2.f.findViewById(R.id.ad_endcap_elements_overlay);
                    krmVar2.h = krmVar2.f.findViewById(R.id.skip_ad_button);
                    ((RelativeLayout.LayoutParams) krmVar2.h.getLayoutParams()).bottomMargin += krmVar2.c;
                    krmVar2.h.setOnClickListener(new krj(krmVar2));
                    krmVar2.h.setOnTouchListener(new krk(krmVar2));
                }
                krmVar2.e = aqrfVar;
                ajds.a(krmVar2.e);
                krmVar2.l = ajds.a(krmVar2.e);
                krmVar2.g.addView(krmVar2.b.a(), 0);
                krmVar2.b.oB(ajokVar, krmVar2.l);
                krmVar2.f.setVisibility(0);
                krmVar2.g.setVisibility(0);
                krmVar2.h.setVisibility(0);
                krmVar2.e();
                this.g.j(this.l, this.m);
                this.g.b(this.l, this.m, this.n);
                return true;
            }
            this.g.v(this.n);
            this.g.q(this.l, this.m);
            g();
            return false;
        }
        this.g.j(this.l, this.m);
        this.g.b(this.l, this.m, this.n);
        a(xce.AUTO_SKIPPED_ON_ENTER);
        return false;
    }
}
