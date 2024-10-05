package defpackage;

import android.os.CountDownTimer;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xji implements wnk, aioa {
    public final aahd a;
    public final xja b;
    public final xls c;
    public final aeb d;
    public SurveyAd e;
    CountDownTimer f;
    CountDownTimer g;
    public xgp h;
    private final azrw i;
    private final xiy j;
    private final shf k;
    private final zfi l;
    private final wno m;
    private final wyt n;
    private final wyn o;
    private aoyp p;
    private boolean q;
    private boolean r;
    private boolean s;
    private xeo t;
    private xgh u;
    private xev v;
    private asht w;
    private wto x;

    public xji(azrw azrwVar, aahd aahdVar, xja xjaVar, shf shfVar, zfi zfiVar, xls xlsVar, wno wnoVar, wyt wytVar, wyn wynVar) {
        azrwVar.getClass();
        this.i = azrwVar;
        aahdVar.getClass();
        this.a = aahdVar;
        xjaVar.getClass();
        this.b = xjaVar;
        shfVar.getClass();
        this.k = shfVar;
        zfiVar.getClass();
        this.l = zfiVar;
        xlsVar.getClass();
        this.c = xlsVar;
        wnoVar.getClass();
        this.m = wnoVar;
        wytVar.getClass();
        this.n = wytVar;
        wynVar.getClass();
        this.o = wynVar;
        this.d = new aeb();
        this.j = xjaVar.d();
        g();
    }

    public static final void i(CountDownTimer countDownTimer) {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private final void j() {
        this.q = true;
        this.b.e();
        this.c.m();
    }

    private final void k(int i) {
        xev xevVar = this.v;
        if (xevVar != null) {
            this.m.f(this.t, this.u, xevVar, i);
            this.m.v(this.v);
        }
        xgh xghVar = this.u;
        if (xghVar != null) {
            this.m.m(this.t, xghVar);
            this.m.q(this.t, this.u);
        }
        this.t = null;
        this.v = null;
        this.u = null;
    }

    public final Map a() {
        if (this.e == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
        return hashMap;
    }

    public final void b(xce xceVar) {
        this.l.a(false);
        i(this.f);
        this.b.k(false);
        if (this.e != null) {
            ((acra) this.i.get()).q(new acqx(this.e.C()), this.w);
        }
        this.c.i(xceVar);
        wto wtoVar = this.x;
        if (wtoVar != null) {
            wtoVar.d(xceVar);
            this.x = null;
        }
        g();
        int i = 0;
        while (true) {
            aeb aebVar = this.d;
            if (i < aebVar.b) {
                ((xjf) aebVar.b(i)).h(false, 0);
                i++;
            } else {
                k(xev.a(xceVar));
                return;
            }
        }
    }

    @Override // defpackage.wnk
    public final void c() {
        g();
        k(4);
    }

    public final void d(long j) {
        SurveyAd surveyAd = this.e;
        if (surveyAd == null || surveyAd.d.size() == 0) {
            return;
        }
        long a = (((aamu) this.e.d.get(0)).a() * 1000) - j;
        this.c.s(new xbj(a));
        if (j > 0) {
            this.b.m((int) j);
            if (!this.r || a < this.e.s() * 1000 || this.q || !this.e.ai()) {
                return;
            }
            j();
            return;
        }
        f();
    }

    @Override // defpackage.wnk
    public final boolean e(wto wtoVar) {
        PlayerAd a = wtoVar.a();
        int i = 0;
        if (!(a instanceof SurveyAd)) {
            return false;
        }
        SurveyAd surveyAd = (SurveyAd) a;
        this.e = surveyAd;
        amru amruVar = surveyAd.d;
        if (amruVar == null || amruVar.size() > 1) {
            return false;
        }
        this.b.i(new xjd(this));
        xiy xiyVar = this.j;
        if (xiyVar != null) {
            ((kpq) xiyVar).d = new xje(this);
        }
        this.t = xeo.a(wtoVar.c(), wtoVar.b());
        xgh b = this.n.b();
        this.u = b;
        this.m.p(this.t, b);
        g();
        this.x = wtoVar;
        this.e = surveyAd;
        this.p = a.l.N();
        SurveyQuestionRendererModel ak = this.e.ak();
        this.q = false;
        if (ak == null || ak.g() == null || ak.h() == null || ak.h().size() == 0) {
            wtoVar.d(xce.SURVEY_ENDED);
            this.m.q(this.t, this.u);
            return true;
        }
        xev g = this.o.g(this.u, this.e);
        this.v = g;
        ammv ammvVar = g.i;
        if (ammvVar.h()) {
            aone createBuilder = asht.a.createBuilder();
            ashd ashdVar = (ashd) ammvVar.c();
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashtVar.t = ashdVar;
            ashtVar.c |= 1024;
            this.w = (asht) createBuilder.build();
        }
        this.m.g(this.t, this.u, this.v);
        avcx avcxVar = this.e.c;
        this.s = (avcxVar == null || this.j == null) ? false : true;
        this.b.p(ak.g(), ak.h(), ak.j(), this.e.al());
        this.b.m((int) TimeUnit.MILLISECONDS.convert(ak.a(), TimeUnit.SECONDS));
        if (this.e.D() != null) {
            this.b.l();
        }
        boolean ae = a.ae();
        this.r = ae;
        if (ae && this.e.aj() && this.e.ai()) {
            j();
        }
        if (this.s) {
            this.j.b(avcxVar);
        }
        this.m.j(this.t, this.u);
        this.m.b(this.t, this.u, this.v);
        this.c.r();
        this.h = new xgp(this.p, this.k);
        this.b.k(true);
        ((acra) this.i.get()).u(new acqx(this.e.C()), this.w);
        while (true) {
            aeb aebVar = this.d;
            if (i >= aebVar.b) {
                break;
            }
            ((xjf) aebVar.b(i)).h(true, this.e.al());
            i++;
        }
        if (this.s) {
            this.j.c(true);
            xjh xjhVar = new xjh(this, (int) TimeUnit.MILLISECONDS.convert(avcxVar.c, TimeUnit.SECONDS));
            this.g = xjhVar;
            xjhVar.start();
            this.a.d(avcxVar.e, a());
        } else {
            h();
        }
        this.l.a(true);
        return true;
    }

    public final void f() {
        xgp xgpVar = this.h;
        if (xgpVar != null) {
            xgpVar.d();
            this.c.q(this.h);
        }
        b(xce.SURVEY_ENDED);
    }

    public final void g() {
        i(this.f);
        i(this.g);
        this.b.h();
        xiy xiyVar = this.j;
        if (xiyVar != null) {
            xiyVar.a();
        }
        this.q = false;
        this.e = null;
        this.p = null;
        this.x = null;
        this.s = false;
    }

    public final void h() {
        xiy xiyVar = this.j;
        if (xiyVar != null) {
            xiyVar.c(false);
        }
        this.a.c(this.e.ag(), a());
        xjg xjgVar = new xjg(this, (int) TimeUnit.MILLISECONDS.convert(this.e.ak().a(), TimeUnit.SECONDS));
        this.f = xjgVar;
        xjgVar.start();
        xgp xgpVar = this.h;
        if (xgpVar != null) {
            xgpVar.c();
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().a.X(new ayrs() { // from class: xjc
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                xji xjiVar = xji.this;
                if (((ahef) obj).c() == aign.NEW) {
                    xjiVar.g();
                }
            }
        })};
    }
}
