package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.innertube.model.ads.VastAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqy implements woq, ypd {
    private static final List k;
    public final kqv a;
    public final acra b;
    public final shf c;
    public final aaea d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public kqx i;
    public PlayerAd j;
    private final aahd l;
    private final wzq m;
    private final List n;
    private final aifw o;
    private final Handler p;
    private Object q;
    private int r;

    static {
        aone createBuilder = aown.a.createBuilder();
        createBuilder.copyOnWrite();
        aown.a((aown) createBuilder.instance);
        createBuilder.copyOnWrite();
        aown aownVar = (aown) createBuilder.instance;
        aownVar.c = 1;
        aownVar.b = 1 | aownVar.b;
        k = Arrays.asList((aown) createBuilder.build());
    }

    public kqy(kqv kqvVar, aahd aahdVar, wzq wzqVar, acra acraVar, shf shfVar, aifw aifwVar, aaea aaeaVar, Handler handler) {
        kqvVar.getClass();
        this.a = kqvVar;
        aahdVar.getClass();
        this.l = aahdVar;
        wzqVar.getClass();
        this.m = wzqVar;
        acraVar.getClass();
        this.b = acraVar;
        this.c = shfVar;
        aifwVar.getClass();
        this.o = aifwVar;
        aaeaVar.getClass();
        this.d = aaeaVar;
        this.p = handler;
        this.n = new ArrayList();
    }

    private final void e(final int i, final boolean z) {
        this.p.post(new Runnable() { // from class: kqw
            @Override // java.lang.Runnable
            public final void run() {
                kqx kqxVar;
                byte[] bArr;
                kqy kqyVar = kqy.this;
                int i2 = i;
                kqyVar.a.r(i2, z);
                if (!kqyVar.f || (kqxVar = kqyVar.i) == null || (bArr = kqxVar.b) == null || bArr.length <= 0 || i2 == 3 || i2 == 1) {
                    return;
                }
                kqyVar.f = false;
                kqyVar.b.u(new acqx(bArr), null);
            }
        });
    }

    public final void a(long j) {
        if (wbs.o(this.d)) {
            return;
        }
        this.h = j;
        if (!this.e || !this.g || this.i == null || this.n.isEmpty()) {
            if (this.r != 3) {
                this.r = 3;
                e(3, false);
                return;
            }
            return;
        }
        int i = this.r;
        for (aown aownVar : this.n) {
            if (((float) this.h) >= aownVar.d) {
                int i2 = this.r;
                int bW = amkq.bW(aownVar.c);
                if (bW == 0) {
                    bW = 1;
                }
                if (i2 != bW) {
                    int bW2 = amkq.bW(aownVar.c);
                    if (bW2 == 0) {
                        bW2 = 1;
                    }
                    this.r = bW2;
                    e(bW2, bW2 == 2 || i != 3);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0126, code lost:
    
        r7.n.add(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.aryr r8) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqy.c(aryr):void");
    }

    public final void d() {
        Object obj = this.q;
        if (obj != null) {
            this.m.b(obj);
            this.q = null;
        }
        this.a.m();
        this.r = 1;
        this.f = true;
        this.j = null;
        this.i = null;
        this.g = false;
        this.h = 0L;
        this.n.clear();
        this.e = this.o.g() == aigf.FULLSCREEN;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        PlayerAd playerAd;
        if (i == -1) {
            return new Class[]{xag.class, ahcx.class, ahef.class, aheg.class};
        }
        if (i == 0) {
            xag xagVar = (xag) obj;
            if (wbs.o(this.d)) {
                return null;
            }
            xaf a = xagVar.a();
            PlayerAd c = xagVar.c();
            if (a.a() && c != null && !(c instanceof SurveyAd) && !VastAd.a.equalsIgnoreCase(c.l())) {
                if (this.j == null) {
                    this.j = xagVar.c();
                }
                PlayerAd playerAd2 = this.j;
                if (playerAd2 != null && playerAd2.g() != null) {
                    c(this.j.g().a);
                }
                if (a == xaf.AD_VIDEO_PLAYING && (playerAd = this.j) != null) {
                    shf shfVar = this.c;
                    if (!(playerAd instanceof ForecastingAd) && !playerAd.ad(shfVar)) {
                        this.g = true;
                    }
                }
            }
            if (a != xaf.AD_VIDEO_ENDED) {
                return null;
            }
            d();
            return null;
        }
        if (i == 1) {
            ahcx ahcxVar = (ahcx) obj;
            if (wbs.o(this.d)) {
                return null;
            }
            boolean z = ahcxVar.d() == aigf.FULLSCREEN;
            if (this.e == z) {
                return null;
            }
            this.e = z;
            a(this.h);
            return null;
        }
        if (i != 2) {
            if (i == 3) {
                aheg ahegVar = (aheg) obj;
                if (wbs.o(this.d) || !this.g) {
                    return null;
                }
                a(ahegVar.e());
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        ahef ahefVar = (ahef) obj;
        if (wbs.o(this.d)) {
            return null;
        }
        PlayerResponseModel b = ahefVar.b();
        aign c2 = ahefVar.c();
        if (c2 == aign.VIDEO_PLAYING) {
            if (b != null) {
                c(b.a);
            }
            this.g = true;
            return null;
        }
        if (c2.h()) {
            return null;
        }
        d();
        return null;
    }

    @Override // defpackage.woq
    public final void qx(Object obj, List list) {
        if (this.m.d(obj)) {
            if (wbs.v(this.d)) {
                afsi.b(2, 1, "CTA Ctrl: click is blocked by debounce.");
            }
        } else {
            this.q = obj;
            whl.J(this.l, list, acrc.i(obj, false));
        }
    }
}
