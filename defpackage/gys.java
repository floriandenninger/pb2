package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gys extends lo implements gyl {
    private static final SimpleDateFormat G = new SimpleDateFormat("m:ss.S", Locale.getDefault());
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public final int A;
    public final Runnable B;
    public aixx F;
    private final gyq H;
    private final azrw I;
    public final azrw e;
    public final azrw f;
    public final azrw g;
    public final Executor h;
    public final Handler i;
    public String j;
    public String k;
    public gze o;
    public TextView p;
    public gzd q;
    public gym r;
    public gyt s;
    public int w;
    public int x;
    public long b = 5000;
    public long c = 60000;
    public long d = 30000;
    public String l = "";
    public String m = "";
    public String n = "";
    public float t = 0.0f;
    public float u = 1.0f;
    public String v = null;
    public boolean y = false;
    public boolean z = false;
    public boolean D = false;
    public boolean E = true;

    /* renamed from: J, reason: collision with root package name */
    private boolean f216J = false;
    public final LinearInterpolator C = new LinearInterpolator();

    public gys(Context context, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, Executor executor, Handler handler) {
        this.x = 0;
        this.e = azrwVar;
        this.f = azrwVar2;
        this.g = azrwVar3;
        this.I = azrwVar4;
        this.h = executor;
        this.i = handler;
        int K = yjk.K(context.getResources().getDisplayMetrics(), 120);
        this.A = K;
        this.x = K;
        this.H = new gyq(this);
        this.B = new gyn(this, 1);
    }

    public static String l(long j) {
        return String.format(Locale.getDefault(), "%1$d.%2$d", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)), Long.valueOf((j % 1000) / 100));
    }

    private final void u() {
        ((ainy) this.f.get()).b();
        ((ahvc) this.I.get()).k(ControlsOverlayStyle.a);
    }

    private final void v() {
        final gzd gzdVar = this.q;
        if (gzdVar != null) {
            long f = this.F.f() - this.F.h();
            final long g = (this.F.g() - this.F.h()) + (this.d / 2);
            long h = this.f216J ? this.F.h() : 0L;
            gzdVar.aF(gzdVar.af);
            gzdVar.ab = new Runnable() { // from class: gyw
                @Override // java.lang.Runnable
                public final void run() {
                    float min;
                    gzd gzdVar2 = gzd.this;
                    long j = g;
                    gzb gzbVar = (gzb) gzdVar2.m;
                    if (gzbVar.w() <= gzdVar2.getMeasuredWidth()) {
                        gzdVar2.aK();
                        return;
                    }
                    float max = Math.max(gzdVar2.ad ? gzbVar.j : 0.0f, ((((float) j) / ((float) gzbVar.f)) * gzbVar.w()) - (gzdVar2.getMeasuredWidth() / 2));
                    if (gzdVar2.ad) {
                        min = Math.min(max, (gzbVar.w() - gzdVar2.getMeasuredWidth()) - gzbVar.j);
                    } else {
                        min = Math.min(max, gzbVar.w() - gzdVar2.getMeasuredWidth());
                    }
                    int computeHorizontalScrollOffset = (int) (min - gzdVar2.computeHorizontalScrollOffset());
                    if (computeHorizontalScrollOffset != 0) {
                        gzdVar2.aD(gzdVar2.ah);
                        gzdVar2.scrollBy(computeHorizontalScrollOffset, 0);
                    } else {
                        gzdVar2.aK();
                    }
                }
            };
            gzb gzbVar = (gzb) gzdVar.m;
            long j = gzdVar.aa;
            gzbVar.g = h;
            gzbVar.f = f;
            gzbVar.e = gzd.a(f, j);
            gzbVar.d.h(gzbVar);
            gzbVar.d.b(gzbVar);
            gzbVar.mw();
        }
    }

    @Override // defpackage.gyl
    public final void a() {
        this.z = false;
        u();
        k().f();
        this.i.removeCallbacks(this.B);
        this.q.ao();
    }

    @Override // defpackage.lo
    public final void b(final RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.q == recyclerView) {
                u();
                k().f();
                this.i.removeCallbacks(this.B);
                this.D = false;
                return;
            }
            return;
        }
        if (i == 1) {
            if (this.q == recyclerView) {
                this.D = true;
                p();
                return;
            }
            return;
        }
        if (i == 2) {
            if (this.q == recyclerView) {
                this.D = true;
                return;
            }
            return;
        }
        if (i != 100) {
            if (i == 101 && this.q == recyclerView) {
                this.D = false;
                this.h.execute(new Runnable() { // from class: gyo
                    @Override // java.lang.Runnable
                    public final void run() {
                        int measuredWidth;
                        gys gysVar = gys.this;
                        RecyclerView recyclerView2 = recyclerView;
                        gzd gzdVar = gysVar.q;
                        if (gzdVar.ad) {
                            gzb gzbVar = (gzb) gzdVar.m;
                            r4 = gzbVar != null ? gzbVar.j : 0;
                            measuredWidth = gzdVar.getMeasuredWidth() - r4;
                        } else {
                            measuredWidth = gzdVar.getMeasuredWidth();
                        }
                        long aH = gzdVar.aH(r4, measuredWidth);
                        float f = (float) aH;
                        float f2 = ((float) gysVar.b) / f;
                        float min = ((float) Math.min(gysVar.c, aH)) / f;
                        float aI = (float) gysVar.q.aI();
                        long g = gysVar.F.g() - gysVar.F.h();
                        float max = Math.max((((float) g) - aI) / f, 0.0f);
                        float min2 = Math.min(1.0f, (((float) (g + gysVar.d)) - aI) / f);
                        gym gymVar = gysVar.r;
                        gymVar.l = 500.0f / f;
                        try {
                            StringBuilder sb = new StringBuilder(29);
                            sb.append("minPercent is ");
                            sb.append(f2);
                            gym.f(f2, sb.toString());
                            StringBuilder sb2 = new StringBuilder(29);
                            sb2.append("maxPercent is ");
                            sb2.append(min);
                            gym.f(min, sb2.toString());
                            StringBuilder sb3 = new StringBuilder(31);
                            sb3.append("startPercent is ");
                            sb3.append(max);
                            gym.f(max, sb3.toString());
                            StringBuilder sb4 = new StringBuilder(29);
                            sb4.append("endPercent is ");
                            sb4.append(min2);
                            gym.f(min2, sb4.toString());
                        } catch (IllegalArgumentException e) {
                            zga.f("ClipCreationScrubberViewController", "problem setting starting clip creation bounds", e);
                        }
                        if (min2 < max) {
                            throw new IllegalArgumentException("endPercent must not be smaller than startPercent");
                        }
                        float f3 = min2 - max;
                        if (f3 < f2) {
                            throw new IllegalArgumentException("The difference between endPercent and startPercent must not be less than minPercent");
                        }
                        if (f3 <= min) {
                            gymVar.k = f2;
                            gymVar.j = min;
                            gymVar.e(Math.max(max, 0.0f), Math.min(min2, 1.0f));
                            gyl gylVar = gymVar.p;
                            if (gylVar != null) {
                                float f4 = gymVar.q;
                                float f5 = gymVar.r;
                                ((gys) gylVar).t = f4;
                                ((gys) gylVar).u = f5;
                                gyq k = ((gys) gylVar).k();
                                k.e();
                                k.g(true);
                                k.f();
                                k.d();
                            }
                            gymVar.postInvalidate();
                            recyclerView2.aF(gysVar);
                            recyclerView2.aD(gysVar);
                            return;
                        }
                        throw new IllegalArgumentException("The difference between endPercent and startPercent must not be greater than maxPercent");
                    }
                });
                return;
            }
            return;
        }
        gzd gzdVar = this.q;
        if (gzdVar != recyclerView) {
            this.D = false;
            if (gzdVar != null) {
                gzdVar.aF(gzdVar.af);
                gzdVar.aF(gzdVar.ah);
                gzdVar.ab = null;
            }
            gzd gzdVar2 = (gzd) recyclerView;
            this.q = gzdVar2;
            gzdVar2.aL(this.f216J);
            v();
        }
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        m(this.t);
    }

    @Override // defpackage.gyl
    public final void d(float f, float f2) {
        this.t = f;
        this.u = f2;
        gyq k = k();
        k.e();
        k.g(true);
        k.d();
        this.z = true;
        n();
    }

    public final long j(float f) {
        long aI = this.q.aI();
        long aJ = this.q.aJ();
        aixx aixxVar = this.F;
        return (f * ((float) (aJ - aI))) + ((float) aI) + (aixxVar != null ? aixxVar.h() : 0L);
    }

    public final gyq k() {
        gyq gyqVar = this.H;
        gyqVar.a.clear();
        gyqVar.b.clear();
        return this.H;
    }

    public final void m(float f) {
        this.t = f;
        gyq k = k();
        k.e();
        k.g(true);
        k.d();
    }

    public final void n() {
        gzd gzdVar;
        if (this.z && this.y && (gzdVar = this.q) != null && gzdVar.F == 0) {
            this.i.removeCallbacks(this.B);
            this.B.run();
        }
    }

    public final void o(String str, int i) {
        this.v = str;
        this.w = i;
    }

    public final void p() {
        ((ainy) this.f.get()).a();
        ((ahvc) this.I.get()).k(ControlsOverlayStyle.m);
    }

    public final void q(boolean z) {
        this.y = z;
        gze gzeVar = this.o;
        if (gzeVar != null) {
            gzeVar.f = z;
        }
        gym gymVar = this.r;
        if (gymVar != null) {
            gymVar.v = z;
        }
        gyt gytVar = this.s;
        if (gytVar != null) {
            gytVar.g = z;
        }
        gzd gzdVar = this.q;
        if (gzdVar != null) {
            gzdVar.ad = z;
            gzb gzbVar = (gzb) gzdVar.m;
            if (gzbVar != null) {
                gzbVar.m = z;
            }
        }
    }

    public final void r(boolean z) {
        this.f216J = z;
        gzd gzdVar = this.q;
        if (gzdVar != null) {
            gzdVar.aL(z);
        }
    }

    public final void s(aixx aixxVar) {
        this.F = aixxVar;
        v();
    }

    public final void t(long j) {
        aixx aixxVar;
        float f;
        int width;
        if (this.q == null || this.s == null || (aixxVar = this.F) == null) {
            return;
        }
        long h = j - aixxVar.h();
        long aI = this.q.aI();
        long aJ = this.q.aJ() - aI;
        if (aJ > 0) {
            float f2 = ((float) (h - aI)) / ((float) aJ);
            gyt gytVar = this.s;
            if (gytVar != null) {
                gytVar.e = f2;
                gytVar.postInvalidate();
            }
            gze gzeVar = this.o;
            if (gzeVar != null) {
                gzeVar.b = f2;
                int measuredWidth = gzeVar.getMeasuredWidth();
                if (gzeVar.f) {
                    float f3 = gzeVar.b;
                    f = (f3 * (measuredWidth - (r6 + r6))) + gzeVar.e;
                    width = gzeVar.d.width();
                } else {
                    f = gzeVar.b * measuredWidth;
                    width = gzeVar.d.width();
                }
                float f4 = f - (width / 2.0f);
                gzeVar.c = f4;
                float max = Math.max(0.0f, f4);
                gzeVar.c = max;
                gzeVar.c = Math.min(max, measuredWidth - gzeVar.d.width());
                gzeVar.postInvalidate();
                if (h >= 0) {
                    this.o.a(G.format(Long.valueOf(h)));
                } else {
                    this.o.a("");
                }
            }
        }
    }
}
