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
public final class xiu implements wnk, aioa {
    public final aahd a;
    public final xja b;
    public final xls c;
    public SurveyAd d;
    CountDownTimer e;
    CountDownTimer f;
    public xgp g;
    private final azrw h;
    private final xiy i;
    private final shf j;
    private final aeb k;
    private final zfi l;
    private final wyt m;
    private final wyn n;
    private aoyp o;
    private boolean p;
    private boolean q;
    private boolean r;
    private xgh s;
    private xev t;
    private asht u;
    private wto v;

    public xiu(azrw azrwVar, aahd aahdVar, xja xjaVar, shf shfVar, zaz zazVar, xls xlsVar, wyt wytVar, wyn wynVar) {
        zazVar.getClass();
        xjb xjbVar = new xjb(zazVar, 1);
        azrwVar.getClass();
        this.h = azrwVar;
        aahdVar.getClass();
        this.a = aahdVar;
        xjaVar.getClass();
        this.b = xjaVar;
        shfVar.getClass();
        this.j = shfVar;
        this.l = xjbVar;
        xlsVar.getClass();
        this.c = xlsVar;
        wytVar.getClass();
        this.m = wytVar;
        wynVar.getClass();
        this.n = wynVar;
        this.k = new aeb();
        this.i = ((kpr) xjaVar).e;
        g();
    }

    public static final void i(CountDownTimer countDownTimer) {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private final void j() {
        this.p = true;
        this.b.e();
        this.c.m();
    }

    private final void k() {
        this.t = null;
        this.s = null;
    }

    public final Map a() {
        if (this.d == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
        return hashMap;
    }

    public final void b(xce xceVar) {
        int i = 0;
        this.l.a(false);
        i(this.e);
        this.b.k(false);
        if (this.d != null) {
            ((acra) this.h.get()).q(new acqx(this.d.C()), this.u);
        }
        this.c.i(xceVar);
        wto wtoVar = this.v;
        if (wtoVar != null) {
            wtoVar.d(xceVar);
            this.v = null;
        }
        g();
        while (true) {
            aeb aebVar = this.k;
            if (i < aebVar.b) {
                ((xir) aebVar.b(i)).a();
                i++;
            } else {
                k();
                return;
            }
        }
    }

    @Override // defpackage.wnk
    public final void c() {
        g();
        k();
    }

    public final void d(long j) {
        SurveyAd surveyAd = this.d;
        if (surveyAd == null || surveyAd.d.size() == 0) {
            return;
        }
        long a = (((aamu) this.d.d.get(0)).a() * 1000) - j;
        this.c.s(new xbj(a));
        if (j > 0) {
            this.b.m((int) j);
            if (!this.q || a < this.d.s() * 1000 || this.p || !this.d.ai()) {
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
        this.d = surveyAd;
        amru amruVar = surveyAd.d;
        if (amruVar == null || amruVar.size() <= 1) {
            return false;
        }
        ((kpr) this.b).d = new xip(this);
        xiy xiyVar = this.i;
        if (xiyVar != null) {
            ((kpq) xiyVar).d = new xiq(this);
        }
        this.s = this.m.b();
        g();
        this.v = wtoVar;
        this.d = surveyAd;
        this.o = a.l.N();
        SurveyQuestionRendererModel ak = this.d.ak();
        this.p = false;
        if (ak == null || ak.g() == null || ak.h() == null || ak.h().size() == 0) {
            wtoVar.d(xce.SURVEY_ENDED);
            return true;
        }
        xev g = this.n.g(this.s, this.d);
        this.t = g;
        ammv ammvVar = g.i;
        if (ammvVar.h()) {
            aone createBuilder = asht.a.createBuilder();
            ashd ashdVar = (ashd) ammvVar.c();
            createBuilder.copyOnWrite();
            asht ashtVar = (asht) createBuilder.instance;
            ashtVar.t = ashdVar;
            ashtVar.c |= 1024;
            this.u = (asht) createBuilder.build();
        }
        avcx avcxVar = this.d.c;
        this.r = (avcxVar == null || this.i == null) ? false : true;
        this.b.p(ak.g(), ak.h(), ak.j(), this.d.al());
        this.b.m((int) TimeUnit.MILLISECONDS.convert(ak.a(), TimeUnit.SECONDS));
        if (this.d.D() != null) {
            this.b.l();
        }
        boolean ae = a.ae();
        this.q = ae;
        if (ae && this.d.aj() && this.d.ai()) {
            j();
        }
        if (this.r) {
            this.i.b(avcxVar);
        }
        this.c.r();
        this.g = new xgp(this.o, this.j);
        this.b.k(true);
        ((acra) this.h.get()).u(new acqx(this.d.C()), this.u);
        while (true) {
            aeb aebVar = this.k;
            if (i >= aebVar.b) {
                break;
            }
            xir xirVar = (xir) aebVar.b(i);
            this.d.al();
            xirVar.a();
            i++;
        }
        if (this.r) {
            this.i.c(true);
            xit xitVar = new xit(this, (int) TimeUnit.MILLISECONDS.convert(avcxVar.c, TimeUnit.SECONDS));
            this.f = xitVar;
            xitVar.start();
            this.a.d(avcxVar.e, a());
        } else {
            h();
        }
        this.l.a(true);
        return true;
    }

    public final void f() {
        xgp xgpVar = this.g;
        if (xgpVar != null) {
            xgpVar.d();
            this.c.q(this.g);
        }
        b(xce.SURVEY_ENDED);
    }

    public final void g() {
        i(this.e);
        i(this.f);
        this.b.h();
        xiy xiyVar = this.i;
        if (xiyVar != null) {
            xiyVar.a();
        }
        this.p = false;
        this.d = null;
        this.o = null;
        this.v = null;
        this.r = false;
    }

    public final void h() {
        xiy xiyVar = this.i;
        if (xiyVar != null) {
            xiyVar.c(false);
        }
        this.a.c(this.d.ag(), a());
        xis xisVar = new xis(this, (int) TimeUnit.MILLISECONDS.convert(this.d.ak().a(), TimeUnit.SECONDS));
        this.e = xisVar;
        xisVar.start();
        xgp xgpVar = this.g;
        if (xgpVar != null) {
            xgpVar.c();
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.G().a.X(new ayrs() { // from class: xio
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                xiu xiuVar = xiu.this;
                if (((ahef) obj).c() == aign.NEW) {
                    xiuVar.g();
                }
            }
        })};
    }
}
