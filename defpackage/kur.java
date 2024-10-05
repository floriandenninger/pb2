package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kur extends fks implements kuu, aioa, ypd {
    private float A;
    private int B;
    private int C;
    private float D;
    private float E;
    private boolean F;
    private boolean G;
    private Rect H;
    private fhg I;

    /* renamed from: J, reason: collision with root package name */
    private final kch f229J;
    public final fgq a;
    public final ahmg b;
    public final kul c;
    public kux d;
    public float e;
    private final ypa f;
    private final aaea g;
    private final azrw h;
    private final boolean i;
    private final boolean j;
    private final azrw k;
    private final acra l;
    private final kuq m;
    private final Set n;
    private final aioc o;
    private final ywr p;
    private final kqa q;
    private final ayqw r;
    private kva s;
    private ValueAnimator t;
    private boolean u;
    private float v;
    private float w;
    private int x;
    private int y;
    private boolean z;

    public kur(kch kchVar, ypa ypaVar, aadw aadwVar, aaea aaeaVar, azrw azrwVar, azrw azrwVar2, acra acraVar, aioc aiocVar, fln flnVar, fgq fgqVar, ahmg ahmgVar, ywr ywrVar, kqa kqaVar) {
        super(flnVar);
        kul kumVar;
        this.I = fhg.NONE;
        this.f229J = kchVar;
        this.f = ypaVar;
        this.g = aaeaVar;
        this.h = azrwVar;
        this.k = azrwVar2;
        this.l = acraVar;
        this.p = ywrVar;
        this.n = new aeb();
        this.o = aiocVar;
        this.q = kqaVar;
        this.r = new ayqw();
        asvu asvuVar = aadwVar.b().e;
        awan awanVar = (asvuVar == null ? asvu.a : asvuVar).v;
        this.i = (awanVar == null ? awan.a : awanVar).f;
        this.j = evr.au(aadwVar);
        this.m = new kuq(this);
        this.a = fgqVar;
        this.b = ahmgVar;
        int bn = evr.bn(aadwVar) - 1;
        if (bn == 1) {
            kumVar = new kum(aadwVar);
        } else if (bn == 2) {
            kumVar = new kun(aadwVar);
        } else {
            kumVar = new kum(aadwVar);
        }
        this.c = kumVar;
    }

    private final void s() {
        v();
        q(1.0f);
    }

    private final void v() {
        View view;
        kux kuxVar = this.d;
        if (kuxVar != null) {
            kuxVar.f = false;
        }
        kva kvaVar = this.s;
        if (kvaVar != null) {
            if (kvaVar.b && (view = kvaVar.d) != null && kvaVar.e != null) {
                view.setVisibility(8);
                kvaVar.e.setVisibility(8);
                kvaVar.b(kvaVar.d);
                kvaVar.b(kvaVar.e);
            }
            kva kvaVar2 = this.s;
            akcv akcvVar = kvaVar2.h;
            if (akcvVar == null || !akcvVar.i()) {
                return;
            }
            kvaVar2.h.b(0);
        }
    }

    private final void w(boolean z) {
        kva kvaVar;
        if (evr.G(this.g) || !z) {
            q(1.0f);
        } else {
            y(1.0f);
        }
        int i = this.y;
        if (i == 0) {
            return;
        }
        if (z && (kvaVar = this.s) != null) {
            if (i == 2) {
                kvaVar.c();
            } else if (this.x != 0) {
                kvaVar.d();
                View view = kvaVar.d;
                if (view != null) {
                    view.setVisibility(8);
                }
                TextView textView = kvaVar.e;
                if (textView != null) {
                    textView.setText(R.string.video_zoom_normal_title);
                    kvaVar.e.sendAccessibilityEvent(8);
                }
                kvaVar.a(kvaVar.e, R.animator.video_zoom_snap_flash_title, kvaVar.g);
                this.l.I(3, new acqx(acsb.c(42165)), null);
            }
        }
        z(0);
    }

    private final void x(boolean z) {
        kva kvaVar;
        if (evr.G(this.g) || !z) {
            q(this.D);
        } else {
            y(this.D);
        }
        if (this.y == 3) {
            return;
        }
        if (z && this.x != 3 && (kvaVar = this.s) != null) {
            kvaVar.d();
            kvaVar.a(kvaVar.d, R.animator.video_zoom_snap_flash_indicator, kvaVar.f);
            TextView textView = kvaVar.e;
            if (textView != null) {
                textView.setText(R.string.video_zoom_snapped_title);
                kvaVar.e.sendAccessibilityEvent(8);
            }
            kvaVar.a(kvaVar.e, R.animator.video_zoom_snap_flash_title, kvaVar.g);
            this.l.I(3, new acqx(acsb.c(42164)), null);
        }
        z(3);
    }

    private final void y(float f) {
        float f2 = this.v;
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.t = ofFloat;
            ofFloat.setInterpolator(akaw.a);
            this.t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kuo
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    kur.this.q(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        } else {
            valueAnimator.setFloatValues(f2, f);
        }
        int i = 300;
        int min = Math.min(300, ((int) (Math.abs(f2 - f) * 500.0f)) + 100);
        if (min < 100) {
            afsi.b(1, 25, String.format(Locale.US, "SnapZoom animation duration=%d (possible int overflow); use default=%d instead. currentState=%d lastSettledState=%d playerViewAspectRatio=%s videoAspectRatio=%s videoWidth=%d videoHeight=%d start(currentScale)=%s end(snappedScale)=%s", Integer.valueOf(min), 300, Integer.valueOf(this.y), Integer.valueOf(this.x), Float.valueOf(this.e), Float.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C), Float.valueOf(f2), Float.valueOf(f)));
        } else {
            i = min;
        }
        this.t.setDuration(i);
        this.t.cancel();
        this.t.start();
    }

    private final void z(int i) {
        this.y = i;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                i = 3;
            }
        }
        this.x = i;
    }

    @Override // defpackage.obn
    public final Rect a(Rect rect) {
        if (this.G || this.A <= 0.0f) {
            return rect;
        }
        float f = this.v;
        if (f < 0.0f || Float.isNaN(f)) {
            return rect;
        }
        if (this.H == null) {
            this.H = new Rect();
        }
        fav.B(this.A, rect, this.H);
        Rect rect2 = this.H;
        fav.z(rect2, this.v, rect2);
        return this.H;
    }

    @Override // defpackage.aiva
    public final void d(int i, int i2) {
        if (this.B == i && this.C == i2) {
            return;
        }
        this.B = i;
        this.C = i2;
        float f = i / i2;
        this.A = f;
        this.c.b = f;
        r();
        m();
    }

    @Override // defpackage.kuw
    public final void f() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.t.cancel();
        }
        ((aabq) this.k.get()).r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ahef ahefVar) {
        aign c = ahefVar.c();
        boolean z = false;
        if (!c.h() && c.c(aign.READY) && c != aign.ENDED) {
            z = true;
        }
        if (this.z == z) {
            return;
        }
        this.z = z;
        this.c.e = z;
        r();
    }

    @Override // defpackage.obn
    public final void i(obd obdVar) {
        this.n.add(obdVar);
    }

    @Override // defpackage.obn
    public final void j(obd obdVar) {
        this.n.remove(obdVar);
    }

    @Override // defpackage.kuu
    public final void k(kva kvaVar, kux kuxVar) {
        this.u = true;
        this.s = kvaVar;
        this.d = kuxVar;
        kuxVar.e(this);
        ((aivb) this.h.get()).a(this);
        v();
    }

    @Override // defpackage.flm
    public final void kG() {
        if (this.j) {
            this.r.c();
        } else {
            this.f.m(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.f229J.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.removeOnLayoutChangeListener(this.m);
        }
    }

    @Override // defpackage.flm
    public final void kH() {
        if (this.I == fhg.NONE) {
            p();
        }
        if (this.j) {
            this.r.c();
            this.r.g(kI(this.o));
        } else {
            this.f.g(this);
        }
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.f229J.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.addOnLayoutChangeListener(this.m);
        }
        r();
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().b.Y(new ayrs(this) { // from class: kup
            public final /* synthetic */ kur a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.g((ahef) obj);
                } else {
                    this.a.r();
                }
            }
        }, ktf.e), aiocVar.G().j.Y(new ayrs(this) { // from class: kup
            public final /* synthetic */ kur a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.g((ahef) obj);
                } else {
                    this.a.r();
                }
            }
        }, ktf.e)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class, ahej.class};
        }
        if (i == 0) {
            g((ahef) obj);
            return null;
        }
        if (i == 1) {
            r();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) this.f229J.get()).aT;
        if (youTubePlayerViewNotForReflection != null) {
            youTubePlayerViewNotForReflection.p.requestLayout();
        }
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((obd) it.next()).a();
        }
    }

    @Override // defpackage.ahmf
    public final void nZ(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        this.c.d = z;
        r();
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        this.I = fhgVar;
        if (fhgVar == fhg.NONE) {
            p();
        }
        boolean z = this.F;
        boolean z2 = fhgVar == fhg.WATCH_WHILE_FULLSCREEN;
        this.F = z2;
        this.c.c = z2;
        if (z == z2) {
            return;
        }
        r();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    public final void p() {
        if ((((fof) this.p.c()).b & 1) == 0 || !((fof) this.p.c()).c) {
            this.v = -1.0f;
            z(0);
        } else {
            this.v = this.D;
            z(3);
        }
    }

    public final void q(float f) {
        if (this.v == f) {
            return;
        }
        this.v = f;
        m();
    }

    public final void r() {
        kva kvaVar;
        if (!this.u || this.I.m()) {
            return;
        }
        if (this.q.W().k()) {
            s();
            return;
        }
        if (this.c.a()) {
            float f = this.e / this.A;
            if (f <= 1.0f) {
                f = 1.0f / f;
            }
            this.D = f;
            this.E = ((f - 1.0f) * 0.33f) + 1.0f;
            kux kuxVar = this.d;
            if (kuxVar != null) {
                kuxVar.f = true;
            }
            int i = this.y;
            if (i == 0) {
                w(false);
                if (this.i && (((((fof) this.p.c()).b & 2) == 0 || !((fof) this.p.c()).d) && (kvaVar = this.s) != null)) {
                    if (kvaVar.h == null) {
                        kvaVar.d();
                        if (kvaVar.c != null) {
                            kvaVar.h = new akcv(View.inflate(kvaVar.a, R.layout.video_zoom_user_education, null), kvaVar.c, 4, 3);
                        }
                    }
                    akcv akcvVar = kvaVar.h;
                    if (akcvVar != null && !akcvVar.i()) {
                        Resources resources = kvaVar.a.getResources();
                        Rect rect = new Rect();
                        rect.offsetTo(resources.getDimensionPixelSize(R.dimen.video_zoom_user_education_left_offset), resources.getDimensionPixelSize(R.dimen.video_zoom_user_education_top_offset));
                        kvaVar.h.g(rect);
                    }
                    ynm.m(this.p.b(kfq.n), jun.q);
                }
            } else if (i == 3) {
                x(false);
            } else {
                w(false);
            }
            this.l.n(new acqx(acsb.c(42164)));
            this.l.n(new acqx(acsb.c(42165)));
            return;
        }
        s();
    }

    @Override // defpackage.kuw
    public final void t(boolean z) {
        if (z) {
            if (this.w > 1.0f) {
                x(true);
                return;
            } else {
                w(true);
                return;
            }
        }
        int i = this.y;
        if (i == 1) {
            w(true);
        } else if (i == 2) {
            x(true);
        }
    }

    @Override // defpackage.kuw
    public final void u(float f) {
        kva kvaVar;
        kva kvaVar2;
        if (evr.G(this.g)) {
            if ((-1.0f) + f > 0.01f) {
                x(false);
                return;
            } else {
                if (1.0f - f > 0.01f) {
                    w(false);
                    return;
                }
                return;
            }
        }
        float max = Math.max(Math.min(this.v * f, this.D + 0.02f), 0.98f);
        this.w = f;
        if (max >= this.E) {
            q(max);
            if (this.y != 2) {
                if (this.x != 3 && (kvaVar = this.s) != null) {
                    kvaVar.d();
                    kvaVar.a(kvaVar.d, R.animator.video_zoom_snap_threshold_indicator_show, null);
                    TextView textView = kvaVar.e;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                }
                z(2);
                return;
            }
            return;
        }
        q(max);
        int i = this.y;
        if (i == 1) {
            return;
        }
        if (i == 2 && this.x != 3 && (kvaVar2 = this.s) != null) {
            kvaVar2.c();
        }
        z(1);
    }
}
